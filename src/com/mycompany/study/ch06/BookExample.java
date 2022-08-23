package com.mycompany.study.ch06;

public class BookExample {

	public static void main(String[] args) {
		
		
		Book book = new Book();
		
		Book basicInfo = new Book("타이탄의 도구들","팀 페리스");
		System.out.println("기본정보 : " + basicInfo.author + "이 만든 " + basicInfo.title);
				
		Book moreInfo = new Book (368,"Tools of Titans");
		System.out.println("상세정보 : " + moreInfo.page + "쪽과 원제목 " + moreInfo.OriginalName);
				
				

//		Book book = new Book();
//		System.out.println("8월의 추천 도서: " + book.name);
//		System.out.println("저자 : " + book.name);
//		System.out.println("총 페이지 : " + book.page);
//		System.out.println("원서명 : " + book.originalName);
//		
//		// public 이기 때문에 수정 가능
//		book.author = "Ferriss, Timothy";
//		System.out.println("저자(영어) : " + book.author);
		
		
		
	}

}
