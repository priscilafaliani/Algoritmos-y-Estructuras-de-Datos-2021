package arbol;


public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {
		return this.dato == null && !this.tieneHijos();
	}	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	private void _preOrden(ArbolGeneral<T> root, ListaEnlazadaGenerica<T> elementos) {
		// si es vacío no hay nada que procesar
		if (!root.esVacio()) {

			// agrego la raíz a la lista
			elementos.agregarFinal(root.getDato());

			// proceso todos sus hijos
			if (root.tieneHijos()) {
				ListaGenerica<ArbolGeneral<T>> hijos = root.getHijos();
				hijos.comenzar();

				while (!hijos.fin()) {
					ArbolGeneral<T> curr = hijos.proximo();
					_preOrden(curr, elementos);
				}
			}
		}
	}

	/**
	 * Procesa la raíz, luego los hijos.
	 */
	public ListaEnlazadaGenerica<T> preOrden() {
		ListaEnlazadaGenerica<T> elementos = new ListaEnlazadaGenerica<>();
		ArbolGeneral<T> root = this;
		_preOrden(root, elementos);
		return elementos;
	}

	private void _postOrden(ArbolGeneral<T> root, ListaEnlazadaGenerica<T> elementos) {
		// si es vacío no hay nada que procesar.
		if (!root.esVacio()) {

			// si tiene hijos, los tengo que procesar primero
			if (root.tieneHijos()) {
				
				// obtengo los hijos
				ListaGenerica<ArbolGeneral<T>> hijos = root.getHijos();
				hijos.comenzar();

				// proceso todos los hijos primero
				while (!hijos.fin()) {
					ArbolGeneral<T> hijo = hijos.proximo();
					_postOrden(hijo, elementos);
				}
			}

			// agrego la raiz a la lista
			elementos.agregarFinal(root.getDato());
		}
	}

	public ListaEnlazadaGenerica<T> postOrden() {
		ListaEnlazadaGenerica<T> elementos = new ListaEnlazadaGenerica<>();
		ArbolGeneral<T> root = this;
		_postOrden(root, elementos);
		return elementos;
	}

	private void _inOrden(ArbolGeneral<T> root, ListaEnlazadaGenerica<T> elementos) {
		// si el árbol está vacío, no tengo que procesar nada
		if (!root.esVacio()) {

			ListaGenerica<ArbolGeneral<T>> hijos = null;

			// si tiene hijos, inicializo la variable 'hijos'
			// y proceso el primero
			if (root.tieneHijos()) {
				hijos = root.getHijos();
				hijos.comenzar();
				_inOrden(hijos.proximo(), elementos);
			}

			// agrego la raiz a lista
			elementos.agregarFinal(root.getDato());

			// si quedan hijos a la derecha
			// los proceso
			if (hijos != null) {
				while (!hijos.fin()) {
					ArbolGeneral<T> hijo = hijos.proximo();
					_inOrden(hijo, elementos);		
				}
			}
		}
	}

	public ListaEnlazadaGenerica<T> inOrden() {
		ListaEnlazadaGenerica<T> elementos = new ListaEnlazadaGenerica<>();
		ArbolGeneral<T> root = this;
		_inOrden(root, elementos);
		return elementos;
	}

	public ListaEnlazadaGenerica<T>  recorridoPorNiveles() {
		ListaEnlazadaGenerica<T> elementos = new ListaEnlazadaGenerica<>();
		Queue<ArbolGeneral<T>> queue = new Queue<>();
		queue.enqueue(this);
		queue.enqueue(null);

		while (!queue.esVacia()) {
			ArbolGeneral<T> actual = queue.dequeue();
			
			if (actual != null) {
				elementos.agregarFinal(actual.getDato());

				if (actual.tieneHijos()) {
					actual.hijos.comenzar();
					while (!actual.hijos.fin()) {
						queue.enqueue(actual.hijos.proximo());
					}
				}
			} else if (!queue.esVacia()) {
				queue.enqueue(null);
				// agrega una marca que denota fin de un nivel
				elementos.agregarFinal(null);
			}
		}
		
		return elementos;
	}

	
	public void encolarHijos(ArbolGeneral<T> arbol, Queue<ArbolGeneral<T>> queue) {
		if (arbol.tieneHijos()) {
			arbol.getHijos().comenzar();

			while (!arbol.getHijos().fin()) {
				queue.enqueue(arbol.getHijos().proximo());
			}
		}
	}
	
	// no falta verificar que el árbol no sea vacío ??? D:
	public Integer altura() {
		Queue<ArbolGeneral<T>> queue = new Queue<>();
		queue.enqueue(this);
		queue.enqueue(null);

		int altura = 0;
		while (!queue.esVacia()) {
			ArbolGeneral<T> actual = queue.dequeue();

			if (actual != null) {
				encolarHijos(actual, queue);
			} else if (!queue.esVacia()) {
				queue.enqueue(null);
				altura++;
			}
		}

		return altura;
	}

	public Integer nivel(T dato) {
		Queue<ArbolGeneral<T>> queue = new Queue<>();
		queue.enqueue(this);
		queue.enqueue(null);

		int nivel = 0;

		while (!queue.esVacia()) {
			ArbolGeneral<T> actual = queue.dequeue();

			if (actual != null) {
				if (actual.getDato() == dato) {
					return nivel;
				}

				encolarHijos(actual, queue);
			} else if (!queue.esVacia()) {
				queue.enqueue(null);
				nivel++;
			}
		}

		// no encontró el dato
		return -1;
	}

	public Integer ancho() {
		Queue<ArbolGeneral<T>> queue = new Queue<>();
		queue.enqueue(this);
		queue.enqueue(null);

		int nodosNivel = 0;
		int ancho = 0;

		while (!queue.esVacia()) {
			ArbolGeneral<T> actual = queue.dequeue();

			if (actual != null) {
				nodosNivel++;
				encolarHijos(actual, queue);
			} else if (!queue.esVacia()) {
				if (nodosNivel > ancho) {
					ancho = nodosNivel;
				}
				nodosNivel = 0;
				queue.enqueue(null);
			}
		}

		// el último nivel no se compara en el while
		return nodosNivel > ancho ? nodosNivel : ancho;
	}

	public ListaEnlazadaGenerica<T> obtenerCamino(T dato) {
		ListaEnlazadaGenerica<T> lista = new ListaEnlazadaGenerica<>();

		// si encontró el dato o llego al final del camino
		if (this.getDato() == dato || this.esHoja()) {

			// si encontró el dato, se retorna en la lista
			if (this.getDato() == dato) {
				lista.agregarFinal(this.getDato());
			}

			return lista;
		}

		// si no, tenemos que recorrer todos los caminos que queden
		// mientras no encontremos el dato y mientras hayan caminos
		this.getHijos().comenzar();
		while (!this.getHijos().fin() && lista.esVacia()) {
			lista = this.getHijos().proximo().obtenerCamino(dato);

			// se encontró el dato en el camino 
			if (!lista.esVacia()) {
				lista.agregarInicio(this.getDato());
			}
		}

		return lista;
	}

	public boolean esAncestro(T a, T b) {
		ListaEnlazadaGenerica<T> camino = obtenerCamino(b);
		return !camino.esVacia() && camino.incluye(a);
	}


}