package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto  {
	
	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombreP, double precioP,double unDescuento, boolean esCuidado) {
		super(nombreP, precioP, unDescuento, esCuidado);
		this.descuento = unDescuento;
	}

	@Override
	
	public double getPrecio() {
		double precioFinal = this.precio - (this.precio*(this.descuento/100));
		return precioFinal;
	}

	
	
}