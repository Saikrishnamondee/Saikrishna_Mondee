

	
	interface planvehicle 
	{
		void noofengines();
		void nofwheels();
		
	}
	abstract class fourwheeler implements planvehicle
	{
		public void noofengines()
		{
			System.out.println("one engine");
			
		}
	}
		 class lorry extends fourwheeler{
			public void nofwheels() {
				System.out.println("8 wheels");
			}
		 }
		 class car extends fourwheeler{
				public void nofwheels() {
					System.out.println("4 wheels");
				}
			 }
		 
		abstract class twowheeler implements planvehicle{
				public void nofwheels() {
					System.out.println("2 wheels");
				}
			 }
		class bike extends twowheeler{
			

			public void noofengines() {
				System.out.println("one engine");
				
				
			}
		}
class bicycle extends twowheeler{
			

			public void noofengines() {
				System.out.println("NO engine");
				
				
			}
		}
		
		
		
		 public class Interfacedemo {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("for Lorry");
		lorry l =new lorry();
		l.nofwheels();
		l.noofengines();
		System.out.println("_______________");
		System.out.println("for Car");
		car c = new car();
		c.nofwheels();
		c.noofengines();
		System.out.println("_______________");
		System.out.println("for bike");
		bike b =new bike();
		b.nofwheels();
		b.noofengines();
		System.out.println("_______________");
		System.out.println("for bicycle");
		bicycle  bc = new bicycle();
		bc.nofwheels();
		bc.noofengines();
		
		
	}

}

