package pack;

public class Rectangular {
	public static void main(String[] args) {

//		//Asterisk Pattern
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
//		//Printing J
//		for (int i = 0; i < 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
//		//Printing I
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
//		//Printing Alphabet (Changing at every column)
//		for (int i = 1; i <= 5; i++) {
//			char k='A';
//			for (int j = 0; j < 5; j++) {
//				System.out.print(k+" ");
//				k++;
//			}
//			System.out.println();
//		}
		
		
		//Printing Alphabet (Changing at every Row)
				for (char i = 'A'; i <= 'E'; i++) {
					
					for (char j = 'A'; j <= 'E'; j++) {
						System.out.print(i+" ");
					}
					
					System.out.println();
				}
		
		

	}
}
