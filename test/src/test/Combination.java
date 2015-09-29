package test;
import java.lang.*;
import java.util.*;

public class Combination {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("nCr에서 n과 r에 들어갈 정수를 입력하세요 : ");
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		double expSum = 0;
		
		for(int i = 1; i<=n; i++){
			expSum = expSum + Math.log(i);
		}
		System.out.println("log("+n+"!) : " + expSum);
		double N = expSum;
		
		expSum = 0;
		
		for(int i = 1; i<=r; i++){
			expSum = expSum + Math.log(i);
		}
		System.out.println("log("+r+"!) : " + expSum);
		double R = expSum;
		
		expSum = 0;
		
		for(int i = 1; i<=(n-r); i++){
			expSum = expSum + Math.log(i);
		}
		System.out.println("log("+(n-r)+"!) : " + expSum);
		double NR = expSum;
		
		System.out.println(n+"C"+r+ "의 값은 : " + Math.exp(N-R-NR));
		
	}
}
