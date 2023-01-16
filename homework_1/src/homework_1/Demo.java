package homework_1;

public interface Demo {
	
	public  void method2();
	
}
		
		 class Interfacecl implements Demo{
			 public void method2() {
				 System.out.println("how r u?");
			 }
			 public static void main(String[] args) {
					
			       Interfacecl h1 = new Interfacecl();
			       h1.method2();
			         
			       //In short we cannot define abstract method in non-abstract class.
			      // it would be only permitted to abstract classes.
			       }
		 }


