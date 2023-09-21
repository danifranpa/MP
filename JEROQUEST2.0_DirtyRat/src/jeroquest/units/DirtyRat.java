package jeroquest.units;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class DirtyRat extends Monster {

	// initial values for the attributes
	protected static final int MOVEMENT = 4;
	protected static final int ATTACK = 2;
	protected static final int DEFENSE = 2;
	protected static final int BODY = 5;

	private boolean fearful;

	/**
	 * Create a dirty rat from its name
	 * 
	 * @param name rat's name
	 */
	public DirtyRat(String name) {
		super(name, MOVEMENT, ATTACK, DEFENSE, BODY);
		setFearful(false);
	}

	public boolean isFearful() {
		return fearful;
	}

	public void setFearful(boolean fearful) {
		this.fearful = fearful;
	}

	/************************************************
	 * Interface Piece implementation
	 **********************************************/

	/**
	 * Generate a text representation of the character in the board (implementing an
	 * abstract method)
	 * 
	 * @return the text representation of the object in the board
	 */
	public char toChar() {
		return 'R';
	}

	/************************************************
	 * Interface GraphicElement implementation
	 **********************************************/

	// Goblin icon
	protected static Icon icon = new ImageIcon(ClassLoader.getSystemResource("jeroquest/gui/images/rat.png"));
	protected static Icon icon_fearful = new ImageIcon(
			ClassLoader.getSystemResource("jeroquest/gui/images/fearful_rat.png"));

	public Icon getImage() {
		if (isFearful())
			return icon_fearful;
		else
			return icon;
	}

	@Override
	public boolean isEnemy(Character c) {
		return super.isEnemy(c) || (c.getBody() < this.getBody());
	}

	@Override
	public int defend(int impacts) {
		int wounds = super.defend(impacts);
		if (wounds > 0) {
			if (this.fearful && wounds >= (this.getBodyInitial() / 2)) {
				this.setBody(0); // it dies of fear
			} else
				this.fearful = true; // it gets scared of the impact
		} else // the attack didn�t damage it
			this.fearful = false;
		return wounds;
	}

	@Override
	public void resolveTurn() {
		if (!isFearful())
			super.resolveTurn();
	}

	public void regenerate() {
		if (this.getBody() < this.getBodyInitial())
			this.setBody(this.getBody() + 1);
	}
}
