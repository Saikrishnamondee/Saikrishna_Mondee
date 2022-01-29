interface planvehicle 
	{
		void speed();
		void noofwheels();
		void noofGears();
		}
	abstract class fourwheeler implements planvehicle
	{
		 void vipers()
		{
			System.out.println("Forwheeler has vipers");
		}
		
	}
	abstract class twowheeler implements planvehicle{
		 void stand() {
			System.out.println("Two wheeler have stand");
		}
	 }

	 class Truck extends fourwheeler{
		

		public void speed() {
			System.out.println("Truck speed 40kms");
			}
		public void noofwheels() {
			System.out.println("Truck has 8 wheels");
			
		}

		public void noofGears() {
			System.out.println("Truck has 10 gears");
			
		}
	 }
	 class car extends fourwheeler{

				public void speed() {
					System.out.println("Car speed is 80kms");
					}
				public void noofwheels() {
					
					System.out.println("4 wheels");
					}

				
				public void noofGears() {
					System.out.println("Car has 6 gears");
					
				}
			 }
		 
		
		class Bike extends twowheeler{

			
			public void speed() {
				System.out.println("bike speed is 60kms");
			}

			
			public void noofwheels() {
				System.out.println("bike has 2 wheels");
				
			}

			
			public void noofGears() {
				System.out.println("bike has 5 gears");
				
			}
			

			
		}
class BiCycle extends twowheeler{

	
	public void speed() {
		System.out.println("Bicycle speed is 2 kms");

		
	}

	public void noofwheels() {
		System.out.println("Cycle has 2 wheels");
		
	}

	
	public void noofGears() {
		System.out.println(" Bicycle has no gears");
		
		
	}
		}
		
		
		
		 public class Interfacedemo {
		public static void main(String[] args) {
		
		System.out.println("This is Truck Details");
		
		Truck t =new Truck();
		t.speed();
		t.noofwheels();
		t.noofGears();
		t.vipers();
		System.out.println("\n");
		
		System.out.println("This is Car Details");
		
		car c =new car();
		c.speed();
		c.noofwheels();
		c.noofGears();
		c.vipers();
		
		System.out.println("\n");
		System.out.println("This is Bike Details");
		Bike b = new Bike();
		b.speed();
		b.noofwheels();
		b.noofGears();
		b.stand();
		System.out.println("\n");
		
		System.out.println("This is BiCycle Details");
		
		BiCycle bc = new BiCycle();
		bc.speed();
		bc.noofwheels();
		bc.noofGears();
		bc.stand();
		}

}

