package hmw2;

public class Problem3 {
	
	// no default constructor is defined
	
	//Problem3(){
		//System.out.println("Problem3 onstructor");
	//}
	
	public void call(){
		
		System.out.println("Default constructor is created by compiler when missing");
	}
	
	public static void main(){
		Problem3 obj = new Problem3();//this calls the Problem3's constructor
		obj.call();
	}

}
