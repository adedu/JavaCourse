package hmw2;
// Polymorphism - Problem 2

public class Plants {
	
	public void plant(){
       System.out.println("A seed needs to be planted: ");
       this.grows();
	}
	
	public void grows(){
		System.out.println("A plant needs to grow after the seed was planted: ");
	}

}
