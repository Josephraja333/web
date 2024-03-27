import java.util.Scanner;
public class Chess{
	final String[][] board; 
    
    String resetColor = "\u001B[0m";
    String blackRook = "\u265C";
    String blackKnight = "\u265E";
    String blackBishop = "\u265D";
    String blackQueen = "\u265B";
    String blackKing = "\u265A";
    String blackPawn = "\u265F";
    String whiteRook = "\u2656";
    String whiteKnight = "\u2658";
    String whiteBishop = "\u2657";
    String whiteQueen = "\u2655";
    String whiteKing = "\u2654";
    String whitePawn = "\u2659";

    public Chess(){
         this.board = new String[8][8];
    }

    public void changeColour(String blackColor,String whiteColor){
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row+col)%2==0) {
                    board[row][col] = blackColor + "   " + resetColor;
                } else {
                    board[row][col] = whiteColor + "   " + resetColor;
                }
            }
        }

        board[0][0] = blackColor + " " + blackRook   + " " + resetColor;
        board[0][1] = whiteColor + " " + blackKnight + " " + resetColor;
        board[0][2] = blackColor + " " + blackBishop + " " + resetColor;
        board[0][3] = whiteColor + " " + blackQueen  + " " + resetColor;
        board[0][4] = blackColor + " " + blackKing   + " " + resetColor;
        board[0][5] = whiteColor + " " + blackBishop + " " + resetColor;
        board[0][6] = blackColor + " " + blackKnight + " " + resetColor;
        board[0][7] = whiteColor + " " + blackRook   + " " + resetColor;

        board[1][0] = whiteColor + " " + blackPawn   + " " + resetColor;
        board[1][1] = blackColor + " " + blackPawn   + " " + resetColor;
        board[1][2] = whiteColor + " " + blackPawn   + " " + resetColor;
        board[1][3] = blackColor + " " + blackPawn   + " " + resetColor;
        board[1][4] = whiteColor + " " + blackPawn   + " " + resetColor;
        board[1][5] = blackColor + " " + blackPawn   + " " + resetColor;
        board[1][6] = whiteColor + " " + blackPawn   + " " + resetColor;
        board[1][7] = blackColor + " " + blackPawn   + " " + resetColor;

        board[7][0] = whiteColor + " " + whiteRook   + " " + resetColor;
        board[7][1] = blackColor + " " + whiteKnight + " " + resetColor;
        board[7][2] = whiteColor + " " + whiteBishop + " " + resetColor;
        board[7][3] = blackColor + " " + whiteQueen  + " " + resetColor;
        board[7][4] = whiteColor + " " + whiteKing   + " " + resetColor;
        board[7][5] = blackColor + " " + whiteBishop + " " + resetColor;
        board[7][6] = whiteColor + " " + whiteKnight + " " + resetColor;
        board[7][7] = blackColor + " " + whiteRook   + " " + resetColor;

        board[6][0] = blackColor + " " + whitePawn   + " " + resetColor;
        board[6][1] = whiteColor + " " + whitePawn   + " " + resetColor;
        board[6][2] = blackColor + " " + whitePawn   + " " + resetColor;
        board[6][3] = whiteColor + " " + whitePawn   + " " + resetColor;
        board[6][4] = blackColor + " " + whitePawn   + " " + resetColor;
        board[6][5] = whiteColor + " " + whitePawn   + " " + resetColor;
        board[6][6] = blackColor + " " + whitePawn   + " " + resetColor;
        board[6][7] = whiteColor + " " + whitePawn   + " " + resetColor;
    }

	public String toString() {
        String res = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                res+= board[i][j];
            }
            res+= "\n";
        }
        return res;
    }


    public static void main(String[] args){
    	Chess obj = new Chess();
        Scanner scan = new Scanner(System.in);
        obj.changeColour("\u001B[40m","\u001B[47m");
    	System.out.println(obj);
        System.out.println("If you want to change colour type the below option number or type any other numbers to not change");
        System.out.println("1.Blue and Green");
        System.out.println("2.Orange and Red");
        System.out.println("3.Pink and Blue");
        System.out.println("4.Black and Green");
        int x = scan.nextInt();


        switch(x){
            case 1:
                obj.changeColour("\u001B[44m","\u001B[42m");
                break;
            case 2:
                obj.changeColour("\u001B[43m","\u001B[41m");
                break;
            case 3:
                obj.changeColour("\u001B[45m","\u001B[46m");
                break;
            case 4:
                obj.changeColour("\u001B[40m","\u001B[42m");
                break;
        }
        System.out.println(obj);


    }


}