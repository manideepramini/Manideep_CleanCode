import static org.junit.Assert.*;

import org.junit.Test;

public class Area_ConstructionTest {
private static double DELTA=1e-15;
@Test
public void areatest() {
Area_Construction ar=new Area_Construction();
String t="standardmaterials";
if(t=="Standardmaterial") {
assertEquals(12000,ar.standardmaterials("standardmaterials",10),DELTA);
}
assertEquals(15000,ar.abstandardmaterial("abstandardmaterial",10),DELTA);
}

}