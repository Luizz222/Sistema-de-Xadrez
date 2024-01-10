package Aplication;

import Xadrez.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] Piece){
        for (int i = 0; i <Piece.length ; i++) {
            System.out.print(8-i + " ");
            for (int j = 0; j <Piece.length ; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
        System.out.println("  a b c d e f j h");
    }

    public static void printPiece(ChessPiece Piece){
        if (Piece == null){
            System.out.println("-");
        }
        else{
            System.out.println(Piece);
        }
        System.out.println(" ");
    }


}
