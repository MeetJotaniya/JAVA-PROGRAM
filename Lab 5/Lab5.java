import java.util.*;


 class Time{
	int hour;
	int min;

	Time(){
		min=0;
		hour=0;
	}
	
	 Time(int hour,int min){
		this.hour=hour;
		this.min=min;
	}
	void add(Time x,Time y){
		this.hour=x.hour+y.hour;
		this.min=x.min+y.min;

		while(this.min>60){
			this.min -=60;
			this.hour++;
		}
		System.out.println("Added Time : "+this.hour+":"+this.min+);
	}
}
public class Lab5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter minute : ");
		int a=sc.nextInt();
		System.out.println("enter hour : ");
		int b=sc.nextInt();
		System.out.println("enter minute 2: ");
		int a2=sc.nextInt();
		System.out.println("enter hour 2: ");
		int b2=sc.nextInt();

		Time t1=new Time(a,b);
		Time t2=new Time(a2,b2);
	
		Time t3=new Time();

		t3.add(t1,t2);
	}
}
