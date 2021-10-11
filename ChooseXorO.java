package game;


public class ChooseXorO {

	public static void main(String[] args) {
	
			creatboard();
			playerChoose();
		}

		public static void creatboard() {
			char board[] = new char[10];
			for (int i = 1; i < board.length; i++) {
				board[i] = ' ';
			}
		}

		
		public static void playerChoose() {
          int playerX = 0;
          int playero = (int) Math.floor(Math.random() * 10) %2;
          if(playero == playerX) {
        	  System.out.println("player is X");
          }
          else {
        	  System.out.println(" player is o");
          }
          
	}

}
