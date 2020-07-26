package Singleton;

public class Earlyinstantiation 
{
	private static Earlyinstantiation obj=new Earlyinstantiation();// instance will be created at load time 
	
	 private Earlyinstantiation(){}  
	   
	 public static Earlyinstantiation getA()
	 {  
		 return obj;  
	 }  
	  
	 public void doSomething()
	 {  
	 System.out.println("Object is created at load time"); 
	 }
	 
	 
	 
	 public static void main(String args[])
	 {
	 	Earlyinstantiation obj1=Earlyinstantiation.getA();
	 	obj1.doSomething();
	 	
	 }

}