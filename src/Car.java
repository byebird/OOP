
public class Car {
	
		// Attribute - Eigenschaften
		
		private String color;
		private String brand;
		private int horsePower;
		
		
		// Methoden

		public void drive () {
			System.out.println("Das Auto f�hrt...");
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public String getBrand() {
			return brand;
		}


		public void setBrand(String brand) {
			this.brand = brand;
		}


		public int getHorsePower() {
			return horsePower;
		}


		public void setHorsePower(int horsePower) {
			this.horsePower = horsePower;
		}
		
}