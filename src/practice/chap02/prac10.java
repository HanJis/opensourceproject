package practice.chap02;

import java.util.Scanner;

public class prac10 {

	public static void main(String[] args) {
		System.out.print("ù��°�� ���� �߽ɰ� ������ �Է�>> ");
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int r1 = scanner.nextInt();
		System.out.print("�ι�°�� ���� �߽ɰ� ������ �Է�>> ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int r2 = scanner.nextInt();
//���� �߽��� ���� ������ ���̰� �������� �պ��� ũ�ų� ������ ������.
		int l = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
		if((r1+r2)*(r1+r2) >= l) 
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
	}

}
