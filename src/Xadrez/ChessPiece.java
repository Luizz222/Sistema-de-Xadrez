package Xadrez;

import Tabuleiro.Piece;
import Tabuleiro.Tabuleiro;

public class ChessPiece  extends Piece {

    private Color color;

    public ChessPiece(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


}
