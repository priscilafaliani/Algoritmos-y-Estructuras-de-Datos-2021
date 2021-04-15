package tp03.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ColaGenerica;

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

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
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

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	

	public boolean esLleno() {
		return false;
	}

	 boolean esCompleto() {
		return false;
	}

	
	// imprime el árbol en preorden  
	public void printPreorden() {
		
	}

	// imprime el �rbol en postorden
	public void printPostorden() {
		
	}


	public void recorridoPorNiveles() {
		
	}

	

	public ListaGenerica<T> frontera() {
		ListaGenerica<T> l = new ListaEnlazadaGenerica<T>();

		return l;
	}

	
	
	
	public int contarHojas() {

		if (this.esHoja()) return 1;

		int hojas = 0;
		if (tieneHijoDerecho()) {
			hojas = hojas + getHijoDerecho().contarHojas();
		}
		if (tieneHijoIzquierdo()) {
			hojas = hojas + getHijoIzquierdo().contarHojas();
		}
		return hojas;
	}

	public ArbolBinario<T> espejo() {

		if (this.esVacio()) {
			return new ArbolBinario<>();
		}

		ArbolBinario<T> a =  new ArbolBinario<>(this.getDato());
		a.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
		a.agregarHijoIzquierdo(this.getHijoDerecho().espejo());

		return a;
	}

	public void entreNiveles(int n, int m) {

		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<>(new ListaEnlazadaGenerica<>());
		cola.encolar(this);

		int nivel = 0;
		while (!cola.esVacia()) {
			ArbolBinario<T> actual = cola.desencolar();

			if (nivel > m) {
				break;
			}

			if (nivel >= n) {
				System.out.println(actual.getDato());
			}


			if (actual.tieneHijoDerecho()) {
				cola.encolar(actual.getHijoDerecho());
			}
			if (actual.tieneHijoIzquierdo()) {
				cola.encolar(actual.getHijoIzquierdo());
			}

			nivel++;
		}

	}
	

}
