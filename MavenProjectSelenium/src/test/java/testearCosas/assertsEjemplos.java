package testearCosas;

import org.junit.Assert;
import org.junit.Test;

public class assertsEjemplos {
	//Atributos
	private int numerouno = 5;
	private int numerodos = 3;
	//private int result = numerouno + numerodos;
	
	@Test
	public void testNumeroVerdadero() {
		Assert.assertTrue(numerouno==numerodos+2);
		//System.out.println(result);
	}
	@Test
	public void testNumeroFalso() {
		Assert.assertFalse(numerouno==numerodos);
		
	}
	@Test
	public void testNumerosIguales() {
		Assert.assertEquals(numerouno+10, numerodos+12);
	}
	@Test
	public void testNumerosNoIguales() {
		Assert.assertEquals(numerouno+1, numerodos*514 );
	}
	@Test
	public void testNONull() {
		//Objeto
		//Personas persona = new Personas("joel","cavada");
	}
}
