package com.mycompany.study.ch06;

public class Board {
// 모든 게시판은 초기값 필요
//	이름 
//	조회수
//	사용여부 (boolean 사용)
	String name ;
	int view ;
	Boolean usingNy ;
	
	Board(){
		
	}
//	생성자1(이름)
	Board(String name){
		this.name = name;
	}
//	생성자2(이름, 조회수)
	Board(String name, int view){
		this.name = name;
		this.view = view;
	}
//	생성자3(이름, 사용여부)
	Board(String name, Boolean usingNy){
		this.name = name;
		this.usingNy = usingNy;
	}
//	생성자4(이름, 조회수, 사용여부)
	Board(String name, int view, Boolean usingNy){
		this.name = name;
		this.view = view;
		this.usingNy = usingNy;
	}	
}

//package com.bnt.study.ch06;
//
//public class Board2 {
//
//	String name = "김초기";
//	int view = 0;
//	boolean useNy = true;
//
//	Board2(){
//	}
//	Board2(String name){
//		this.name = name;
//	}
//	Board2(String name, int view){
//		this.name = name;
//		this.view = view;
//	}
//	Board2(String name, boolean useNy){
//		this.name = name;
//		this.useNy = useNy;
//	}
//	Board2(String name, int view, boolean useNy){
//		this.name = name;
//		this.view = view;
//		this.useNy = useNy;
//	}
//	public void say() {
//		System.out.println("이름: "+name+", 조회수: "+view+", 사용여부: "+useNy);
//	}
//}
