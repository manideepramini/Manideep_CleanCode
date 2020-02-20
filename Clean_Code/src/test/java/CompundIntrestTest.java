import static org.junit.Assert.*;

import org.junit.Test;

public class CompundIntrestTest {
	
private static final double DELTA=1e-15;
@Test
public void Compoundtest() {
CompundIntrest ci= new CompundIntrest();
assertEquals(828.0000000000002,ci.compund_intrest(1200,30,2),DELTA);
}

}

