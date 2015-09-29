package test;
import java.util.*;

public class IndianPocker {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]){
		//�÷��̾� ����
			String name = "";
			int chip = 0;
		
		//��ǻ�� ����
			String comname = "";
			int comchip = 0;
		
		//ī�� ����
			int card[] = new int[20];
			int i;
			
		for(i=0;i<10;i++){
    		card[i] = i+1;
    	}
    	
    	for(int j=0;j<10;j++){
    		card[i] = j+1;
    	i++;
    	}

		shuple(card);

		Player a = new Player();
			System.out.println("�÷��̾��� �̸��� �Է����ּ��� : ");
			a.name = sc.nextLine();
			System.out.println(a.name + "�Բ� Ĩ 20���� �Ҵ��մϴ�");
			a.chip = 20;
		
		Player b = new Player();
			System.out.println("����� �̸��� �Է����ּ��� : ");
			b.name = sc.nextLine();
			System.out.println(b.name + "�Բ� Ĩ 20���� �Ҵ��մϴ�");
			b.chip = 20;
			
		//�÷��̾� ����
			decision(card,0,10);

		//���� ����
		int j = 1;
	while(true){
		
		System.out.println(j + "���带 �����ϰڽ��ϴ�.");
		System.out.println("�⺻ ����Ĩ 1���� ������ �ϰڽ��ϴ�.");
		a.chip = a.chip - 1;
		b.chip = b.chip - 1;
		int dealerchip = 2;
		System.out.println("�÷��̾��� ī��� ������ �ʽ��ϴ�");
		System.out.println("������ ī��� " + card[11] + "�Դϴ�");
		System.out.println("���� �Ͻðڽ��ϱ�?(y/n)");
			String answer = sc.nextLine();
		
		if(answer.equals("y")){
			System.out.println("������ Ĩ�� ������ ������ �ֽʽÿ�(1 ~ " + a.chip + ")���� ������ �� �ֽ��ϴ�" );
			int betting = sc.nextInt();
			a.chip = a.chip - betting;
			System.out.println("�÷��̾��� ���� Ĩ�� ������" + a.chip);
			
			//���� ����.. 0.5���� -> �� ����, 0.5�̻� -> �� ��������
			boolean combetting = true;
			if(true){
				System.out.println("��ǻ�Ͱ� ���ÿ� ���Ͽ����ϴ�");
			}
			else{
				System.out.println("��ǻ�Ͱ� ������ �����Ͽ����ϴ�");
			}
			

			System.out.println("ī�带 �����ϰڽ��ϴ�.");
			System.out.println("�÷��̾��� ī��� " + card[1] + ", ������ ī��� " + card[11] + "(��)�����ϴ�.");

			//�÷��̾��� �¸����� : 1)��ǻ�Ͱ� ������ �����Ѵ�. 2)�÷��̾��� ī����ڰ� ������ ī����ں��� �� ����.
			if(card[1]>card[11]){
				System.out.println("�÷��̾��� �¸��Դϴ�.");
				a.chip = a.chip + betting + betting;
				System.out.println("�÷��̾��� ���� Ĩ�� ������" + a.chip + "�� �Դϴ�");
			}
			else if(card[1]<card[11]){
				System.out.println("������ �¸��Դϴ�.");
				System.out.println("�÷��̾��� ���� Ĩ�� ������" + a.chip + "�� �Դϴ�");
			}
			else{
				System.out.println("�̹� ���� ���º��Դϴ�. ���� ������ �Ѿ�ϴ�.");
			}

			
			
		}
		else if(answer.equals("n")){
			System.out.println("������ �����ϼ̽��ϴ�. ������ �и� �����մϴ�.");
			System.out.println("�÷��̾��� ī��� " + card[1] + ", ������ ī��� " + card[11] + "(��)�����ϴ�.");
			System.out.println("������ �¸��Դϴ�.");
			b.chip = b.chip + dealerchip;
			System.out.println("�÷��̾��� ���� Ĩ�� ������" + a.chip + "�� �̸�, ������ Ĩ�� " + b.chip + "�� �Դϴ�." );

		}
		

		
	j++;
	}	
		
	}
	
	//ī�� ����
	static int[] shuple(int card[]){
		System.out.println("ī�带 �����մϴ�");
		int tmp;
    	Random rnd = new Random();
			
	    	
	    for(int k=0;k<20;k++){
	    	int des = rnd.nextInt(20);
	    	tmp = card[k];
	    	card[k] = card[des];
	    	card[des] = tmp;
	    }
	    
	    
	    for(int t=0;t<card.length;t++){
	    	System.out.print(" "+card[t]);
	    }
	    System.out.println();
	    System.out.println("������ �Ϸ�Ǿ����ϴ�");
	    return card;
	}
	
	static int decision(int card[], int x, int y){
		System.out.println("���÷��̾ �����ϰڽ��ϴ�");
		System.out.println("�÷��̾� ī��� " + card[x] + ", ��ǻ�� ī��� " + card[y] + "�Դϴ�.");
		do{
			if(card[x]>card[y]){
				System.out.println("�÷��̾� ���� �����մϴ�");
				return 0;
			}
			else if(card[x]==card[y]){
				System.out.println("���º��Դϴ�. �ٽ� �̰ڽ��ϴ�");
			}
			else{
				System.out.println("��ǻ�� ���� �����մϴ�");
				return 1;
			}
			x = x + 1; y = y +1;
		}while(card[x-1] == card[y-1]);
		return 0;
	}
}

// ���, ��ǻ��
class Player{
	Scanner sc = new Scanner(System.in);
	String name;
	int chip;
}
