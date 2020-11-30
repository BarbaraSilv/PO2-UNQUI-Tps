package ar.edu.unq.po2.tp4;

import java.util.function.BooleanSupplier;

public class Producto {
		private String nombre;
		public int precio;
		public double descuento;
		protected Boolean esPrecioCuidado;
	
	public Producto(String nombreProdCuidado, double precioProdCuidado,double descuento, boolean esPrecioCuidado) {
		String nombre = nombreProdCuidado;
		double precio = precioProdCuidado;
		this.esPrecioCuidado = esPrecioCuidado;
		
	}

	public Producto(String nombre, int precio) {
		this.nombre= nombre;
		this.precio= precio;
		this.esPrecioCuidado = false;
	}

	public Object getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio ;
	}

	
	
public Boolean esPrecioCuidado() {
	// TODO Auto-generated method stub
	return esPrecioCuidado;
}

public void aumentarPrecio(double precio) {
	this.precio += precio;
}


}
