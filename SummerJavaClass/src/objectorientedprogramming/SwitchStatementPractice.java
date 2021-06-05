package objectorientedprogramming;


public class SwitchStatementPractice {
	public static int movie;
	public static int show;
	public static int book;
	public static int comic;
	public static int mediaCosts;


	public SwitchStatementPractice(int price) {
		 mediaCosts = price;
	}
		
	private static int totalCosts(int price) {

		int mediaCosts = new Long(Math.round(price)).intValue();

			switch (mediaCosts) {
			case 3:
				return price+3;

			case 4:
				return price+4;
				
			case 10 :
				return price+2;
				

			case 30:
				return price+10;


			default:
				return 0;

			}

		}

	public static double costs(){
		return (totalCosts(movie) + totalCosts(book) + totalCosts(show) + totalCosts(comic));

	}


	public static void main(String[] args) {

	SwitchStatementPractice.comic = 3;
	SwitchStatementPractice.book = 4;
	SwitchStatementPractice.movie = 10;
	SwitchStatementPractice.show = 30;
			
		System.out.println(SwitchStatementPractice.costs());
	}

	
		
	}







