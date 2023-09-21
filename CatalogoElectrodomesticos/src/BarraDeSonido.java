
public class BarraDeSonido extends GamaMarron {
	private int decibelios;

	public BarraDeSonido(String fabricante, double precio, char clasificacionEnergetica, int decibelios, int descuento) {
		super(fabricante, precio, clasificacionEnergetica, descuento);
		this.setDecibelios(decibelios);
	}

	public int getDecibelios() {
		return decibelios;
	}

	public void setDecibelios(int decibelios) {
		this.decibelios = decibelios;
	}

	
}
