package edu.kh.oop.practice.model.vo;

public class BookService {

	public void practice() {
		
		Book bo1 = new Book();
		Book bo2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		System.out.println(bo1.toString());
		System.out.println(bo2.toString());
		
		bo1.setTitle("c언어");
		bo1.setPrice(30000);
		bo1.setDiscountRate(0.2);
		bo1.setAuthor("홍길동");
		
		System.out.println("====");
		System.out.println(bo1.toString());
		System.out.println(bo2.toString());
		
		System.out.println("도서명 :"+bo1.getTitle());
		System.out.println("할인된 가격 = "+bo1.getPrice());
		System.out.println("도서명 :"+bo2.getTitle());
		System.out.println("할인된 가격 = "+ (bo2.getPrice() - (int)(bo2.getPrice() * bo2.getDiscountRate()))+"원");
		
		
		
	}
	
}
