package chess.units;

import chess.boardgame.Board;
import chess.utils.DynamicVectorPosition;
import chess.utils.Position;

/**
 * Programming Methodology Practice. MiniChess - An example of Object Oriented
 * Programming. Class Knight - class that represents knight piece in chess
 * 
 * @author Jorge Puente Peinador y Ramiro Varela Arias
 * @author Juan Luis Mateo
 *
 */
public class Queen extends Piece{


	/**
	 * Constructor
	 * 
	 */
	public Queen() {
		super();
	}



	public char toChar() {
		// TODO
		return 'N';
	}




	/**
	 * Generate all possible positions after all possible movements of the Piece
	 * 
	 * @param currentBoard the board
	 * @return the dynamic vector of XYLocations of possible movements
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
	public String toString() {
		return "The knight in position " + ((this.getPosition() != null) ? this.getPosition() : "(-,-)");
	}
}
