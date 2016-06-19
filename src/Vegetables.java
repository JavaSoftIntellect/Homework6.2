
public class Vegetables extends Stock{
	public Vegetables(float price,boolean available,String type,boolean fresh){
		super(price,available);
		this.type=type;
		this.fresh=fresh;
	}
	String type;
	boolean fresh;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isFresh() {
		return fresh;
	}
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
	public void vegs(){
		System.out.println("Vegetables are fresh: "+this.fresh);
		System.out.println("Type: "+this.type);
		System.out.println();
	}
	
	
	

}
