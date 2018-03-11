/*
 * Name: Habib Mohamed
 * Date: November 5, 2017
 * Purpose: Defines methods for a tic-tac-toe game
 * 
 * */


public class Game{
	
	private char player1; //Player1's character
	private char player2; //Player2's character
	private char board[][];
	private boolean player1Turn; //Checks if its player1's turn
	private boolean player2Turn; //Checks if its player2's turn
	
	//Constructor, takes in chars that are player1's and player2's symbols, and gives first turn to player 1
	public Game(char symbol1, char symbol2) {
		
		player1 = symbol1;
		player2 = symbol2;
		player1Turn = true;
		player2Turn = false;
		board = new char[3][3];
		
		
	}
	
	//Defines a player move
	public char move(int r, int c){
			
		char mark = turn(); //Checks whose turn it is
					
		board[r][c] = mark; //Place symbol in specified cell
		
		return mark;
		
		
	}
	
	//Checks whose turn it is
	private char turn() {
		
		//If its player1's turn, player1's symbol is returned
		if(player1Turn == true && player2Turn == false) {
			
			player1Turn = false;
			player2Turn = true;
			
			return player1;
		
		//If its player2's turn, player2's symbol is returned	
		}else if(player1Turn == false && player2Turn == true) {
			
			player1Turn = true;
			player2Turn = false;
			
			return player2;
			
		}
		return 'E'; //In case of an error
		
	}
	
	
	//If Player1 has 3 in a row, column, or diagonal, they win
	public boolean checkIfPlayer1Win() {
		
		if((board[0][0] == player1 && board[1][0] == player1 && board[2][0] == player1)) {
			
			System.out.println("Player 1 wins!");
			
			return true;
			
		}else if((board[0][1] == player1 && board[1][1] == player1 && board[2][1] == player1)) {
			
			System.out.println("Player 1 wins!");
			
			return true;
			
		}else if((board[0][2] == player1 && board[1][2] == player1 && board[2][2] == player1)) {
			
			System.out.println("Player 1 wins!");
			
			return true;
			
		}else if((board[0][0] == player1 && board[0][1] == player1 && board[0][2] == player1)) {
			
			System.out.println("Player 1 wins!");
			
			return true;
			
		}else if((board[1][0] == player1 && board[1][1] == player1 && board[1][2] == player1)) {
			
			System.out.println("Player 1 wins!");
			
			return true;
			
		}else if((board[2][0] == player1 && board[2][1] == player1 && board[2][2] == player1)) {
			
			System.out.println("Player 1 wins!");
			
			return true;
			
		}else if((board[0][0] == player1 && board[1][1] == player1 && board[2][2] == player1)) {
			
			System.out.println("Player 1 wins!");
			
			return true;
			
		}else if((board[2][2] == player1 && board[1][1] == player1 && board[2][0] == player1)) {
			
			System.out.println("Player 1 wins!");
			
			return true;
			
		}
		
		return false;
		
	}
	
	//If Player2 has 3 in a row, column, or diagonal, they win
	public boolean checkIfPlayer2Win() {
		
		if((board[0][0] == player2 && board[1][0] == player2 && board[2][0] == player2)) {
			
			System.out.println("Player 2 wins!");
			
			return true;
			
		}else if((board[0][1] == player2 && board[1][1] == player2 && board[2][1] == player2)) {
			
			System.out.println("Player 2 wins!");
			
			return true;
			
		}else if((board[0][2] == player2 && board[1][2] == player2 && board[2][2] == player2)) {
			
			System.out.println("Player 2 wins!");
			
			return true;
			
		}else if((board[0][0] == player2 && board[0][1] == player2 && board[0][2] == player2)) {
			
			System.out.println("Player 2 wins!");
			
			return true;
			
		}else if((board[1][0] == player2 && board[1][1] == player1 && board[1][2] == player1)) {
			
			System.out.println("Player 2 wins!");
			
			return true;
			
		}else if((board[2][0] == player2 && board[2][1] == player2 && board[2][2] == player2)) {
			
			System.out.println("Player 2 wins!");
			
			return true;
			
		}else if((board[0][0] == player2 && board[1][1] == player2 && board[2][2] == player2)) {
			
			System.out.println("Player 2 wins!");
			
			return true;
			
		}else if((board[2][2] == player2 && board[1][1] == player2 && board[2][0] == player2)) {
			
			System.out.println("Player 2 wins!");
			
			return true;
			
		}
		
		return false;
		
		
		
	}

	//If the whole board is filled without 3 of any in a row, column, or diagonal, its a draw
	public boolean checkforDraw() {
		
		boolean isFull = false;
		int filled = 0;
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				if(board[i][j] == player1 || board[i][j] == player2) {
					
					filled++;
					
				}
				
				
			}
			
		}
		
		if(filled == 9) {
			
			isFull = true;
			
			System.out.println("Its a draw.");
			
		}
		
		return isFull;
		
		
	}

	/*Checks if the cell in question has a player symbol
	private boolean checkIfOccupied(char board[][], int row, int col) {
		
		if(board[row][col] == 'X' || board[row][col] == 'O') {
			
			System.out.println("The cell you have specified is occupied.");
			
			return false;
			
		}else {
			
			return true;
			
		}
		
	}
	
	*/

}
