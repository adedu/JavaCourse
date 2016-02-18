package hmw2;

public class Frog extends Amphibian{
	
	public static void main(String[] args){
		Frog frog = new Frog();
		// frog.jump();
		// frog.sing();
		Amphibian a = new Frog(); // upcasting 
		a.jump();
		a.sing();
	}

}
