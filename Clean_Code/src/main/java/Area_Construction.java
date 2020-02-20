
public class Area_Construction {
	public static double standardmaterials(String material,double area)
	{
		if(material=="standardmaterials")
			return area*1200;
		    return 0;
	}
	 public static double abstandardmaterial(String material,double area)
	 {
		 if(material=="abstandardmaterial")
		 {
			 return area*1500;
			 
		 }
		 return 0;
	 }
	 public static double hstandardmaterial(String material,double area)
	 {
		 if(material=="hstandardmaterial")
		 {
			 return area*1800;
			 
		 }
		 return 0;
	 }
	 public static double standard_material_fully_home(String material,double area)
	 {
		 return area*2500;
	 }
	 

}
