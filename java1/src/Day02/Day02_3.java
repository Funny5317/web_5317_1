package Day02;  // 깃허브 강사님 자료보고 수정해야함.

public class Day02_3 {

	/* p.64 연산자 [ 연산시 사용되는 특수문자 ]
	 * 
		 산술연산자 : +(더하기) - * / %(나머지)
		 		+ ( 연결연산자 )
		 
		 비교연산자 :  결과값은 ture & flase 로 두가지로 나온다.
	     	>= 이상[크거나 같다]	> 초과 [ 크다 ]	== [같다]		
	     	<= 이하[작거나 같다]	< 미만 [ 작다 ]	!= [ 같지않다 ]
	
		 논리연산자 : 비교연산자가 2개 이상일때
		 	&& : AND [이면서 , 면서 , 이고 , 그리고 , 모두]	다 포함
		 	|| : OR  [이거나 , 거나 , 또는 , 하나라도 ]		하나포함
			!  : NOT [ 부정 ( 반대 ) ]
			
		 대입연산자 :
		 	=	[ 오른쪽값을 왼쪽에 대입 ]
		 	+=	[ 오른쪽값을 왼쪽값에 더한후 왼쪽에 대입 ]
		 	     ex) *= /= %=
		 	
		 	
		 증감연산자 : 
		 	++ [ 1증가 ]
		 	-- [ 1감소 ]
		 	
		 조건연산자 :
		 	조건식 ? true(참) : false(거짓)
		 	
		 	
		 
		 	
	   ( p.67 연산자 우선순위 참조 )
	    
	     ex) 괄호 -> 증감 -> 곱셈 -> 덧셈 -> -> 비교 -> 논리 -> 대입 등등
		
		 	
       */
			public static void main(String[] args) {
				
				int 정수1 = 10; int 정수2 = 20;
				System.out.println(" 더하기 : " + 정수1+정수2 );		// 문자 + 숫자 + => 연결연산자
				System.out.println(" 더하기 : " + (정수1+정수2));	// 숫자 + 숫자
				System.out.println(" 빼기  : " + (정수1-정수2));
			    System.out.println(" 곱하기 : " + (정수1*정수2));
			    System.out.println(" 나누기 : " + (정수1/정수2));
			    System.out.println(" 나머지 : " + (정수1%정수2));
			
			
		 	
			// p.40 : 증감연산자
			    // 규칙적인 증가/감소
			    // 정수1 = 정수1 + 1     ( 컴퓨터 처리순서 뒤의 정수1을 불러와서 +1을 하고 , 왼쪽 정수1에 오른쪽 정수1값을 저장 )
			    // 정수1 += 1
		    정수1++; System.out.println(" 증가 : " + 정수1);
		    정수1--; System.out.println(" 감소 : " + 정수1);
				// 선위증가[ ++변수명 ] , 후위증가[ 변수명++ ] , ( 변수 앞에있으면 프린트 되기전에 연산 , 뒤는 반대 )
		    System.out.println(" 선위증가 : " + ++정수1);	// 1증가 11
		    System.out.println(" 확인 : " + 정수1);		// 확인 11
		    System.out.println(" 후위증가 : " + 정수1++);	// 1증가 11
		    System.err.println(" 확인 : " + 정수1);		// 12
		    
		    System.err.println(" 선위감소 : " + --정수1);	// 1감소 11
		    System.err.println(" 확인 : " + 정수1);		// 11
		    System.err.println(" 후위감소 : " + 정수1--);	// 1감소 11
		    System.err.println(" 확인 : " + 정수1);		// 10
		    
		    // p.88~89 : 비교연산자
		    System.out.println(" 이상 : " + (정수1 >= 정수2));		// 10 >= 20 false
		    System.out.println(" 이하 : " + (정수1 <= 정수2));		// 10 <= 20 true
		    System.out.println(" 초과 : " + (정수1 > 정수2));		// 10 > 20  false
		    System.out.println(" 미만 : " + (정수1 < 정수2));		// 10 < 20	ture
		    System.out.println(" 같다 : " + (정수1 = 정수2));		// 10 = 20 	false
		    System.out.println(" 같지않다 : " + (정수1 != 정수2));	// 10 != 	true
		    
		    // p.92 : 논리연산자 : AND / OR : 비교연산자가 2개 이상일때
		    	// AND : 2개 이상의 비교 연산자가 모두 true => 결과 true // 하나라도 false => 결과 false
		    int 정수3 = 30; int 정수4 = 40;
		    System.out.println(" AND : " + (정수1 >= 정수2 && 정수4 >= 정수3) ); // F && T = F
		    System.out.println(" OR " + (정수1 >= 정수2 || 정수4 >= 정수3)); 	 // F || T = T
		    System.out.println(" not : " + !(정수1 >= 정수2 || 정수4 >= 정수3)); // !T => F
		    
		    // p.98 대입연산자 : 
		    정수1 += 1;	// 변수명 += 값		오른쪽값을 왼쪽변수명 더한후에 왼쪽 변수에 대입
		    정수1 *= 1;		System.out.println( 정수1 );
		    정수1 -= 10;		System.out.println( 정수1 );
		    정수1 /= 10;		System.out.println( 정수1 );
		    
		    // p.100 : 조건 연산자 [조건식(비교연산자) ? 참(true) : 거짓(false)]
		    	int 점수 = 85;
		    	char 등급 = 점수 > 90 ? 'A' : 'B' ; 						System.out.println( 등급 );
		    	char 등급2 = 점수 > 90 ? 'A' : 점수 > 80 ? 'B' : 'C' ;		System.out.println( 등급2 );
		    	

			}

}

