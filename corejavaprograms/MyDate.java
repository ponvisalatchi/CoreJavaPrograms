package corejavaprograms;

public class MyDate {
	int  dd,mm,yy;
	public MyDate()
	{
		dd=30;

		mm=11;

		yy=2000;

	}

	public MyDate(int dd, int mm, int yy ) {

		 this.dd = dd;

		 this.mm = mm;

		 this.yy = yy;

	}

	

	public void display()

	{

		System.out.println("Date : "+dd+"-"+mm+"-"+yy);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
