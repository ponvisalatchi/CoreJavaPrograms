package assessmentquestion;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,i,j;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=a-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
				{
				System.out.print(i+" ");
				}
			System.out.println();
		}
		for(i=1;i<=b;i++)
		{
			for(j=1;j<=b-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
				{
				System.out.print(i+" ");
				}
			System.out.println();
		}
		for(i=1;i<=c;i++)
		{
			for(j=1;j<=c-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
				{
				System.out.print(i+" ");
				}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
