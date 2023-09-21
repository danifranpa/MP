
public abstract class GamaMarron extends Producto {

	private static final int MIN_DESCUENTO = 7;

	public GamaMarron(String fabricante, double precio, char clasificacionEnergetica, int descuento) {
		super(fabricante, precio, clasificacionEnergetica, descuento);
	}

	@Override
	public void setDescuento(int descuento) {
		super.setDescuento(Math.max(descuento, GamaMarron.MIN_DESCUENTO));
	}

}
