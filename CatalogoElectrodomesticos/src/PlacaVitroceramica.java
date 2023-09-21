
public class PlacaVitroceramica extends PlacaCoccion {
	private boolean bloqueSeguridad;

	public PlacaVitroceramica(String fabricante, double precio, char clasificacionEnergetica, int potencia,
			int numeroZonas, boolean bloqueSeguridad, String limpiador, int descuento) {
		super(fabricante, precio, clasificacionEnergetica, potencia, numeroZonas, limpiador, descuento);
		this.setBloqueSeguridad(bloqueSeguridad);
	}

	public boolean isBloqueSeguridad() {
		return bloqueSeguridad;
	}

	public void setBloqueSeguridad(boolean bloqueSeguridad) {
		this.bloqueSeguridad = bloqueSeguridad;
	}
	
	
}
