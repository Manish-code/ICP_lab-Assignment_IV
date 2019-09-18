import java.util.Scanner;


public class A3Q8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Age of Rahul)");
	int Rahul= sc.nextInt();
	System.out.println("Enter Age of Ayush)");
	int Ayush= sc.nextInt();
	System.out.println("Enter Age of Ajay)");
	int Ajay= sc.nextInt();
	if (Rahul<Ayush&&Rahul<Ajay)
		System.out.println("Rahul is Youngest)");
	else if (Ayush<Rahul&&Ayush<Ajay)
		System.out.println("Ayush is Youngest)");
	else if (Ajay<Rahul&&Ajay<Ayush)
		System.out.println("Ajay is Youngest");
	}

	

}
