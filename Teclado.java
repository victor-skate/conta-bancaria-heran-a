package banco;
import java.util.Scanner;

public class Teclado {
	public static String lerString(String rotulo){
		System.out.println(rotulo);
		Scanner scan= new Scanner(System.in);
		return scan.nextLine();
	}
	
	
	public static int lerInt (String rotulo){
		System.out.println(rotulo);
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
		}
	
	public static double lerDouble(String rotulo){
		System.out.println(rotulo);
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
		}
	
	}
