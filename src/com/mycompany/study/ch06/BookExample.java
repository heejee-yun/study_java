package com.mycompany.study.ch06;

public class BookExample {

	public static void main(String[] args) {
		
		Book book = new Book();
		System.out.println("8월의 추천 도서: " + book.name);
		System.out.println("저자 : " + book.name);
		System.out.println("총 페이지 : " + book.page);
		System.out.println("원서명 : " + book.originalName);
		
		// public 이기 때문에 수정 가능
		book.author = "Ferriss, Timothy";
		System.out.println("저자(영어) : " + book.author);

		
	}

}
