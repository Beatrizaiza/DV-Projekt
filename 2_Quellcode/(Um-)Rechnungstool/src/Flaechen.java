
public class Flaechen {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rechteck  d= new Rechteck();
        // Calling
        d.Area(40, 300);
        d.Area(4.4, 2.1);
        
        Circle d1 = new Circle();
        // Calling
        d1.Area(6);
        d1.Area(6.6);
        
        Quadrat d2 = new Quadrat();
        // Calling
        d2.Area(10);
        d2.Area(3.1);
		 
	}}

// f�r jedes object eine classe:
	class Quadrat 
	{
	   
	    void Area(double l)
	    {
	        System.out.println("Fl�che des Quadrats: "+ l * l);
	    }
	    
	    void Area(float l)
	    {
	        System.out.println("Fl�che des Quadrats: "+ l * l);
	    }
	}
	
	class Circle 
	{
	    static final double PI = Math.PI;
	  
	    void Area(double r)
	    {
	        double A = PI * r * r;
	  
	        System.out.println("Der Fl�cheninhalt des Kreises betr�gt :" + A);
	    }
	  
	    void Area(float r)
	    {
	        double A = PI * r * r;
	  
	        System.out.println("Der Fl�cheninhalt des Kreises betr�gt :" + A);
	    }
	}
	
	class Rechteck 
	{   
	    void Area(double l, double b)
	    {
	        System.out.println("Fl�che des Rechtecks: " + l * b);
	    }
	    
	    void Area(int l, int b)
	    {
	        System.out.println("Fl�che des Rechtecks: " + l * b);
	    }
	}
	
