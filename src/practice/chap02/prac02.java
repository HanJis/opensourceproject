/*
 *  (2�� �ǽ����� 02��)�ҽ�����:prac02.java
 */
package practice.chap02;

import java.util.Scanner;

public class prac02 {

	public static void main(String[] args) {
		System.out.print("2�ڸ��� ���� �Է�(10~99)>> ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		// �Է¹��� ���ڸ� 10���� ������������ ��(���� �ڸ�)�� �Է¹��� ���ڸ� 10���� ������������ ������(���� �ڸ�)�� ���Ѵ�.
		if(number/10 == number %10)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("No.. 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		
		scanner.close();

	}

}
