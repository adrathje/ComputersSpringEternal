package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Computer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	String operatingSystem;
	String cpu;
	double cost;
	int ram;
	@Autowired
	ComputerCase computerCase;

	/**
	 * 
	 */
	public Computer() {
		super();
	}

	/**
	 * @param cost
	 */
	public Computer(double cost) {
		super();
		this.cost = cost;
	}

	/**
	 * @param operatingSystem
	 * @param cpu
	 * @param cost
	 * @param ram
	 */
	public Computer(String operatingSystem, String cpu, double cost, int ram) {
		super();
		this.operatingSystem = operatingSystem;
		this.cpu = cpu;
		this.cost = cost;
		this.ram = ram;
	}

	/**
	 * @param id
	 * @param operatingSystem
	 * @param cpu
	 * @param cost
	 * @param ram
	 */
	public Computer(int id, String operatingSystem, String cpu, double cost, int ram) {
		super();
		this.id = id;
		this.operatingSystem = operatingSystem;
		this.cpu = cpu;
		this.cost = cost;
		this.ram = ram;
	}

	/**
	 * @return the operatingSystem
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * @param operatingSystem the operatingSystem to set
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	/**
	 * @return the cpu
	 */
	public String getCpu() {
		return cpu;
	}

	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}

	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}

	/**
	 * @return the computerCase
	 */
	public ComputerCase getComputerCase() {
		return computerCase;
	}

	/**
	 * @param computerCase the computerCase to set
	 */
	public void setComputerCase(ComputerCase computerCase) {
		this.computerCase = computerCase;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", operatingSystem=" + operatingSystem + ", cpu=" + cpu + ", cost=" + cost
				+ ", ram=" + ram + ", computerCase=" + computerCase + "]";
	}

}
