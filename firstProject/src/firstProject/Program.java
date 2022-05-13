package firstProject;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int n = 0;
		int count = 0;
		double soma = 0;
		
		while(n >= 0) {
			System.out.println("enter number");
			n = read.nextInt();
			if(n > 0 ) {
				count = count+1;
				soma = soma + n;
				
			}
			
		}
		double median = soma/count;
		
		System.out.println("soma "+ soma + "count " + count + "median " + median );
		System.out.println(String.format("%.2f", median));
		double a = 90./112.;
		System.out.println(String.format("%.2f", a));
		
	}

}
