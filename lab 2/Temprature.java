import java.util.*;
public class Temprature{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Temprature in  Fahrenheit : ");
		double f=sc.nextDouble();
		double c = f-32*5/9;
		System.out.println("Temprature in celcius...");
		System.out.println(c);
	}
}