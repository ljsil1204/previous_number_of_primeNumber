package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		[응용문제 3] 소수 판별기 - 입력받은 숫자 직전의 소수가 어떤건지? (제일 큰 소수?)
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		int num = myScanner.nextInt();
		
		boolean isPrimeNumber = true;
		
		int prime =0;
		
//		입력한 숫자직전까지 반복
		for(int i=1; i<num; i++) {
			
//			해당 숫자 소수 판별 
			for(int j=2; j<num/2; j++) {
				
				if((num-i) % j ==0) {
//					소수가 아니다.
					isPrimeNumber = false;
					break;
				}
				
			}
			
			if(isPrimeNumber) {
				prime = num-i;
				break;
			}
			
			isPrimeNum = true;
			
		}
		
	}
	
}
