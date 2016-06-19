
public class Meat extends Stock {
	public Meat(float price,boolean available,String type,int count){
		super(price,available);
		this.type=type;
		this.count=count;
	}
	String type;
	int count;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void meat(){
		System.out.println("Type of the meat: "+this.type);
		System.out.println("Counts in the storage: "+this.count);
		System.out.println();
	}
	
}
