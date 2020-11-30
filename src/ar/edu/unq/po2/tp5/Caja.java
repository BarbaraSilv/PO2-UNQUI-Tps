package ar.edu.unq.po2.tp5;
import ar.edu.unq.po2.tp5.Agencia;
import java.util.ArrayList;

public class Caja {

	private Stock stock;
	private double montoTotal;
	private Agencia agencia;

	public Caja(Stock stock) {
		this.stock = stock;
		montoTotal = 0d;
	}

	public void registrar(Registrable registrable) {
		montoTotal += registrable.getPrecio();
		registrable.registrarPago(stock);
	}

	public double montoTotal() {

		return montoTotal;
	}

	public Stock getStock() {
		return stock;
	}

	public Double registrarFactura(Factura factura) {
		this.agencia.registrarPago(factura);
		return factura.montoAPagar();
	}

	public void registrarProductos(ArrayList<Producto> productos) {
		for (Producto producto : productos) {
			stock.sacarProductoDeStock(producto.getNombre());
		}
		System.out.println(this.calcularPrecioCompra(productos));

	}
	public Double calcularPrecioCompra(ArrayList<Producto> productos) {
		Double total = 0.0;
		for (Producto producto:productos) {
			total += producto.getPrecio();
		}
		return total;
	}
}