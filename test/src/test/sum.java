package test;
import java.util.*;

public class sum{
	public static void main(String []args){
		int sum = 0;
		for(int i = 1;i<=100;i++){
			if(i/2*2==i)
			sum = sum + i;
		}
		System.out.println(sum);
		sum = 0;
		for(int i = 2;i<=100;i=i+2){
			sum = sum + i;
		}
		System.out.println(sum);
		
		
	}
}