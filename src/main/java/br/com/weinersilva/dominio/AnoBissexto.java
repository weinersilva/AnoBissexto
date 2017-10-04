package br.com.weinersilva.dominio;

public class AnoBissexto {
	
	public boolean VerificaAnoBissexto(int ano ) {
		boolean resultado = false;
		
			if( ano != 0 ) {
			
				if((ano % 400 == 0 ) || (ano % 4 == 0 && ano % 100 != 0 )){
					resultado = true;
			}
		}
			return resultado;

	}

}
