

public class TicTacToe{

	static class Player{
		int flag;

		public Player(int flag){
			this.flag = flag;
		}
	}

	Player[][] board = new Player[3][3];

	private boolean check(Player[][] board, Player player, int x, int y){
		//Check Vertical
		for(int i=0; i<board.length; i++){
			if(board[i][y] != player)
				break;
			if(i == board.length-1)
				return true;
		}
		//Check Horizontal
		for(int i=0; i<board[0].length; i++){
			if(board[x][i] != player)
				break;
			if(i == board.length-1)
				return true;
		}
		return false;
		//Check Diagonal
		//Check OtherDiagonal
	}

	private void move(Player player, int x, int y){
		board[x][y] = player;
		boolean result = check(board,player, x, y);
		if(result){
			System.out.println(player.flag+" WINS");
		}
		System.out.println("MOVES");
	}




	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		Player player1 = new Player(0);
		Player player2 = new Player(1);

		t.move(player1, 0, 0);
		t.move(player1, 0, 1);
		t.move(player1, 0, 2);
	}
}