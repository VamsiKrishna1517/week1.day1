package week1.day1.assignments;

public class Car {
	
	public void applyBreak() {
		System.out.println("Break has applied");// print the output in console
	
	}
	public void applyGear() {
		System.out.println("Gear has chanaged");// print the output in console
	
	}
	public void switchonAC() {
		System.out.println("AC has switched on");// print the output in console
	
	}
	public void applyAccelarate() {
		System.out.println("Accelaration increased");// print the output in console
	
	}
	public static void main(String[] args) {
		
		// create object
		Car cr= new Car();// cr() is a constructor
		cr.applyBreak();
		cr.applyGear();
		cr.switchonAC();
		cr.applyAccelarate();
		
		
	}
}


