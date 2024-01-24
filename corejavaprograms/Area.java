package corejavaprograms;
import java.util.Scanner;
public class Area {
	float area;
	Scanner sc = new Scanner(System.in);
	public void circle()
	{

		float radius;

		System.out.println("Enter radius : ");
		radius = sc.nextFloat();
		area = 3.14f * radius * radius;
		System.out.println("Area of  circle : "+area);

	}

	 

	public int square()

	{
		int side;

		System.out.println("Enter side : ");

		side = sc.nextInt();

		return side*side; 

	}



	public void rectangle(int length, int breadth)

	{
		System.out.println("Area of rectangle :"+(length*breadth));

	}

	

	public float triangle(float base,float height)

	{

		area = 0.5f * base * height;

		return area;

	}



	public static void main(String[] args) {
		Area area = new Area();

		area.circle();

		int ar = area.square();

		System.out.println("Area of Square : "+ar);

			

		int length,breadth;

		Scanner sc = new  Scanner(System.in);

		System.out.println("Enter length and breadth :");

		length = sc.nextInt();

		breadth = sc.nextInt();

		

		area.rectangle(length, breadth);

		

		float tr = area.triangle(3.8f, 2.6f);

		System.out.println("Area of triangle: "+tr);


		// TODO Auto-generated method stub

	}

}
