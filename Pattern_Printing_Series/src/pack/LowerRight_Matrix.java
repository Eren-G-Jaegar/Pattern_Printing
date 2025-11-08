package pack;

public class LowerRight_Matrix {
	public static void main(String[] args) {
		
		
		
		//Asterisk
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=5-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		//Printing J (Changing at every Column)
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=5-i) {
					System.out.print(" ");
				}
				else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
		
		//Printing I (Changing at every Row)
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=5-i) {
					System.out.print(" ");
				}
				else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
		
		
		//Printing Alphabets (changing at every Column)
		for(char i='A';i<='E';i++) {
			for(char j='A';j<='E';j++) {
				if(j<134-i) {
					System.out.print(" ");
				}
				else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
		
		
		//Printing Alphabets (Changing at every Row)
		for(char i='A';i<='E';i++) {
			for(char j='A';j<='E';j++) {
				if(j<134-i) {
					System.out.print(" ");
				}
				else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
		
		
	}
}
