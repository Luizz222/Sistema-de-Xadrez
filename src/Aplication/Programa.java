package Aplication;

import Tabuleiro.Position;
import Tabuleiro.Tabuleiro;
import Xadrez.ChessMatch;

public class Programa {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }

}
