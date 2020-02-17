package Task4;

public class Chocolate implements Comparable<Chocolate> {

		private int weight;
		private String name;
		
		public Chocolate() {
			
		}
		public Chocolate(int weight) {
			this.weight = weight;
		}
		public Chocolate(int weight, String name) {
			this(weight);
			this.name = name;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int compareTo(Object otherobject) {
			Chocolate o = (Chocolate) otherobject;
			return (int)(weight - o.weight);
		}
		
		public String toString(){
			return ""+weight;
		}
	
}
