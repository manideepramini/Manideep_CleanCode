import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleIntrestTest {

	private static final double DELTA=1e-15;
	@Test
	public void testSimpleIntrest()
	{
		SimpleIntrest si=new SimpleIntrest();
		assertEquals(800,si.simple_intrest(2000,10,4),DELTA);
	}

}
