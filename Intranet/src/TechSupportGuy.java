import java.io.Serializable;
import java.util.Vector;

public class TechSupportGuy extends User implements Serializable{
	
	private String name;
	private Order order; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public TechSupportGuy() {
		super();
		Main.orders = new Vector<Order>();
	}
	
	public TechSupportGuy(String login, String password, String id, String name) {
		super(login, password, id);
		this.name = name;
	}

	public static void addOrder(Order order) {
		Main.orders.add(order);
	}
	
	public void rejectOrder(Order order) {
		for(int i = 0; i<Main.orders.size(); i++) {
			if(Main.orders.get(i).equals(order))
				Main.orders.remove(Main.orders.get(i));
		}
	}
	
	public void rejectOrder(String orderTitle) {
		for(int i = 0; i<Main.orders.size(); i++) {
			if(Main.orders.get(i).getOrderTitle().contentEquals(orderTitle))
				Main.orders.remove(Main.orders.get(i));
		}
	}

	public void acceptOrder(Order order) {
		if (order.getAcceptedStatus() == true)
			Main.orders.add(order);
		else {
			rejectOrder(order);
			System.out.println("Order was not accepted");
		}
	}

	public void viewNewOrders() {
		for (Order order : Main.orders) {
			System.out.println(order);
		}
	}

	void viewAcceptedOrders() {
		for (Order order : Main.orders) {
			if (order.getAcceptedStatus() == true)
				System.out.println(order);
		}
	}
	
	public String actions() {
		String s = "";
		
		s += "1)Add order\n";
		s += "2)Accept order\n";
		s += "3)Reject order\n";
		s += "4)View new orders\n";
		
		return s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TechSupportGuy other = (TechSupportGuy) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TechSupportGuy [name=" + name + "]";
	}

}