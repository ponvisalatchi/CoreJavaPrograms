package java8features;

@FunctionalInterface
interface Sayable{
	String sayHello();
}
public class LambdaNoParameter {

	public static void main(String[] args) {
		Sayable s1=()->{
			return "Good Morning Friends";
		};
		System.out.println(s1.sayHello());

	}

}
