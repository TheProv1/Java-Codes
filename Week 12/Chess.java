import java.util.*;

interface Movable {
    void move(String newPos);
}

abstract class ChessPiece implements Movable {
    String name;
    String color;
    String curPos;
    public ChessPiece(String name, String color, String curPos){
        this.name = name;
        this.color = color;
        this.curPos = curPos;
    }

    @Override
    public void move(String newPos){
        System.out.println(color + " " + name + " moved from " + curPos + " to " + newPos);
    }
}

class King extends ChessPiece{
    public King(String color, String curPos){
        super("King", color, curPos);
    }
}

class Queen extends ChessPiece{
    public Queen(String color, String curPos){
        super("Queen", color, curPos);
    }
}

class Pawn extends ChessPiece{
    public Pawn(String color, String curPos){
        super("Pawn", color, curPos);
    }
}

class Chess{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ChessPiece> chessPiece = new ArrayList<>();

        System.out.print("Enter the number of pieces in the game: ");
        int numberOfChessPieces = sc.nextInt();
        sc.nextLine();

        String color;
        String name;
        String position;
        int userMainMenuOption;
        
        while (numberOfChessPieces != 0){
            System.out.print("\nChess Menu\n1. Enter King \n2. Enter Queen\n 3. Enter Pawn \nEnter your choice: ");
            userMainMenuOption = sc.nextInt();
            sc.nextLine();

            System.out.print("\nEnter the color of the piece: ");
            color = sc.nextLine();

            System.out.print("\nEnter the position of the piece[use chess terminology]: ");
            position = sc.nextLine();

            ChessPiece piece = null;

            switch (userMainMenuOption) {
                case 1:
                    piece = new King(color, position);
                    break;
                
                case 2:
                    piece = new Queen(color, position);
                    break;

                case 3:
                    piece = new Pawn(color, position);
                    break;
            
            
                default:
                    break;
            }
            
            if (piece == null){
                chessPiece.add(piece);
            }
            
            numberOfChessPieces -= 1;
        }

        sc.close();
    }
}
