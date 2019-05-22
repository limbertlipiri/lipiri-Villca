package ejemplos;
import jade.core.Agent;
import jade.core.behaviours.*;
import java.util.Scanner;
public class Comportamientos  extends Agent{
	
float suma=0,a=0,b=0;float division=0;
		
				
	protected void setup(){
		Scanner l=new Scanner(System.in);
	System.out.println("ingrese a");
	 a=l.nextFloat();
	System.out.println("ingrese b");
	 b=l.nextFloat();
	
	addBehaviour(new Micomportamiento());
	}
		private class Micomportamiento extends Behaviour{
	 		
			public void action(){
				suma=a+b;
				addBehaviour(new Micomportamiento2());
				
				System.out.println("La suma es  "+suma);		
			}
			public boolean done(){
			
			return true;
			}
		}
		private class Micomportamiento2 extends Behaviour{
	 	
			public void action(){
				addBehaviour(new Micomportamiento3());
				System.out.println("la resta es: "+(a-b));	
					
			}
			public boolean done(){
			
			return true;
			}
		}
		private class Micomportamiento3 extends Behaviour{
	 	
			public void action(){
				addBehaviour(new Micomportamiento4());
				System.out.println("la multiplicacion es: "+(a*b));	
				
			}
			public boolean done(){
			
			return true;
			}
		}
			private class Micomportamiento4 extends Behaviour{
	 	
			public void action(){
				division=a/b;
				System.out.println("la division es: "+division);	
				
			}
			public boolean done(){
			
			return true;
			}
		}
}
		
	
