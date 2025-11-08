package pack;

public class UpperLeft_Matrix {
	public static void main(String[] args) {

		//Asterisk
		for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j <= i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
		
		
		//Printing J (Changing at every Column)
		for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j <= i) {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
		
		
		//Printing I (Changing at every Row)
		int s=1;
		for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j <= i) {
                    System.out.print(s+" ");
                }
            }
            s++;
            System.out.println();
        }
		
		
		//Printing Alphabets (Changing at every Column) 
		for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'A'; j <= 'E'; j++) {
                if (j <= i) {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
		
		
		//Printing Alphabets (Changing at every Row) 
		char k='A';
		for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j <= i) {
                    System.out.print(k+" ");
                }
            }
            System.out.println();
            k++;
        }
		
	}
}
