//problem 1 -> Polymorphism

package hmw2;

public class People {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Salary();
		
		e.pay();
		
		// Salary s = (Salary)e; for downcasting
		
		//s.pay(); -> for downcasting

	}

}
