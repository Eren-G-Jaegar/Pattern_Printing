package pack;

public class Nepal_Flag {
	public static void main(String[] args) {

		// Asterisk
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// Printing J (Changing at every Column)
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// Printing I (Changing at every Row)
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// Printing Alphabets (Changing at every Column)
		for (char i = 'E'; i >= 'A'; i--) {
			for (char j = 'A'; j <= 'E'; j++) {
				if (j <= i) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				if (j <= i) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// Printing Alphabets (Changing at every Column)
		for (char i = 'E'; i >= 'A'; i--) {
			for (char j = 'A'; j <= 'E'; j++) {
				if (j <= i) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				if (j <= i) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

	}
}
