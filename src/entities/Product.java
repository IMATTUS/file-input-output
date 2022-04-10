package entities;

public class Product {
	private String name;
	private Double unityPrice;
	private Integer quantity;
	
	
	public Product() {}
	
	public Product(String name, Double unityPrice, Integer quantity) {
		this.name = name;
		this.unityPrice = unityPrice;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getUnityPrice() {
		return unityPrice;
	}

	public void setUnityPrice(Double unityPrice) {
		this.unityPrice = unityPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double getTotalPrice() {
		return quantity*unityPrice;
	}

	@Override
	public String toString() {
		return "" + name + "," + String.format("%.2f",this.getTotalPrice());
	}
	
}
