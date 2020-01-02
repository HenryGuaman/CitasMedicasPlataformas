package negocio;

import java.util.List;


import javax.ejb.Remote;

import modelo.Caja;


@Remote
public interface GestionCajaRemote {
	
	public void guardarCaja(int codigo, String feche,double TotalIngresos, double totalEgresos, double total);
	public List<Caja> getCaja();
}
