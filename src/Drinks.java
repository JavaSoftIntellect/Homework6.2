
public class Drinks extends Stock {
	public Drinks(float price,boolean available,boolean hot,boolean carbonated){
		super(price,available);
		this.hot=hot;
		this.carbonated=carbonated;
	}
	boolean hot;
	boolean carbonated;
	public boolean isHot() {
		return hot;
	}
	public void setHot(boolean hot) {
		this.hot = hot;
	}
	public boolean isCarbonated() {
		return carbonated;
	}
	public void setCarbonated(boolean carbonated) {
		this.carbonated = carbonated;
	}
	public void drink(){
		System.out.println("Is it hot? "+this.hot);
		System.out.println("Is it carbonated? "+this.carbonated);
		System.out.println();
	}

}
