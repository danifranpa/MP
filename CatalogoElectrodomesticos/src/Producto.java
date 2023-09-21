
public abstract class Producto {
	private static final int MAX_DESCUENTO = 15;
	private String fabricante;
	private double precio;
	private  char clasificacionEnergetica;
	private int descuento;
	public Producto(String fabricante, double precio, char clasificacionEnergetica, int descuento) {
		super();
		this.setFabricante(fabricante);
		this.setPrecio(precio);
		this.setClasificacionEnergetica(clasificacionEnergetica);
		this.setDescuento(descuento);
	}
	
	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = Math.min(descuento, Producto.MAX_DESCUENTO );
		
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public char getClasificacionEnergetica() {
		return clasificacionEnergetica;
	}
	public void setClasificacionEnergetica(char clasificacionEnergetica) {
		this.clasificacionEnergetica = clasificacionEnergetica;
	}


}
