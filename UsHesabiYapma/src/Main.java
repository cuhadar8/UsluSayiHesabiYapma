import java.util.Scanner;

public class Main {
	
	public static int result = 1;
	public static int power(int base, int exponent) {
		if(exponent == 0 || base == 0) {                //Recursive metodun bitmesi için koşulu ve üs veya tabanın 0 girilmesi
			return 1;									//durumunu aynı anda çözmüş olduk
		}
		result *= base;
		power(base,exponent-1);
		return result;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Taban sayısı: ");
		int base = scanner.nextInt();
		System.out.print("Kuvvet sayısı: ");
		int exponent = scanner.nextInt();
		
		System.out.println("Sonuç : " + power(base, exponent));
	}

}
