package br.com.weinersilva.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.weinersilva.dominio.AnoBissexto;

public class AnoBissextoTest {
	 AnoBissexto ano = new AnoBissexto();
	 
	 @Test
	 public void AnoNegativo(){
		 Assert.assertFalse(ano.VerificaAnoBissexto(-1));
	 }
	 
	 
	 @Test
	 public void AnoZero(){
		 Assert.assertFalse(ano.VerificaAnoBissexto(0));
	 }
		 
	 @Test
	 public void AnoBissexto(){
		   	     	   
    	   Assert.assertTrue(ano.VerificaAnoBissexto(2016));
    	   
	 }
	 
	 @Test
	 public void AnoNaoBissexto(){
    	   
    	   Assert.assertFalse(ano.VerificaAnoBissexto(2015));
    	   
       }
	 
	 
}
