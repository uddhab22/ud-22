package GroupTask;


	public class CarTest  {
		public static void main(String[] args) {
			System.out.println("---------Car---------");
			Car car1=new Car(2000, "blue");
			System.out.println(car1.calculateSalePrice());
			
			System.out.println("---------Sedan---------");
			Sedan sedan=new Sedan(2000, "pink", 30);
			System.out.println(sedan.calculateSalePrice());
			
			System.out.println("---------Truck---------");
			Truck truck = new Truck(2000, "grey", 3000);
			double price=truck.calculateSalePrice();
			System.out.println(price);
		}
	
	

}
