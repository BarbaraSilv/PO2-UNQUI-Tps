package ar.edu.unq.po2.tp4;

public class Ingreso {
	private String mesPercepcion;
	private String concepto;
	private Double monto;
	protected boolean esImponible;
	
	public Ingreso(String mes, String concepto,Double monto) {
		this.mesPercepcion = mes;
		this.concepto = concepto;
		this.monto = monto;
		this.esImponible = true;
		
		
	}
	
	public String getMesPercepcion() {
		return mesPercepcion;
	}
	
	public String getConcepto() {
		return concepto;
	}
	public Double getMonto() {
		return monto;
	}
	public boolean getEsImponible() {
		return esImponible;
	}
}
