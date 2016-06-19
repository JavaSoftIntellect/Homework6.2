
public class Deserts extends Stock {
	public Deserts(float price,boolean available,boolean chokolate,boolean sweet){
		super(price,available);
		this.chokolate=chokolate;
		this.sweet=sweet;
	}
	boolean chokolate;
	boolean sweet;
	public boolean isChokolate() {
		return chokolate;
	}
	public void setChokolate(boolean chokolate) {
		this.chokolate = chokolate;
	}
	public boolean isSweet() {
		return sweet;
	}
	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}
	public void desert(){
		System.out.println("Is it with chokolate? "+this.chokolate);
		System.out.println("Is it too sweet? "+this.sweet);
		System.out.println();
	}

}
