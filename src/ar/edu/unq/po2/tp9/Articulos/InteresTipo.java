package ar.edu.unq.po2.tp9.Articulos;

public class InteresTipo implements Interes {
	private String tipo;

	public InteresTipo(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	@Override
	public boolean esDeInteres(Articulo articulo) {
		return tipo.equals(articulo.getTipoDeArticulo());
	}


}
