package Java_Class;

import java.util.List;
import java.util.Scanner;

public class MovieMenu
{
	MovieMgr mg = new MovieMgr();
	Scanner sc = new Scanner(System.in);
	int select = 0, grade = 0;
	String title, director, genre;
	MovieMenu(){}
	
	void movieMenu()
	{
		
   out :do
		{
			System.out.println("==============================================");
			System.out.println("1. 영화 정보 입력");
			System.out.println("2. 영화 정보 전체 검색");
			System.out.println("3. 영화명 검색");
			System.out.println("4. 영화 감독별 검색");
			System.out.println("5. 영화 장르별 검색");
			System.out.println("6. 영화 정보 삭제");
			System.out.println("7. 종료");
			System.out.println("==============================================");
			select = sc.nextInt();
			
			switch(select)
			 {
			
			  case 1:
				 Movie m1 = new Movie();
				 System.out.println("1. 영화 정보 입력");
				 
				 System.out.println("영화 제목 : ");
				 title = sc.next();
				 m1.setTitle(title);
				 
				 System.out.println("영화 감독 : ");
				 director = sc.next();
				 m1.setDirector(director);
				 
				 System.out.println("영화 등급 : ");
				 grade = sc.nextInt();
				 m1.setGrade(grade);
				 
				 System.out.println("영화 장르 : ");
				 genre = sc.next();
				 m1.setGenre(genre);

				 mg.add(m1);
				 break;
				 
			  case 2:
				 mg.search();
				 break;
				 
			  case 3:
				 System.out.println("검색할 영화 이름을 입력하세요. : ");
				 title = sc.next();
				 mg.search(title); 
				 break;

			  case 4:
				 System.out.println("검색할 감독 이름을 입력하세요. : ");
				 director = sc.next();
				 mg.searchDirector(director);
				 break;
				 
			  case 5:
				 System.out.println("검색할 장르 이름을 입력하세요. : ");
				 genre = sc.next();
				 List<Movie> a = mg.searchGenre(genre);
				 //System.out.println("블락사이즈: " + a.size());
				 
				 for(int i = 0; i < a.size(); i++)
				 {
				     //System.out.println("블락 출력됨 ");
				     System.out.println(a.get(i));
					 
				 }
	  			 break;

			  case 6:
				 System.out.println("삭제할 영화 제목을 입력하시오."); 
				 title = sc.next();
				 mg.delete(title);
	  			 break;

			  case 7: 
				 break out;
			 }

		}while(true);

	}
//aaaaaa
	 

}
	
		
	
