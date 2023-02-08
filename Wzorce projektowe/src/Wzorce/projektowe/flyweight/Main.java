package Wzorce.projektowe.flyweight;

public class Main {

    public static void main(String[] args) {
        ChessPiece blackPawn = new BlackPiece("Czarny Pionek", "7", "a");
        ChessPiece whitePawn = new WhitePiece("Biały pionek", "2", "a");
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
        ChessPiece whiteQueen = new WhiteQueen("Biała Królowa");

        //exactly same color object is used
        System.out.println(blackPawn.getColor()==blackQueen.getColor());
        System.out.println(whitePawn.getColor()==whiteQueen.getColor());


    }
}
