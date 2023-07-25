package edu.kh.oop.practice.model.vo;

public class BookService {

	public void practice() {
		
		Book bo1 = new Book();
		Book bo2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		System.out.println(bo1.toString());
		System.out.println(bo2.toString());
		
	}
	
}
