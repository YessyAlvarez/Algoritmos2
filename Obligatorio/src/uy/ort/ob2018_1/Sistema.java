package uy.ort.ob2018_1;

import uy.ort.ob2018_1.Retorno.Resultado;

public class Sistema implements ISistema {
	
	private Lista ListaABC;
	private Lista RankinPalabras;
    private int maxCPalabras;

	public Retorno inicializarSistema (int maxPalabras) {
		 Retorno retorno = new Retorno();
		 maxCPalabras = maxPalabras;
         if(maxCPalabras>=0){
        	 ListaABC = new Lista();
        	 RankinPalabras = new Lista();
             /**
              * Las otras estructuras de tipo Arbol ??
              */
             retorno.resultado = Resultado.OK;
         }else if(maxCPalabras<1){
        	 destruirSistema();
             retorno.resultado = Resultado.ERROR_1;
         }else{
        	 retorno.resultado = Resultado.NO_IMPLEMENTADA;
         }
         return retorno;
	}
	
	public Retorno destruirSistema() {
		Retorno retorno = new Retorno();
		ListaABC = null;
		RankinPalabras = null;
	    maxCPalabras = 0;
		retorno.resultado = Resultado.OK;
		return retorno;		
	}

	public Retorno analizarTexto(String texto) {
		Retorno retorno = new Retorno();
		//Verifico que el sistema exista
		if(this.ListaABC==null) {
			retorno.resultado = Resultado.NO_IMPLEMENTADA;
		} else if(texto.length()==0) { 	//Verifico que el texto no sea vacio
			retorno.resultado = Resultado.ERROR_1;
		} else {
			int insertarOK = 0;
			//Convierto el texto en minuscula
			texto = texto.toLowerCase();
			//Parseo el texto
			String [] palabras = texto.split("[:.,()?¿!¡ ]");
			int palabrasProcesar = palabras.length;		
			for(int i=0; i<palabrasProcesar; i++) {
				insertarOK += ListaABC.insertarElemento(palabras[i]);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			if(insertarOK>0) {
				retorno.resultado =Resultado.ERROR_2; //No se pudo insertar
			} else {
				retorno.resultado =Resultado.OK;
			}
		}
		return retorno;
	}

	public Retorno rankingPalabras(int n) {
		// ToDo: Implementar aqui el metodo
		return new Retorno(Resultado.NO_IMPLEMENTADA);
	}

	public Retorno aparicionesPalabra(String palabra) {
		// ToDo: Implementar aqui el metodo
		return new Retorno(Resultado.NO_IMPLEMENTADA);
	}

	public Retorno todasPalabras() {
		// ToDo: Implementar aqui el metodo
		return new Retorno(Resultado.NO_IMPLEMENTADA);
	}
	
}
