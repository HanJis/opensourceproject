/*
 * (2�� �ǽ����� 08��)�ҽ�����:prac08.java
 * 7������ 
'���簢���� ���� ��� �𼭸��� ������ �ϴ� �𼭸��� �� ������ ǥ���Ѵ�.'��� ����������
(100,100)�� (200,200)�� �̿��Ͽ� ��ǥ��鿡 ���簢���� ���� ��� ���� ��� �𼭸��� ������ �ϴ� �𼭸� ���� �� �� ����. 
>>(100,100)�� (200,200)���� "���� �ϴ�" �𼭸��� "������ ���" �𼭸��� �� ���̷���� �簢������ �����Ͽ���, �簢���ȿ� �簢���� ���ԵǸ� �浹�Ѵٰ� �����ʰ� �ڵ������� �Ͽ���.
 */
package practice.chap02;

import java.util.Scanner;

public class prac08 {
	   public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		   if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y <=recty2))
			   return true;
		   else return false;
		   }
	   public static void main(String[] args) {
		   System.out.println("���� �ϴ� �𼭸��� ������ ��� �𼭸��� ������ �Է��Ͻÿ� (x1, y1),(x2, y2): ");
		      Scanner scanner = new Scanner(System.in);
		      int x1 = scanner.nextInt();
		      int y1 = scanner.nextInt();
		      int x2 = scanner.nextInt();
		      int y2 = scanner.nextInt();
		      System.out.print("("+ x1 +", " + y1 + "),("+ x2+", " + y2 +")�� �̷���� �簢����");
		      int count =0;
		      boolean TorF;
		      
		      TorF = inRect(x1,y1, 100,100, 200,200);
		      if(TorF == true)
		    	  count = count + 1;
		      TorF = inRect(x2,y1, 100,100, 200,200);
		      if(TorF == true)
		    	  count = count + 1;
		      TorF = inRect(x1,y2, 100,100, 200,200);
		      if(TorF == true)
		    	  count = count + 1;
		      TorF = inRect(x2,y2, 100,100, 200,200);
		      if(TorF == true)
		    	  count = count + 1;
		      
		    //(100,100)�� (200,200)���簢���ȿ� �𼭸��� ���Ե� ��� 1~2���� �簢������ �浹������ 4���� ���ԵǸ� ��ġ(�浹)�ϰų� �浹�����ʴ´�.
		      if(count == 4) {
		    	  if(x1>100 && y1>100 && x2<200 && y2<200)
		    		  System.out.println("(100,100)��(200,200)���� �̷���� �簢���� �浹�����ʴ´�.");
		    	  else
		    		  System.out.println("(100,100)��(200,200)���� �̷���� �簢���� ��ġ(�浹)�Ѵ�.");
		      }
		      if(count<4 && count>0)
		    	  System.out.println("(100,100)��(200,200)���� �̷���� �簢���� �浹�Ѵ�.");
		      
		      //�𼭸��� �簢�� �ȿ� ���Ե����� ������ (x1,y1),(x2,y2)�� �̷���� �簢���� ���� ������� �浹�Ѵ�.
		      if(count == 0) {
		    	  if((x1 < 100 && y1 < 100 && x2 > 200 && y2 > 200) || x1>200 || x2 < 100 || y1 > 200 || y2 < 100)
		    		  System.out.println("(100,100)��(200,200)���� �̷���� �簢���� �浹�����ʴ´�.");
		    	  else
		    		  System.out.println("(100,100)��(200,200)���� �̷���� �簢���� �浹�Ѵ�.");
		      
		      }
	   }
}
