package Xadrez;

import Tabuleiro.Tabuleiro;

public class ChessMatch {

    private Tabuleiro tabuleiro;

    public ChessMatch(){
        tabuleiro = new Tabuleiro(8,8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[tabuleiro.getRows()][tabuleiro.getColumns()];
        for (int i = 0; i < tabuleiro.getRows(); i++) {
            for (int k = 0; k < tabuleiro.getColumns(); k++) {
                mat[i][k] = (ChessPiece)tabuleiro.piece(i,k);
            }
        }
        return mat;
    }
}
