package day5;

public class Fruit {
	
		private String color;
		private double weight;
		private String name;
		private boolean fresh;
		
		public Fruit(String color, double weight, String name, boolean fresh) {
			super();
			this.color = color;
			this.weight = weight;
			this.name = name;
			this.fresh = fresh;
		}
		
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isFresh() {
			return fresh;
		}

		public void setFresh(boolean fresh) {
			this.fresh = fresh;
		}

		public String taste() {
			return "no specific taste";
		}

		@Override
		public String toString() {
			return "Fruit : color=" + color + ", weight=" + weight + ", name=" + name + ", fresh=" + fresh;
		}
		
		

}