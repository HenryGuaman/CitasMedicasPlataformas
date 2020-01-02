package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Caja implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4081883801015277020L;
	@Id
	private int id;
	
	private String fecha;
	private double totalIngresos;
	private double totalEgresos;
	private double total;
	


	public double getTotal() {
		return total;
	}




	public void setTotal(double total) {
		this.total = total;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
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




	



	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public String toString() {
		return "Caja [id=" + id + ", fecha=" + fecha + ", totalIngresos=" + totalIngresos + ", totalEgresos="
				+ totalEgresos + "]";
	}




	


	
	

	
	
	
}
