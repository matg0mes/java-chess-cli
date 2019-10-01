package Chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

	public boolean isThereOpponentPiece(Position position) {
		ChessPiece chessPiece = (ChessPiece) getBoard().piece(position);
		return chessPiece != null && chessPiece.getColor() != color;
	}

}
