
public class Horno extends GamaBlanca {
	private boolean pirolitico;
	public Horno(String fabricante, double precio, char clasificacionEnergetica, boolean pirolitico, int descuento) {
		super(fabricante, precio, clasificacionEnergetica, descuento);
		this.pirolitico = pirolitico;
	}
	public boolean isPirolitico() {
		return pirolitico;
	}

}
