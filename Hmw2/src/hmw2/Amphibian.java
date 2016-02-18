package hmw2;

public class Amphibian {
	
	public void jump(){
		System.out.println("Amphibian walking");
	}
	
	public void sing(){
		System.out.println("Amphibian singing");
	}
	
	public static void main(String[] args){
	 Amphibian amph = new Amphibian();
	 amph.jump();
	 amph.sing();
	}

}
