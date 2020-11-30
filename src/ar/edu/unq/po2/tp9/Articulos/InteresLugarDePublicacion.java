package ar.edu.unq.po2.tp9.Articulos;

public class InteresLugarDePublicacion implements Interes {

	private String lugarDePublicacion;

	public InteresLugarDePublicacion(String lugarDePublicacion) {
		super();
		this.lugarDePublicacion = lugarDePublicacion;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	@Override
	public boolean esDeInteres(Articulo articulo) {
		return lugarDePublicacion.equals(articulo.getLugarDePublicacion());
	}

}
