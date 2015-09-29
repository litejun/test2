package test;
import java.util.*;

public class IndianPocker {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]){
		//플레이어 변수
			String name = "";
			int chip = 0;
		
		//컴퓨터 변수
			String comname = "";
			int comchip = 0;
		
		//카드 변수
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
			System.out.println("플레이어의 이름을 입력해주세요 : ");
			a.name = sc.nextLine();
			System.out.println(a.name + "님께 칩 20개를 할당합니다");
			a.chip = 20;
		
		Player b = new Player();
			System.out.println("상대의 이름을 입력해주세요 : ");
			b.name = sc.nextLine();
			System.out.println(b.name + "님께 칩 20개를 할당합니다");
			b.chip = 20;
			
		//플레이어 결정
			decision(card,0,10);

		//라운드 게임
		int j = 1;
	while(true){
		
		System.out.println(j + "라운드를 시작하겠습니다.");
		System.out.println("기본 배팅칩 1개를 내도록 하겠습니다.");
		a.chip = a.chip - 1;
		b.chip = b.chip - 1;
		int dealerchip = 2;
		System.out.println("플레이어의 카드는 보이지 않습니다");
		System.out.println("상대방의 카드는 " + card[11] + "입니다");
		System.out.println("베팅 하시겠습니까?(y/n)");
			String answer = sc.nextLine();
		
		if(answer.equals("y")){
			System.out.println("베팅할 칩의 개수를 결정해 주십시오(1 ~ " + a.chip + ")개를 베팅할 수 있습니다" );
			int betting = sc.nextInt();
			a.chip = a.chip - betting;
			System.out.println("플레이어의 남은 칩의 개수는" + a.chip);
			
			//난수 추출.. 0.5이하 -> 컴 베팅, 0.5이상 -> 컴 베팅포기
			boolean combetting = true;
			if(true){
				System.out.println("컴퓨터가 베팅에 응하였습니다");
			}
			else{
				System.out.println("컴퓨터가 베팅을 포기하였습니다");
			}
			

			System.out.println("카드를 오픈하겠습니다.");
			System.out.println("플레이어의 카드는 " + card[1] + ", 상대방의 카드는 " + card[11] + "(이)었습니다.");

			//플레이어의 승리조건 : 1)컴퓨터가 베팅을 포기한다. 2)플레이어의 카드숫자가 상대방의 카드숫자보다 더 높다.
			if(card[1]>card[11]){
				System.out.println("플레이어의 승리입니다.");
				a.chip = a.chip + betting + betting;
				System.out.println("플레이어의 남은 칩의 개수는" + a.chip + "개 입니다");
			}
			else if(card[1]<card[11]){
				System.out.println("상대방의 승리입니다.");
				System.out.println("플레이어의 남은 칩의 개수는" + a.chip + "개 입니다");
			}
			else{
				System.out.println("이번 판은 무승부입니다. 다음 판으로 넘어갑니다.");
			}

			
			
		}
		else if(answer.equals("n")){
			System.out.println("베팅을 포기하셨습니다. 서로의 패를 공개합니다.");
			System.out.println("플레이어의 카드는 " + card[1] + ", 상대방의 카드는 " + card[11] + "(이)었습니다.");
			System.out.println("상대방의 승리입니다.");
			b.chip = b.chip + dealerchip;
			System.out.println("플레이어의 남은 칩의 개수는" + a.chip + "개 이며, 상대방의 칩은 " + b.chip + "개 입니다." );

		}
		

		
	j++;
	}	
		
	}
	
	//카드 셔플
	static int[] shuple(int card[]){
		System.out.println("카드를 셔플합니다");
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
	    System.out.println("셔플이 완료되었습니다");
	    return card;
	}
	
	static int decision(int card[], int x, int y){
		System.out.println("선플레이어를 결정하겠습니다");
		System.out.println("플레이어 카드는 " + card[x] + ", 컴퓨터 카드는 " + card[y] + "입니다.");
		do{
			if(card[x]>card[y]){
				System.out.println("플레이어 먼저 시작합니다");
				return 0;
			}
			else if(card[x]==card[y]){
				System.out.println("무승부입니다. 다시 뽑겠습니다");
			}
			else{
				System.out.println("컴퓨터 먼저 시작합니다");
				return 1;
			}
			x = x + 1; y = y +1;
		}while(card[x-1] == card[y-1]);
		return 0;
	}
}

// 사람, 컴퓨터
class Player{
	Scanner sc = new Scanner(System.in);
	String name;
	int chip;
}
