package MavenProyectTest.quickstart;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
//import org.junit.Ignore;

public class UnitTestExample {
	
	//@Ignore
	@Test
	public void simpleTest(){
		String str = "Junit is working fine";
		assertEquals("Junit is working fine", str);
	}
}
