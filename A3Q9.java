import java.util.Scanner;


public class A3Q9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter first coordinates (x,y)");
		double x= sc.nextDouble();
		double y= sc.nextDouble();
		if(x>=0&&y>=0)
			System.out.println("Entered coordinate("+x+" ,"+y+") belongs to first Quadrant");
		else if(x>=0&&y<0 )
			System.out.println("Entered coordinate("+x+","+y+") belongs to Second Quadrant");
			else if(x<0&&y<0 )
				System.out.println("Entered coordinate("+x+","+y+") belongs to Third Quadrant");
				else if(x>=0&&y<0 )
					System.out.println("Entered coordinate("+x+","+y+") belongs to Fourth Quadrant");
	}
}

			
		
