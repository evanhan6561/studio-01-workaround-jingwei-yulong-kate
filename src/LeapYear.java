
import support.cse131.ArgsProcessor;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int n1 = ap.nextInt("Input a year?");
		boolean isLeap = (((n1%4 == 0)&&(n1%100 != 0))||((n1%400 == 0)));
		System.out.print(n1+" is a leap year: "+isLeap);
	}

}
