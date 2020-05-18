package interfaces;

public class DriverClass {

	public static void main(String[] args) {
		Provider provider = new Provider();
		
		//Shows polymorphism
		Laughable laughable = provider.getSomeone();
		laughable.laugh();

		//Check what is the actual type
		if (laughable instanceof Boy) {
			System.out.println("Its a boy");
			Boy boy=(Boy)laughable;
			boy.work();
			Laughable xx=boy;//upcasting, you needn't do it explicitly
		}
		else
			System.out.println("Its not a boy");

		if (laughable instanceof Girl) {
			System.out.println("Its a Girl");
			Girl girl=(Girl)laughable; //down casting
			girl.run();
		}
		else
			System.out.println("Its not a Girl");
		
		
	}

}
