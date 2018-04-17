package uy.ort.ob2018_1;


// Interfaz del sistema
// No modificar esta clase!!!!!!!!!
public interface ISistema {

	Retorno inicializarSistema (int maxPalabras);
	
	Retorno destruirSistema();
	
	Retorno analizarTexto(String texto);
	
	Retorno rankingPalabras(int n);
	
	Retorno aparicionesPalabra(String palabra);
	
	Retorno todasPalabras();
	
}
