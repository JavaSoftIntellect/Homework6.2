
public class Stock {
	public Stock(float price,boolean available){
		super();
		this.price=price;
		this.available=available;
	}
	 float price;
	 boolean available;
	 public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public void all(){
		System.out.println("Price: "+this.price);
		System.out.println("Available: "+this.available);
	}
	
	}


