package Day01;

import java.util.Scanner;

public class Day01_6 {
	/*문제3 방문록 입력받아 출력하기
	 * [입력받기] : 이름 , 작성자 , 내용 , 날짜
	 * [ 출력 ] 
	 * ---------------방문록------------
	 * | 순번 | 작성자 |   내용   | 날짜   |
	 * |  1  | 강호동 | 안녕하세요 | 09-28 | 
	 * -------------------------------
	 */
	
	public static void main(String[] args) {
		
		/*
		Scanner 입력객체 = new Scanner(System.in);
		// 입력
		System.out.println("순번 : ");		String 순번 = 입력객체.next();
	    System.out.println("작성자 : ");		String 작성자 = 입력객체.next();
	    System.out.println("내용 : ");		String 내용 = 입력객체.next();
	    System.out.println("날짜 : ");		String 날짜 = 입력객체.next();
	    
	    //출력
	    System.out.println("---------------방문록------------");
	    System.out.println("| 순번 | 작성자 |   내용   | 날짜   |");
	    System.out.println("|  "+순번+"  "+작성자+" | "+내용+" | "+날짜+" |");	    
	    System.out.println("-------------------------------");
	    */
		
		
		// nextLine 오류... 
		
		
		//1.입력객체 선언
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("순번 = ");	String writer = scanner.next();
		System.out.println("작성자 = ");	String contents = scanner.nextLine();
		// .nextLine = 공백 포함 o 위아래 합쳐버림 코드상의 문제는 아니라고함
		// next 다음으로 nextLine 사용하면 어쩔수없이 문제가 생긴다고함
		// 해결법은 next와 nextLine사이에 nextLine을 추가하라하심.
		System.out.println();	String date = scanner.next();
		
		//2.출력
		System.out.println("---------------방문록------------");
		System.out.println("| 순번 | 작성자 |   내용   | 날짜   |");
		System.out.println("|  1  | "+writer+" | " + contents + "\t | " +date+" |");
		System.out.println("-------------------------------");
		
	    
	    
	    
		
		
	}
	
	

}
