package uy.ort.ob2018_1;

public interface ILista {

	boolean esVacia();
	void agregarInicio(int n);
	void agregarFinal(int n);
	int insertarElemento(String dato);
	void borrarInicio();
	void borrarFin();
	void vaciar();
	void mostrar();
	void agregarOrd(int n);
	void borrarElemento(int n);
	int cantElementos();
	NodoLista obtenerElemento(int n);
	void mostrarREC(NodoLista l);
	void mostrarInversoREC(NodoLista l);
	boolean existeDatoREC(NodoLista l, int n);
	
	
}