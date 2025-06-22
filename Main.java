package Hello.java;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int r = sc.nextInt();
		int res = Sum(r);
		System.out.println(res);
		sc.close();
	}
	
	public static int Sum(int r) {
		if(r>0) {
			return r + Sum(r-1);
		}
		else {
			return 0;
		}
	}
}