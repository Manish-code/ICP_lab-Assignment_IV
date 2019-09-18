import java.util.Scanner;
public class A3Q3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input an integer");
	int integer=sc.nextInt();
	if (integer%2==0)
		System.out.println("Integer is Even");
	else
		System.out.println("Integer is odd");
	
	}
}