package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;


public class AssertTest {
	
	 @Test
	public void test() {
		
		 // assertTrue, verifica se o parametro informado é verdadeiro.
		 Assert.assertTrue(!false);
		 
		 // assertFalse, verifica se o parametro informado é falso.
		Assert.assertFalse(false); 

//Inicio Falando sobre assertEquals
		
		// assertEquals, verifica se os dois parametros informados são iguais.
		Assert.assertEquals(1, 1);
		
		// O terceiro parametro passado é chamado de Delta, ele compara a quantidade de casas decimais de um double.
		Assert.assertEquals(0.51234, 0.5123, 0.0001);
		
		// Cada tipo primitivo tem sua representação em objeto (conhecido como classes Wrappers). 
		int i = 5;
		Integer i2 = 5;
		
		//Para comparar um tipo primitivo com um tipo objeto precisamos fazer a conversão entre eles
		Assert.assertEquals(Integer.valueOf(i), i2);
		Assert.assertEquals(i, i2.intValue());
		
		//Para Strings
		Assert.assertEquals("bola","bola");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 1");
		Usuario u3 = null;
		
		
		// Para comparar dois objetos declarados com nomes diferentes a classe Usuário no caso precisa possuir o método equals
		Assert.assertEquals(u1, u2);
	
		Assert.assertNull(u3);
		
	}
}
