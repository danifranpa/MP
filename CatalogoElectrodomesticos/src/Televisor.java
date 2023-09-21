
public class Televisor extends GamaMarron implements SuperficieFragil{
	private int pulgadas;
	private String limpiador;

	public Televisor(String fabricante, double precio, char clasificacionEnergetica, int pulgadas, String limpiador, int descuento) {
		super(fabricante, precio, clasificacionEnergetica, descuento);
		this.setPulgadas(pulgadas);
		this.limpiador = limpiador;
	}

	@Override
	public String limpiador() {
		
		return limpiador;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
}
