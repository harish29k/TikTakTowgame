package game;

public class TikTakToyGame {

	public static void main(String[] args) {
		System.out.println("start game");
		creatboard();
	}

	public static void creatboard() {
		char board[] = new char[10];
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
	}

}



