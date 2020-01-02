package vista;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionCajaLocal;
import negocio.GestionMedicoLocal;
import negocio.GestionPacienteLocal;
import modelo.Caja;
import modelo.Medico;
import modelo.Paciente;

@ManagedBean
public class GestioCajaBean {
	
	
	@Inject
	private GestionCajaLocal Gd;
	
	/*Bean Properties*/
	private int id;
	private String fecha;
	private double totalIngresos;
	private double totalEgresos;
	private double total;
	private List<Caja> caja;
	
	@PostConstruct
	public void init() {
		caja= Gd.getCajas();
	}
	
	
	public String guardarCaja() {
		
		Gd.guardarCaja(id, fecha, totalIngresos, totalEgresos, total);
		caja=Gd.getCajas();
		return "listar_caja";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public GestionCajaLocal getGd() {
		return Gd;
	}


	public void setGd(GestionCajaLocal gd) {
		Gd = gd;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public double getTotalIngresos() {
		return totalIngresos;
	}


	public void setTotalIngresos(double totalIngresos) {
		this.totalIngresos = totalIngresos;
	}


	public double getTotalEgresos() {
		return totalEgresos;
	}


	public void setTotalEgresos(double totalEgresos) {
		this.totalEgresos = totalEgresos;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public List<Caja> getCaja() {
		return caja;
	}


	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}


	
}
