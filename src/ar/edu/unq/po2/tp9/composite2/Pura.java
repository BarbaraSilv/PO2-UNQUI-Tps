package ar.edu.unq.po2.tp9.composite2;

public class Pura implements PorcionProductiva{
	private Cultivo cultivo ;

	public Pura(Cultivo cultivo) {
		super();
		this.cultivo = cultivo;
	} 
	public double gananciasAnuales() {
		return cultivo.gananciasAnuales() * 4 ;
	}
	public Cultivo getCultivo(){
		return cultivo ;
	}
}
