
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
		public void nofwheels() {
			System.out.println("8 wheels");
		}

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
class fourwheelerFactory{
	fourwheeler getfourwheeler(String fwheeler)
	{
		if(fwheeler.equals("Truck"))
			return new Truck();
		if(fwheeler.equals("car"))
			return new car();
		return null;
	}
}
class twowheelerFactory{
	twowheeler gettwowheeler(String twheeler)
	{
		if(twheeler.equals("Bike"))
			return new Bike();
		if(twheeler.equals("BiCycle"))
			return new BiCycle();
		return null;
	}
}
		
		
		
		 public class Interfacedemo2 {
		public static void main(String[] args) {
			
			fourwheelerFactory fwf = new fourwheelerFactory();
			fourwheeler f = fwf.getfourwheeler("car");
			f.speed();
			f.noofwheels();
			f.noofGears();
			f.vipers();
		System.out.println("\n");
			
			twowheelerFactory twf = new twowheelerFactory();
			twowheeler tf = twf.gettwowheeler("BiCycle");
			tf.speed();
			tf.noofwheels();
			tf.noofGears();
			tf.stand();
			
		

}
		 }
