package colletction;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ColletctionService {

	private List<Colletction> colletctionList = new LinkedList<Colletction>();
	Scanner sc = new Scanner(System.in);
	
	public  ColletctionService(){
		colletctionList.add(new Colletction( "강동현", 25, "서울", 'm', 90) );
		
	}
	
	
	
	public void menu() {
		int num = 0;
		
	do {
			
			System.out.println("\n======학생 관리 프로그램 ========");
			System.out.println("1. 학생 정부 추가");
			System.out.println("2. 학생 전체 조회");
			System.out.println("3. 학생 정보 수정 ");
			System.out.println("4. 학생 정보 제거 ");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");

			System.out.println("0. 프로그램 종료");
			
			System.out.print("\n 메뉴 번호 선택 >>");
			
			
			
			try { 
			  num =sc.nextInt();
			  System.out.println();
			  
			  switch(num){
			  case 1 : System.out.println(addStudent() ); break;
			  case 2 : all(); break;
			  case 3 : System.out.println(update() ); break;
			  case 4 : System.out.println(remove()); break;
			  case 5 : search(); break;
			  case 6 : search2(); break;
			  case 0 : System.out.println("프로그램 종료"); break;
			  default : System.out.println("메뉴에 없는 숫자입니다.");
			  
			  }
				
				
				
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
				
				sc.nextLine();				
				
				num=-1;
				
				
			}
			
	}while(num !=0);
	
	
		
		
		
	}
		
	
	public String addStudent() throws InputMismatchException {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("지역 : ");
		String region = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
	   
		if(colletctionList.add(new Colletction(name, age, region, gender, score))) {
		
			return "성공";
		} else {
			
			return"실패";
		}
	
		
		
		
	}
	
	public void  all() {
		if(colletctionList.isEmpty()) {
			System.out.println("검색 결과 없습니다.");
			
			return;
			
		}
		
		int index = 0;
		
		for(Colletction col : colletctionList ) {
			System.out.print((index++)+" 번 : ");
			System.out.println(col);
			
		}
		
		
		
	}
	
	
	public String update()throws InputMismatchException {
		System.out.println("학생 정보 수정 ");
		
		System.out.println("인덱스 번호 입력 ");
		int index = sc.nextInt();
		if(colletctionList.isEmpty()) {
		  return "정보가 없습니다";
		}
		else if(index<0||index>=colletctionList.size()) {
			return"값이 없습니다";
		}
		else {
			System.out.println(index + "번째 학생 정보");
			System.out.println(colletctionList.get(index));
			//컬렉션.get(index)
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			sc.nextLine();
			
			
			System.out.print("지역 :");
			String region = sc.nextLine();
			
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			
			System.out.println("점수 : ");
			int score = sc.nextInt();
			
			Colletction temp = colletctionList.set(index, new Colletction(name, age, region, gender, score));
			
			return temp.getName() + "의 정보가 변경 되었습니다";
			
			////
			
		}
		
	}
	
	
	public String remove() throws InputMismatchException {
		System.out.println("학생 정보 제거 ");
		
		System.out.println("인덱스 번호 입력 ");
		int index = sc.nextInt();
		if(colletctionList.isEmpty()) {
		  return "정보가 없습니다";
		}
		else if(index<0||index>=colletctionList.size()) {
			return"값이 없습니다";
		}else {
			System.out.println("정말 삭제하시겠슴다?(Y/N) ");
			char ch = sc.next().toUpperCase().charAt(0);
			
			///
			if(ch=='Y') {
				Colletction temp = colletctionList.remove(index);
				/////
				return temp.getName() + "의 정보가 제거 되었습니다.";
			}else {
				return "취소";
				///
			}
			
			
		}
		
	}
	
	public void search() {
		System.out.println("검색할 이름 : ");
		String name =sc.next();
		
		boolean flag = true;
		
		for(Colletction col : colletctionList) {
			if(name.equals(col.getName())) {
				////
				System.out.println(col);
				
				flag = false;
			}
		}
		if(flag) {
			System.out.println("검색결과가 없습니다.");
		}
		
		
	}
	
	public void search2() {
		System.out.print("검색 할 문자 입력 : ");
		String name = sc.next();
		///
		
		boolean flag = true;
		
		for(Colletction col : colletctionList) {
			if(col.getName().contains(name)) {
				////
				System.out.println(col);
				
				flag =false;
			}
			
			
		}
		if(flag) {
			System.out.println("검색 결과 없습니다.");
		}
		
		
		
		
	}
	
	
	
}
