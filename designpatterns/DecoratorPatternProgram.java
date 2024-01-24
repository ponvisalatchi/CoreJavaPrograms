package designpatterns;

import java.util.Scanner;

interface Food{
	String prepareFood();
	float foodPrice();
}
class VegFood implements Food{
	@Override
	public String prepareFood() {
		return "Curd and Pickle";
	}
	@Override
	public float foodPrice() {
		return 0.0f;
	}
}
class FoodDecorator implements Food{
	private Food food;
	public FoodDecorator(Food food) {
		super();
		this.food=food;
	}
	@Override
	public String prepareFood()
	{
		return food.prepareFood();
	}
	@Override
	public float foodPrice()
	{
		return food.foodPrice();
	}
}
class NonVegFood extends FoodDecorator{
	public NonVegFood(Food food) {
		super(food);
	}
	@Override
	public String prepareFood()
	{
		return super.prepareFood()+"Roaster Chicken";
	}
	@Override
	public float foodPrice()
	{
		return super.foodPrice()+250;
	}
}
class ChineeseFood extends FoodDecorator{
	public ChineeseFood(Food food) {
		super(food);
	}
	@Override
	public String prepareFood()
	{
		return super.prepareFood()+"Fried Rice";
	}
	@Override
	public float foodPrice()
	{
		return super.foodPrice()+120;
	}
}


public class DecoratorPatternProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("----------Food Menu----------");
			System.out.println("Enter your Choice: ");
			System.out.println("1. Non Veg\n2. Chineese\n3. Exit ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Food food1=new NonVegFood(new VegFood());
				System.out.println(food1.prepareFood());
				System.out.println(food1.foodPrice());
			case 2:
				Food food2=new NonVegFood(new VegFood());
				System.out.println(food2.prepareFood());
				System.out.println(food2.foodPrice());
			default:
				System.out.println("No Other Category is Available");
			}
		}while(choice!=3);

	}

}
