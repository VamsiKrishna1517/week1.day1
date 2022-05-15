package week1.day1.assignments;

public class TwoWheeler {
	

 public int noOfWheels=2;
 public short noOfMirrors=2;
 public long chassisNumber=98745618904l;
 public boolean isPunctured=false;
 public String bikeName="Harley Davidson";
 public double runningKM=3146.789;
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler bike= new TwoWheeler();
		System.out.println("No Of Wheels:-"+bike.noOfWheels);
		System.out.println("No Of Mirrors:-"+bike.noOfMirrors);
		System.out.println("ChassisNumber:-"+bike.chassisNumber);
		System.out.println("Is Bike punctured:-"+bike.isPunctured);
		System.out.println("Bike Name:-"+bike.bikeName);
		System.out.println("Bike running KM:-"+bike.runningKM);
		

	}

}
