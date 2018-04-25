import java.util.Scanner;
public class PigLatinConverter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] letters = null;
		System.out.print("Enter text: ");
		Scanner keyboard = new Scanner(System.in);
		String english = keyboard.nextLine();
		for (int i = 0; i <= english.length(); i++) {
			if (i == 0) {
				continue;
			} else {
				letters[i] = english.substring(i-1, i);
			}
		}
	}

}
