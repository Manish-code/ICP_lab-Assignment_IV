import java.util.Scanner;


public class A3Q13 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks of Student");
		int mark = sc.nextInt();
		int point=mark/10;
		switch(point)
		{ 
		case 10:
		case 9:
			System.out.println("O Grade");
			break;
		case 8:
			System.out.println("A Grade");
			break;
		case 7:
			System.out.println("B Grade");
			break;
		case 6:
			System.out.println("C Grade");
			break;
		case 5:
			System.out.println("D Grade");
			break;
		case 4:
			System.out.println("E Grade");
			break;
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("FAIL");
			break;
			default:
				System.out.println("WRONG INPUT");
			
			
		}
		

	}

}
