package chess.boardgame;

import chess.units.King;
import chess.units.Knight;

/**
 * Programming Methodology Practice. MiniChess - An example of Object Oriented
 * Programming. Class Square - class that represents each one of the squares in
 * the board
 * 
 * @author Jorge Puente Peinador y Ramiro Varela Arias
 * @author Juan Luis Mateo
 *
 */

public class Square {
	private King kingPiece; // the king piece that is in this square
	// TODO
	;// the knight piece that is in this square

	/**
	 * Constructor for an empty square (without a piece)
	 */
	public Square() {
		kingPiece = null;
		// TODO
	}

	/**
	 * Get the piece in this square
	 * 
	 * @return the piece in this square, or null if there isn't any
	 */
	public King getKingPiece() {
		return kingPiece;
	}

	public Knight getKnightPiece() {
		// TODO
		return null;
	}

	/**
	 * Set the piece in the square
	 * 
	 * @param piece the piece that is placed in the square
	 */
	public void setPiece(King piece) {
		setNoPiece();
		this.kingPiece = piece;
	}

	public void setPiece(Knight piece) {
		// TODO
	}

	public void setNoPiece() {
		this.kingPiece = null;
		// TODO
	}

	/**
	 * Checks if the square has a piece in it
	 * 
	 * @return true if it doesn't a piece
	 */
	public boolean empty() {
		// TODO
		return (kingPiece == null);
	}

	/**
	 * Generate a printable version of the object as String (Overridden method)
	 * 
	 * @return The printable version of the square as String
	 */
	@Override
	public String toString() {
		if (kingPiece != null)
			return String.format("%c", kingPiece.toChar());
		// TODO
		return "-";

	}
}
