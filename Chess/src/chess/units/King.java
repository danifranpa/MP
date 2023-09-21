package chess.units;

import chess.boardgame.Board;
import chess.utils.DynamicVectorPosition;
import chess.utils.Position;

/**
 * Programming Methodology Practice. MiniChess - An example of Object Oriented
 * Programming. Class Position - class that represents the king piece in chess
 * 
 * @author Jorge Puente Peinador y Ramiro Varela Arias
 * @author Juan Luis Mateo
 *
 */
public class King extends Piece{
	

	/**
	 * Constructor
	 * 
	 */
	public King() {
		super();
	}

	
	public char toChar() {
		return 'K';
	}

	
	

	/**
	 * Return the dynamic array of possible squares where a King can move directly
	 * from its current position:(N, S, E, W, NW, NE, SW and SE)
	 * 
	 * @param currentBoard the board
	 * @return a dynamic vector of positions
	 */
	protected DynamicVectorPosition generatePossiblePositions(Board currentBoard) {
		DynamicVectorPosition positions = new DynamicVectorPosition();

		// N
		positions.add(this.getPosition().north());
		// S
		positions.add(this.getPosition().south());
		// W
		positions.add(this.getPosition().west());
		// E
		positions.add(this.getPosition().east());
		// S->E
		positions.add(this.getPosition().south().east());
		// S->W
		positions.add(this.getPosition().south().west());
		// N->E
		positions.add(this.getPosition().north().east());
		// N->W
		positions.add(this.getPosition().north().west());

		return positions;
	}

	@Override
	public String toString() {
		return "The king in position " + ((this.getPosition() != null) ? this.getPosition() : "(-,-)");
	}
}
