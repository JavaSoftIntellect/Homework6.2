
public class Main {
	public static void main(String[] args){
		Meat chicken = new Meat(7,true,"Chicken",5);
		chicken.all();
		chicken.meat();
		Vegetables carrot = new Vegetables(2,true,"Carrot",false);
		carrot.all();
		carrot.vegs();
		Drinks cola = new Drinks(2,true,false,true);
		cola.all();
		cola.drink();
		Deserts cake = new Deserts(4,true,true,true);
		cake.all();
		cake.desert();
		
	}

}
