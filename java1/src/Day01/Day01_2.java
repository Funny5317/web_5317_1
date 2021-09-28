package Day01;

public class Day01_2 { // c s 클래스 시작
	
	//System.out.print() // main 없이 실행 불가
	// main + ctrl + 스페이스바
	public static void main(String[] args) { // m s 메인 시작
		
		// 1. 출력
		    // print(출력할 문구); : 출력
		    // println(출력할 문구); : 출력후 줄바꿈
		    //printf( 형식문자, 출력문구 ); : 형식문자 맞는 출력
		          // f : format : 모양
		          // 형식문자
		              // %d : 정수
		              // %f : 실수 
		              // %s : 문자열 
		              // %c : 문자
		          // 제어문자 [p. 34]
		               // \ : 엔터위에 원화기호 \
		               // \n : 줄바꿈
		               // \t : 탭 [들여쓰기 => 5칸 ]
		               // \r : 리턴 [ 맨 앞으로 이동 ]
		               // \\ : \ 출력 [제어문자가 두개들어가서 뒤에 \가 출력됌]
		               
		// 예시1 : syso + ctrl + 스페이스바
	    System.out.print("java"); //
	    System.out.print(12345); // 기계어기때문에 숫자에는 문자처리 x
	    System.out.print("java10"); // 문자+숫자 => 문자로 인식
	    
	       // System : 미리 만들어진 시스템이라는 클래스
	          //out : 출력 스트림 
	                    //print(인수: 출력하고싶은말 ) : 출력 함수
	       // . : 클래스내 멤버(함수,변수) 접근연산자[특수문자]
	       // " " : 키워드[미리 작성된 단어],변수 등 제외한 모든 문자에는 문자처리
		   // ; : 한 줄의 실행코드 끝 [ 일처리 ]   
	    
	    //ctrl + F11 : 컴파일
	    
	    // 예제2
	    System.out.println("java");
	    System.out.println(12345);
	    System.out.println("java10");
	    
	    // 예제3
	    System.out.printf("%s" , "java");
	    System.out.printf("%d", 12345);
	    System.out.printf("%s", "java10");
	    
	    // printf 장점
	    System.out.printf("나이는 %d입니다", 20);
	    System.out.println("나이는 " + 20 + "입니다.");
	        // + : 연결 연산자
	    
	    // 제어문자
	    System.out.println("\njava\n"); // 앞뒤로 줄바꿈
	    System.out.println("\t 12345"); // 
	    System.out.println("\r java10"); //
	    
	    
	    // 문제1
	    /* 출력결과
	     *            [[ 출석부 ]]
	     * ----------------------------------
	     * 이름		1교시    2교시    3교시   비고
	     * 강호동		출석		결석		출석
	     * 유재석		출석		결석		출석
	     */
	    
	    /*
	    System.out.println("\n\t     [[ 출석부 ]]");
	    System.out.println("-------------------------------------");
	    System.out.println("이름\t1교시\t2교시\t3교시\t비고");
	    System.out.println("강호동\t출석\t결석\t출석");
	    System.out.println("유재석\t출석\t결석\t출석");
	    System.out.println("-------------------------------------");
	    
	    System.out.println("\n\t     [[ 출석부 ]]\r-------------------------------------\r이름\t1교시\t2교시\t3교시\t비고\r강호동\t출석\t결석\t출석\r유재석\t출석\t결석\t출석\r-------------------------------------");
	    
	    System.out.println("\n\t\t[[출석부]]");
	    System.out.println("-------------------------------------");
	    System.out.println("이름\t1교시\t2교시\t3교시\t비고");
	    System.out.println("강호동\t1출석\t2결석\t3출석\t");
	    System.out.println("유재석\t1출석\t2결석\t3출석\t");
	    System.out.println("-------------------------------------");
	    */
	    
	    // 문제2 : 고양이
	    /*
    \    /\
	 )  ( ')
	(  /  )
	 \(__)|
	        
	     
	     
	    
	     문제3 : 개
	     
	     	|\_/|
	        |q p|   /}
	        ( 0 )"""\
	        |"^"`
	        ||_/=\\__|
	     
	     
	     */
	    
	    
	    System.out.println("\n\t\\    /\\");
	    System.out.println("\t )  ( ')");
	    System.out.println("\t(  /  )");
	    System.out.println("\t \\(__)|");
	    
	    System.out.println("\n\t|\\_/|");
	    System.out.println("\t|q p|   /}");
	    System.out.println("\t( 0 )\"\"\"\\"); // " " 문자처리 연산자 = > 하나당 앞에 \백슬레쉬 하나씩 붙여야 출력됌
	    System.out.println("\t|\"^\"`");
	    System.out.println("\t||_/=\\\\__|");
	   
	    		
	    
	    
	    
	    
	    
	    
	    
	} // m e 메인 끝
	
	// 출력
	

} // c e 클래스 끝
