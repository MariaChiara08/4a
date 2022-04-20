import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void testFattoriale1() {
	//	fail("prova JUnit");
		Fattoriale f=new Fattoriale();
		int n=0;
		int risAtteso=1;
		int risOttenuto=f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto);
	  //assertEquals(1, f.fattoriale(n));
	}
	

	@Test
	public void testFattoriale2() {
	//	fail("prova JUnit");
		Fattoriale f=new Fattoriale();
		int n=1;
		int risAtteso=1;
		int risOttenuto=f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto);
	}
	

	@Test
	public void testFattoriale3() {
	//	fail("prova JUnit");
		Fattoriale f=new Fattoriale();
		int n=4;
		int risAtteso=24;
		int risOttenuto=f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto);
	  
	}



}
