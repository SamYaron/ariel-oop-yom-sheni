package lesson4;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class MonomJunit {

	@Test
	public void testPrint() {
		double coefficient = 5;
		int power = 2;
		Monom m = new Monom(coefficient,power);
		String s = m.toString();
		assertThat(s, is("5.0x^2"));
	}
	
	@Test
	public void testDerivative() {
		double coefficient = 5;
		int power = 2;
		Monom m = new Monom(coefficient,power);
		assertThat(m.getDerivative().toString(), is("10.0x"));
	}

}
