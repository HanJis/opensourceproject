/*
 * (2�� �ǽ����� 12��)�ҽ�����:prac12.java
 */
package practice.chap02;

import java.util.Scanner;

public class prac12 {
/*// 12-(1) if-else ��
	public static void main(String[] args) {

		System.out.print("����>> ");
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		String operator = scanner.next();
		double num2 = scanner.nextDouble();
		if(operator.equals("+"))
			System.out.println(num1 + operator + num2 + "�� ��� ����� "+(num1+num2));
		if(operator.equals("-"))
			System.out.println(num1 + operator + num2 + "�� ��� ����� "+(num1-num2));
		if(operator.equals("*")) 
			System.out.println(num1 + operator + num2 + "�� ��� ����� "+(num1*num2));
		if(operator.equals("/")) {
			if(num2!=0)
				System.out.println(num1 + operator + num2 + "�� ��� ����� "+(num1/num2));
			else
				System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		
	
	}
	*/
	
 // 12-(2)switch ��
	public static void main(String[] args) {
		System.out.print("����>> ");
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		String operator = scanner.next();
		double num2 = scanner.nextDouble();
		switch (operator) {
		case "+":
			System.out.println(num1 + operator + num2 + "�� ��� ����� "+(num1+num2));
			break;
		case "-":
			System.out.println(num1 + operator + num2 + "�� ��� ����� "+(num1-num2));
			break;
		case "*":
			System.out.println(num1 + operator + num2 + "�� ��� ����� "+(num1*num2));
			break;
		case "/":{
			if(num2!=0)
				System.out.println(num1 + operator + num2 + "�� ��� ����� "+(num1/num2));
			else
				System.out.println("0���� ���� �� �����ϴ�.");
			break;
		}
		}
	scanner.close();
	}
 
	
}
