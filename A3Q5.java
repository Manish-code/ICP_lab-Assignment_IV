import java.util.Scanner;
public class A3Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no.");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		if((x>0&&x<1)&&(y>0&&y<1))
			System.out.println("true");
		else
			System.out.println("false");
			

	}

}
