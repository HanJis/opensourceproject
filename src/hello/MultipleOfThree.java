/*
 * �ҽ� ����: MultipleOfThree.java
 */
package hello;

import java.util.Scanner;

public class MultipleOfThree {
	public static void mian(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�: ");
		int number = in.nextInt();
		
		if(number%3==0)
			System.out.println("3�� ����Դϴ�.");
		else
			System.out.println("3�� ����� �ƴմϴ�.");
		
		in.close();
		
	}

}
