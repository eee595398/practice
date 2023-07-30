package array;

import java.util.Scanner;

public class Arraypractice {

	public void ex1() {
		
	  int[]arr = new int[9];
	  for(int i = 0; i<arr.length; i++) {
		  arr[i]=i+1; 

		System.out.print(arr[i]+" ");
		
		// 배열 선언 할때 길이 헷갈림 
	  }
	  System.out.println();
	  // 줄 바꿔줌
		 int sum = 0;
	 for (int i =0; i<arr.length; i+=2) {
		  sum+=arr[i];
			 }
		
	 System.out.println("짝수 번째 인덱스 합 : " + sum);
	// for문을 쓰기 전에 먼저 짝수번째 값을 더할 것을 초괴화 해야함 
	 // for이 끝난후 뽑아야함 
	}
	
	public void ex2() {
		
		int[] arr = new int[9];
		int num = 9;
		for(int i = 0; i<arr.length; i++) {
			arr[i]=num;
			num--;
			
			System.out.print(arr[i]+" ");
			// i는 인덱스 순서 용으로 쓰고 num을 이용해 값을 집어넣는다 
		}
		System.out.println();
		
		int sum=0;
		for(int i=1; i<arr.length; i+=2 ) {
			sum+=arr[i];
			
		}
		System.out.println("홀수번째 인덱스 합 : " + sum);
		
	}
	
	public void ex3() {
		System.out.println("양의 정수 :"+ " ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
			
		}
		
		
		
		
		
		
	}
	
	public void ex4() {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.println("입력 받은 "+ i +" : ");
			arr[i] = sc.nextInt(); 
			
		}
		boolean flag = false;
		// 검색 결과 값에 따라 바뀌도록 설정
		
		System.out.println("검색 할 값 :");
		int input1 = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==input1) {
				System.out.println("인덱스 : " + i);
				flag = true;
				// 일치하는 값이 있다면  flag가 ture로 변함
			}
			
			}
		
		if(!flag) // 모름 
		System.out.println("일치하는 값이 존재 하지 않습니다."); 
		
		
		
		
	}
	
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String input = sc.nextLine();
		System.out.println("문자 : ");
		char input1 =sc.next().charAt(0);
		
		// 입력 받은 문자를 인덱스 저장
		int[] arr = new int[input.length()];
		int count =0; // 입력 받은 문자 개수 저장용
		
		for(int i =0; i<arr.length; i++) {
			if(input.charAt(i)==input1) {
				// 헷갈림 input1이 charat(i)가 같다면
				arr[count] = i;
				count++;
			}
		}
		
		System.out.print( input + "에 "+input1+"가 존재하는 위치(인덱스) :  ");
		for( int i =0; i<count; i++) {
			// count의 개념이 정확히 이해가 안됌 
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		
		System.out.println(input1 + "개수는 : "+count);
	}
	
	
	
	public void ex6() {
		Scanner sc= new Scanner(System.in);
		System.out.println("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("배열 " + i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			// 입력 받은 수를 arr[i] 인덱스에 저장
				count += arr[i];
			}
		
		for(int i=0; i<arr.length; i++ ) {
			
		System.out.print(arr[i]+ " ");
		
		
		}
		System.out.println();
		System.out.println("총 합 : "+ count);
		
	}
	
	
	public void ex7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호(-포함) : ");
		String arr = sc.nextLine();
		
		
	}
	
	
}
