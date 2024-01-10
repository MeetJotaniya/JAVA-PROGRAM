import java.util.*;
public class Lab2a {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("enter what you want to do...1 for addition, 2 for Multiplication, 3 for Difference,4 for Divison:");
		int n=sc.nextInt();

	    int sum=n1+n2;
	    int mul=n1*n2;
	    int dif=n1-n2;
	    int div=n1/n2;
	    if(n==1){
		System.out.println("sum is...");
		System.out.println(sum);}
		if(n==2){
		System.out.println("Multiplication is...");
		System.out.println(mul);}
		if(n==3){
		System.out.println("Difference is...");
		System.out.println(dif);}
		if(n==4){
		System.out.println("Divison is...");
		System.out.println(div);}

}
}