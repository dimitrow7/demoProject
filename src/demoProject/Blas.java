package demoProject;

public class Blas {

	// Zadacha 1
		public static void sort(int[] array) {
			// Izpolzvame metodat na mehurcheto za sortirane na masiva
			int temp = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = 1; j < (array.length - i); j++) {

					if (array[j - 1] > array[j]) {
						temp = array[j - 1];
						array[j - 1] = array[j];
						array[j] = temp;
					}

				}

			}
			System.out.println(java.util.Arrays.toString(array));
			;
		}

		// Zadacha 2
		public static void exist(String[] stringsArray, String element) {
			String existingElement = null;
			boolean isExisting = true;
			for (int i = 0; i < stringsArray.length; i++) {
				if (stringsArray[i] == element) {
					isExisting = true;
					existingElement = stringsArray[i];

				}
				if (stringsArray[i] != element) {
					isExisting = false;
				}

			}
			if (isExisting == true) {
				System.out.println("Found matching." + " The repeated element is " + existingElement);
			}
			if (isExisting == false) {
				System.out.println("There are no repeated elements!");
			}

		}

		// Zadacha 3
		public static void vowels(String str) {
			int count = 0;
			char[] vowels = { 'a', 'A', 'i', 'I', 'u', 'U', 'e', 'E', 'o', 'O' };
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < vowels.length; j++) {
					if ((str.charAt(i)) == vowels[j]) {
						count++;
					}
				}
			}
			if (count >= 1) {
				System.out.println("Number of vowels present in the given String is " + count);
			} else {
				System.out.println("There are no vowels present in the given String!");
			}
		}

		// Zadacha 4
		public static boolean prime(int n) {
			boolean isPrime = true;
			int divider = 2;
			int maxDivider = (int) Math.sqrt(n);
			while (isPrime && (divider <= maxDivider)) {
				if (n % divider == 0) {
					isPrime = false;
				}
				divider++;
			}
			return isPrime;
		}

		// Zadacha 5
		public static int sumMatrix(int[][] matrix) {
			int sum = 0;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[2].length; j++) {
					sum += matrix[i][j];
				}

			}
			return sum;
		}

		public static void main(String[] args) {
			// Zadacha 1
			int[] array = { 17, 55, 47, 12, 66, 712, 32 };
			System.out.print("Sorted array, usign bubble sort algo: ");
			sort(array);
			System.out.println();
			// Zadacha 2
			String[] stringsArray = { "Hello", "My", "Name", "Is", "Vladi" };
			String element = "Vladi";
			exist(stringsArray, element);
			System.out.println();
			// Zadacha 3
			String str = "The quick brown fox";
			vowels(str);
			System.out.println();
			// Zadacha 4
			System.out.println("Is prime number? - " + prime(5));
			System.out.println();
			// Zadacha 4
			int[][] matrix = { { 3, 5, 6, 1 }, { 3, 5, 6, 1 }, { 3, 5, 6, 1 } };
			System.out.println("The sum of all matrix elements is " + sumMatrix(matrix));

		}

	}


}
