package negocio;

import java.util.List;

import javax.ejb.Local;

import modelo.Caja;



@Local
public interface GestionCajaLocal {
	
	public void guardarCaja(int codigo, String feche,double TotalIngresos, double totalEgresos, double total);
	public List<Caja> getCajas();
	public List<Caja> getCajaNombre(String filtro);
}
