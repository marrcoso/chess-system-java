package chess;

import boardgame.Position;

public class ChessPosition{
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Erro instanciando ChessPosition: Valores válidos apenas de a1 à h8.");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition (Position position) {
        return new ChessPosition((char)('a' - position.getCol()),  8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}
