package Day02;

public class Day02_5 {
	
	// 문자 : char    ' ' 작은따옴표 써야함
	// 문자열 : 자료형 없음 => String 클래스 "" 큰따옴표 써야함
	public static void main(String[] args) {
		
		char 문자 = 'a';
		//char 문자 = 'abc'; // char은 2바이트라서 하나의 문자만 저장가능
		//1. string 이용한 문자열 저장
		String 문자열1 = "abc"; System.out.println( 문자열1 );  //문자열을 자료형으로 못바꿔서 쓰는것 string
		
		//2. 배열을 이용한 문자열 저장
		char[] 문자열2 = { 'a' , 'b' , 'c' }; System.out.println( 문자열2[0] + 문자열2[1] + 문자열2[3]);
		System.out.println( 문자열2 );
		
		// String : 문자열관리 해주는 클래스
			// 객체는 비교 연산자 불가 [ .equals(문자열) ]  .equals를 사용하면 객체 비교가 가능해진다 
		    // 오브젝트가 자동으로 자바에 주입되기때문에 옵젝 선언안해도 .equals를 사용가능
			// 객체 비교 메소드 [.equals(문자열)]
	    String 이름 = "유재석";					// 영문 한글자 = 1byte , 한글 한글자 = 2byte씩 잡아먹는다.
	    String 이름2 = new String("강호동");
	    
	    // 정해져있는 자료형에는 new를 선언 하지않아도 된다 
		
	    System.out.println( 이름 == 이름2 );
	    System.out.println( 이름.equals(이름2) );
		
		
	}

}
