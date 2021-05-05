package java06_class.uml;

class Car {
	private String model;
	private String color;
	
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
		
	}
	
	public void display() {
		System.out.println( model + ", "+ color);
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}




public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car("K5", "Black");
		car.display();
		
		System.out.println("----------");
		
		car.setModel("¸ð´×");
		car.setColor("White");
		
		System.out.println( car.getModel() );
		System.out.println( car.getColor() );
		
		System.out.println("----------");
		car.display();
		

	}

}
