

public class Main {

	public static void main(String[] args) {
		Producto[] vP = new Producto[0];
		muestraPlacaMasCara(vP);
		muestraLimpiadoresRecomendados(vP);
		ordenaProductos(vP);
		int total =  cuentaHornosPiroloticos(vP);
		System.out.printf("%d pirol�ticos\n", total);

	}

	private static void muestraPlacaMasCara(Producto[] vP) {
		double max = 0;
		Producto placaMax = null;
		for(Producto p: vP) {
			if((p instanceof PlacaCoccion) && p.getPrecio() > max) {
				max = p.getPrecio();
				placaMax = p;
			}

		}

		System.out.println(placaMax);
	}

	private static void muestraLimpiadoresRecomendados(Producto[] vP) {
		System.out.println("Limipiadores:");

		for(Producto p: vP)
			if (p instanceof SuperficieFragil)
				System.out.println(((SuperficieFragil)p).limpiador());
		System.out.println("");
	}

	private static void ordenaProductos(Producto[] vP) {
		for(int x = 0; x < vP.length - 1; x++)
			for(int y = x+1; y < vP.length; y++)
				if((vP[x] instanceof GamaBlanca)&&(vP[y] instanceof GamaMarron)) {
					Producto aux = vP[x];
					vP[x] = vP[y];
					vP[y] = aux;
				}

	}

	private static int cuentaHornosPiroloticos(Producto[] vP) {
		int total = 0;
		for(Producto p: vP)
			if((p instanceof Horno) &&((Horno)p).isPirolitico())
				total++;
		return total;
	}

}
