
public abstract class PlacaCoccion extends GamaBlanca implements SuperficieFragil{
	private int potencia;
	private int numeroZonas;
	private String limpiador;

	public PlacaCoccion(String fabricante, double precio, char clasificacionEnergetica, int potencia, int numeroZonas, String limpiador, int descuento) {
		super(fabricante, precio, clasificacionEnergetica, descuento);
		this.setPotencia(potencia);
		this.setNumeroZonas(numeroZonas);
		this.limpiador = limpiador;
	}


	@Override
	public String limpiador() {
		
		return limpiador;
	}


	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public int getNumeroZonas() {
		return numeroZonas;
	}


	public void setNumeroZonas(int numeroZonas) {
		this.numeroZonas = numeroZonas;
	}
}
