import java.util.Scanner;


public class A3Q7 {
	public static void main(String[] args) {
Scanner sc= new Scanner (System.in);
System.out.println("Enter first coordinates (x1,y1)");
double x1= sc.nextDouble();
double y1= sc.nextDouble();
System.out.println("Enter first coordinates(x2,y2)");
double x2= sc.nextDouble();
double y2= sc.nextDouble();
System.out.println("Enter first coordinates(x3,y3)");
double x3= sc.nextDouble();
double y3= sc.nextDouble();
double m1= (y2-y1)/(x2-x1);
double m2= (y3-y2)/(x3-x2);
if (m1==m2)
	System.out.println("These are the coordinates of straight line");
else
	System.out.println("These are the coordinates of straight line");


	}
	



}
