package HibernateAdd;

import java.math.BigDecimal;

public class Products {

	private int id;
	private String name;
	private BigDecimal price;
	
	

	
	
	public Products(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
		
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getprice() {
		return price;
	}
	public void setprice(BigDecimal price) {
		this.price= price;
	}
}