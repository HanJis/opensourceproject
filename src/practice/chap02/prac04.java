/*
 * (2�� �ǽ����� 04��)�ҽ�����:prac04.java
 */
package practice.chap02;

import java.util.Scanner;

public class prac04 {

	public static void main(String[] args) {
		System.out.print("���� 3�� �Է�>> ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int number = num3;
		
		if(num2 > num1) {
			if(num2<num3)
				number=num2; // num3>num2>num1
			if(num3<num1)
				number=num1; // num2>num1>num3
		}
		else {
			if(num2>num3)
				number = num2; // num1>num2>num3
			if(num1<num3)
				number = num1; // num3>num1>num2
		}
		//���ǹ��� ���� num2�Ǵ� num1�� �߰����� �Ǵ� ��� ��츦 ��Ÿ�±⿡ if�������� number�� �����Ҷ� number=num3�� ������.
		
		System.out.println("�߰� ���� " + number);
		
		scanner.close();

	}

}
