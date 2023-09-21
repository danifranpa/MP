
public class Frigorifico extends GamaBlanca {
	private boolean pirolitico;

	public Frigorifico(String fabricante, double precio, char clasificacionEnergetica, boolean pirolitico, int descuento) {
		super(fabricante, precio, clasificacionEnergetica, descuento);
		this.setPirolitico(pirolitico);
	}

	public boolean isPirolitico() {
		return pirolitico;
	}

	public void setPirolitico(boolean pirolitico) {
		this.pirolitico = pirolitico;
	}

}
