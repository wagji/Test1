package Java_Class;

import java.util.Scanner;

public class MovieMenu
{
	Scanner sc = new Scanner (System.in)  ;
	// ist <Account> aList = new ArrayList<> () ;
	Movie a = new Movie () ;

	int select, b;
	//1. Student 객체를 인풋 만큼 계좌를 만듬 ,각ㅐ체에 이름 , 계좌번호 , 자동으로 만들어서 
		
	void MovieMenu()
	{
		out :	do {
	          
			System.out.println("====================================");
			System.out.println("========== 1. 영화 정보 입력============");
			System.out.println("=========== 2. 영화 정보 전체 검색=======");
			System.out.println("===========3. 영화명 검색===============");
			System.out.println("========== 4. 영화 감독별 검색===========");
			System.out.println("========== 5. 영화 장르별 검색===========");
			System.out.println("=========== 6. 영화 정보 삭제============");
			System.out.println("======== 0. 종료 ======================");
			System.out.println("========위의정수를입력하세요>>>>>===========");
						
		 select = sc.nextInt();
					
				switch (select )  
					
				{
				case 1 : 
				System.out.println("영화 정보입력 : ");
			
					
					
					break ;
						 
				 case 2  :
					 System.out.println("영화 정보전체검색 : ");
					 b = sc.nextInt();
				 
					break ;
							
				 case 3   : 
					System.out.println("영화명 검색 : " );
						b = sc.nextInt();
				
					 break ;
							 
				 case 4   : 
				 System.out.println("영화 감독별 검색 : " );
				 b = sc.nextInt();
				 
			 break ;
							 
			 case 5   : 
				 System.out.println("영화 장르별 검색 : ");
				 b = sc.nextInt();
				 
				 break ;
							 
				 case 6  : 
				 System.out.println("영화정보 삭제  : " );
				 b = sc.nextInt();
					 
				 break ;
							 
			 case 0  : 
				
				break out; 	
				 }  
					
		   } while  (true) ;
	}
	
	 

}
	
		
	
