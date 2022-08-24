package com.mycompany.study.ch06;

public class BoardExample {

	public static void main(String[] args) {
//		초기값 출력
		Board board = new Board();
		String name;
		int view;
		Boolean usingNy;

//		각 생성사별 객체의 필드를 전체 출력
		Board board1 = new Board ("이준호");
		System.out.println(board1.name);
		Board board2 = new Board ("이준호", 133);
		System.out.println(board2.name);
		Board board3 = new Board ("이준호", true);
		System.out.println(board1.name);
		Board board4 = new Board ("이준호", 133, true);
		System.out.println(board1.name);
		

	}

}

//package com.bnt.study.ch06;
//
//public class BoardExample {
//
//	public static void main(String[] args) {
//		Board2 board0 = new Board2();
//		Board2 board1 = new Board2("김태희1");
//		Board2 board2 = new Board2("김태희2", 5);
//		Board2 board3 = new Board2("김태희3", false);
//		Board2 board4 = new Board2("김태희4", 10, false);
//
//		board0.say();
//		board1.say();
//		board2.say();
//		board3.say();
//		board4.say();
//	}
//}
