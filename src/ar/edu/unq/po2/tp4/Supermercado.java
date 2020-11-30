package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos;

	public Supermercado(String direccion, String nombre ) {
		this.productos = new ArrayList<Producto>();
		this.nombre = nombre;
		this.direccion = direccion;
	}


	public Integer getCantidadDeProductos() {
		// TODO Auto-generated method stub
		return productos.size();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
		
	}

	public Double getPrecioTotal() {
		Double total = 0d;
		for(Producto producto:productos) {
			total += producto.getPrecio();
		}
		return total; 
	}


	
}
