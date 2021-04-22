public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}
	
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	public boolean esLleno() {
		return false;
	}

	 boolean esCompleto() {
		return false;
	}

	// imprime el árbol en inorden
	public void printInOrden() {
		if (this.tieneHijoIzquierdo()) {
			this.getHijoIzquierdo().printInOrden();
		}

		System.out.print(this.getDato() + " ");

		if (this.tieneHijoDerecho()) {
			this.getHijoDerecho().printInOrden();
		}
	}


	// imprime el árbol en preorden  
	public void printPreorden() {
		System.out.print(this.getDato() + " ");

		if (this.tieneHijoIzquierdo()) {
			this.getHijoIzquierdo().printPreorden();
		}
		
		if (this.tieneHijoDerecho()) {
			this.getHijoDerecho().printPostorden();
		}
	}

	// imprime el arbol en postorden
	public void printPostorden() {
		if (this.tieneHijoIzquierdo()) {
			this.getHijoIzquierdo().printPostorden();
		}

		if (this.tieneHijoDerecho()) {
			this.getHijoDerecho().printPostorden();
		}

		System.out.print(this.getDato() + " ");
	}

	// imprime en niveles
	public void printNiveles() {
		Queue<ArbolBinario<T>> queue = new Queue<>(new ListaEnlazadaGenerica<>());

		queue.enqueue(this);
		queue.enqueue(null);

		while (!queue.isEmpty()) {
			ArbolBinario<T> curr = queue.dequeue();

			if (curr != null) {
				System.out.print(curr.getDato() + " ");

				if (curr.tieneHijoIzquierdo()) {
					queue.enqueue(curr.getHijoIzquierdo());
				}

				if (curr.tieneHijoDerecho()) {
					queue.enqueue(curr.getHijoDerecho());
				}
			} else if (!queue.isEmpty()) {
				queue.enqueue(null);
				System.out.println();
			}

		}
	}

	// imprime nodos entre los niveles n y m inclusive.
	public void printEntre(int n, int m) {
		Queue<ArbolBinario<T>> queue = new Queue<>(new ListaEnlazadaGenerica<>());
		queue.enqueue(this);
		queue.enqueue(null);

		int nivelActual = 0;
		while (!queue.isEmpty() && nivelActual <= m) {
			ArbolBinario<T> curr = queue.dequeue();

			if (curr != null) {
				if (nivelActual >= n) {
					System.out.print(curr.getDato() + " ");
				}

				if (curr.tieneHijoIzquierdo()) {
					queue.enqueue(curr.getHijoIzquierdo());
				}

				if (curr.tieneHijoDerecho()) {
					queue.enqueue(curr.getHijoDerecho());
				}
			} else if (!queue.isEmpty()) {
				queue.enqueue(null);
				if (nivelActual++ >= n) {
					System.out.println();
				}
			}
		}
	}

	public int contarHojas() {
		if (this.esHoja()) {
			return 1;
		}

		int hojas = 0;
		if (this.tieneHijoDerecho()) {
			hojas = hojas + this.getHijoDerecho().contarHojas();
		}
	
		if (this.tieneHijoIzquierdo()) {
			hojas = hojas + this.getHijoIzquierdo().contarHojas();
		}

		return hojas;
	}

	// retorna un árbol invertido
	public ArbolBinario<T> espejo() {
		if (this.esVacio()) return null;

		ArbolBinario<T> root = new ArbolBinario<>(this.getDato());

		if (this.tieneHijoIzquierdo()) {
			root.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
		}

		if (this.tieneHijoDerecho()) {
			root.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
		}

		return root;
	}

}
