import java.util.Scanner;


public class A3Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if (ch>=65&&ch<=90)
			System.out.println("CAPITAL LETTER");
		else if (ch>=97&&ch<=122)
			System.out.println("small case");
		else if (ch>=48&&ch<=57)
			System.out.println("digit");
		
		//if ((ch>=58&&ch<=64)	&& (ch>=91&&ch<=97) && (ch>=123&&ch<=127) && (ch>=0&&ch<=47))
		else 
			System.out.println("Special character");
		
		

	}

}
