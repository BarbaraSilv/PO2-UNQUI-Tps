package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {
	public ProductoCooperativa(String nombre, Double precio) {
		super(nombre, precio);
		this.esDeCooperativa = true;
	}
	
	public Double getPrecio() {
		return (this.precio - (this.precio * 0.1));
	}

}
