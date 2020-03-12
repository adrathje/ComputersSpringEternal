package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class ComputerCase {
	private String brand;
	private int fans;

	/**
	 * default no arguments constructor
	 */
	public ComputerCase() {
		super();
	}

	/**
	 * @param brand
	 * @param fans
	 */
	public ComputerCase(String brand, int fans) {
		super();
		this.brand = brand;
		this.fans = fans;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the fans
	 */
	public int getFans() {
		return fans;
	}

	/**
	 * @param fans the fans to set
	 */
	public void setFans(int fans) {
		this.fans = fans;
	}

	@Override
	public String toString() {
		return "Case [brand=" + brand + ", fans=" + fans + "]";
	}

}
