package week1.day1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=8208, orginalNumber,remainder,result=0,n=0;
		orginalNumber=number;
		for (;orginalNumber != 0; orginalNumber /= 10, ++n);

		orginalNumber = number;
		
		for (;orginalNumber != 0;orginalNumber/= 10)
        {
            remainder = orginalNumber% 10;
            result += Math.pow(remainder, n);
        }

        if(result==number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

	}

}
