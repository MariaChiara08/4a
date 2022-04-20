import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {
	
	private Fattoriale f;
	private int n,risAtteso,risOttenuto;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		f=new Fattoriale();
		System.out.println("@Before");
	}

	@After
	public void tearDown() throws Exception {
		assertEquals(risAtteso, risOttenuto);
		System.out.println("@After");
	}

	@Test
	public void testFattoriale1() {
		//fail("test1");
		//Fattoriale f=new Fattoriale();
		 n=4;
		 risAtteso=24;
		 risOttenuto=f.fattoriale(n);
	//	assertEquals(risAtteso, risOttenuto);
	}

	@Test
	public void testFattoriale2() {
	//	fail("test2");
	//	Fattoriale f=new Fattoriale();
		 n=1;
		risAtteso=1;
		 risOttenuto=f.fattoriale(n);
	//	assertEquals(risAtteso, risOttenuto);
	  
	}

	@Test
	public void testFattoriale3() {
	//	fail("test3");
		//Fattoriale f=new Fattoriale();
		 f=new Fattoriale();
		 n=0;
		 risAtteso=1;
		 risOttenuto=f.fattoriale(n);
	//	assertEquals(risAtteso, risOttenuto);
	  
	}


}
