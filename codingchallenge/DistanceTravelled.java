package codingchallenge;
import java.util.Scanner;


public class DistanceTravelled {
	
	public static void CalulateDistance(int t1,int t2) {
		int s,q,distancetravelled1,distancetravelled2;
		s=10;
		q=5;
		distancetravelled1=s*t1+((q*t1*t1)/2);
		distancetravelled2=s*t2+((q*t2*t2)/2);
		System.out.println("Distance Travelled 1: "+distancetravelled1);
		System.out.println("Distance Travelled 2: "+distancetravelled2);
	} 


	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	      int t1=sc.nextInt();
	      int t2=sc.nextInt();
	      CalulateDistance(t1,t2);

		// TODO Auto-generated method stub

	}

}
