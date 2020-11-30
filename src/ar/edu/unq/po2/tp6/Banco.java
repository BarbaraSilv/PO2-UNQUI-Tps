package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	private List<SolicitudDeCredito> solicitudesDeCredito;
	
	public Banco() {
		clientes = new ArrayList<Cliente>();
		solicitudesDeCredito = new ArrayList<SolicitudDeCredito>();
	}
	
	public void agregarNuevoCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void registrarSolicitudDeCredito(SolicitudDeCredito solicitud) {
		solicitudesDeCredito.add(solicitud);
	}
	
	public Double montoADesembolsar() {
		Double result = 0d;
		for (SolicitudDeCredito solicitud: solicitudesDeCredito){
			if (solicitud.esAceptable()){
				result += solicitud.getMontoSolicitado();
			}
		}
		return result;
	}

	public Integer cantidadDeClientes() {
		return clientes.size();
	}

	public Integer cantidadDeSolicitudes() {
		return solicitudesDeCredito.size();
	}
}
