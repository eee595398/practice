package array2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array2Practice {

	
	public void ex1() {
		
	  String[][] arr = new String[3][3];
	  for(int i = 0; i<3; i++) {
		  for(int j=0; j<3; j++) {
			  arr[i][j]= "("+ i+", " +j+")";
		  }
	  }
	  for(int i = 0; i<3; i++) {
		  for(int j=0; j<3; j++) {
			  System.out.print(arr[i][j]);
		  }
	   System.out.println();
	}
	}
	
	public void ex2() {
		int[][] arr = new int[4][4];
		int num = 0;
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				num++;
				arr[i][j]=num;
				System.out.printf("%3d",arr[i][j]);
				// num을 이용해서 숫자를 저장하고 num++로 숫자를 늘림 
				// %3을 이욯해서 너비를 맞춤
			}
			System.out.println();
		}
		
		
	}
	
	public void ex3() {
		
		int[][] arr = new int[4][4];
		int num = 16;
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = num;
				num--;
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
	
	public void ex4() {
		
		int[][]arr = new int[4][4];
		Random random = new Random();
		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = random.nextInt(10)+1; 
				// 0~9까지 정수가 랜덤으로 나옴
			}
		}
		int sum = 0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(i<3&&j<3) {
					System.out.print(arr[i][j]+" ");
					sum+=arr[i][j];
				}
				else{
					if(j==3) {
						System.out.print(sum);
					}
					else {
						int num = 0;
						for(int ii=0; ii<3; ii++) {
							num+=arr[ii][j];
						}
						System.out.print(num+" ");
					}
				}
				
			}
			System.out.println();
		}
		int totalSum = 0;
		for( int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				totalSum+=arr[i][j];
			}
		}
		System.out.print(totalSum);
		
	}
	
	
	
	
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][4];
		
		final int RowFinal = arr.length - 1;
		final int ColFinal = arr[0].length - 1;
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (row != RowFinal && col != ColFinal) {
					arr[row][col] = (int)(Math.random() * 10 + 1);
					
					arr[row][ColFinal] += arr[row][col];
					arr[RowFinal][col] += arr[row][col];
					arr[RowFinal][ColFinal] += arr[row][col];
				}
				System.out.printf("%4d ", arr[row][col]);
			}
			System.out.println();
		}
		
		sc.close();
	}
		
	
	
	public void ex5() {
		
	}
	}
	
	

