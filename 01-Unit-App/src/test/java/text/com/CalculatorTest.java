package text.com;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import test.Calcultor;

public class CalculatorTest {
	
	@Test
	public void testAdd_01() {
		Calcultor c = new Calcultor();
		Integer actualResult =c.add(10,20);
		Integer expeactedResult=30;
		assertEquals(actualResult,expeactedResult);
	}
	
	@Test
	public void testAdd_02() {
		Calcultor c1=new Calcultor();
		Integer actualResult =c1.add(10,20);
		Integer expeactedResult=30;
		assertEquals(actualResult, expeactedResult);
		}
	
	@Test
	@Ignore
	public void testsub_01() {
		Calcultor calcultor = new Calcultor();
		Integer actualResult=calcultor.sub(10, 5);
		Integer expeactedResult=5;
		assertEquals(actualResult,expeactedResult);
	}
	
	@Test
	public void testMul_03() {
		Calcultor calcultor1=new Calcultor();
		Integer actualResult=calcultor1.Multiplay(2, 5);
		Integer expeactedResult=10;
		assertEquals(actualResult, expeactedResult);
	}
	
	@Test(expected = ArithmeticException.class)
	public void Div_04() {
	Calcultor calcultordiv= new Calcultor();
	Integer actualRestul=calcultordiv.Div(10, 0);
	Integer expeactedResult=5;
	assertEquals(actualRestul, expeactedResult);
		
	}
	

}
