package test;
import java.lang.*;
import java.util.*;

public class Combination {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("nCr���� n�� r�� �� ������ �Է��ϼ��� : ");
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
		
		System.out.println(n+"C"+r+ "�� ���� : " + Math.exp(N-R-NR));
		
	}
}
