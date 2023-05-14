//Swapping of 2 nos

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//om
		System.out.println("enter the values of x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("before swapping :" + x + "" + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("after swapping :" + x + "" + y);
	}
}
