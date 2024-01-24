

package codingchallenge;
import java.util.Scanner;

public class SecSmallest {
	public int getSecondSmallest(int[] arr)
	{
		int temp,i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		return arr[1];
		
	}

	public static void main(String[] args) {
		SecSmallest s1=new SecSmallest();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size;
		size=sc.nextInt();
		int[] array=new int[size];
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
			
		}
		int output=s1.getSecondSmallest(array);
		System.out.println("Second Smallest number is: " +output);

	}

}
