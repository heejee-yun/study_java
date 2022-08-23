package com.mycompany.study.ch06;

public class Book {

	String title;
	String author;
	int page;
	String OriginalName;
	
	Book(){
	}
	
	Book(String title,String author){
		this.title = title;
		this.author = author;
	}
	
	Book(int page, String OriginalName){
		this.page = page;
		this.OriginalName = OriginalName;
	}
//	String title = "타이탄의 도구들";
//	String author = "팀 페리스";
//	int page = 368;
//	String originalName = "Tools of Titans";
	
			
}
