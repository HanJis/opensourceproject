/*
 * (2�� �ǽ����� 06��)�ҽ�����:prac06.java
 */
package practice.chap02;

import java.util.Scanner;

public class prac06 {

	public static void main(String[] args) {
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>> ");
		Scanner scanner= new Scanner(System.in);
		int number = scanner.nextInt();
		
		//���� �ڸ��� �����ڸ� �и�
		int tenth_digit= number / 10; //���� �ڸ�
		int one_digit = number % 10; //���� �ڸ�
		
		int count=0; //3,6,9 ������ �������� ���� ����
		
		
		if(tenth_digit!=0 &&tenth_digit %3==0) {
			count++; //���� �ڸ��� 3���� ���������� ī��Ʈ +1
			if(one_digit%3==0)
				count++; //�����ڸ��� 3�� ���������� ���� �ڸ��� 3���� �������� �� ī��Ʈ +1
			}
		else {
			if(one_digit%3==0)
				count++; //�����ڸ��� 3���� ������������ʰ� ���� �ڸ��� 3���� ���������� ī��Ʈ +1
			}
		// 1~99������ ���� �� �Է��� ������ 3,6,9�� �ϳ� �ִ°��
		if(count==1)
			System.out.println("�ڼ�¦"); 
		// 1~99������ ���� �� �Է��� ������ 3,6,9�� �ΰ� �ִ°��
		if(count==2)
			System.out.println("�ڼ�¦¦");
		
		scanner.close();
		}
	}