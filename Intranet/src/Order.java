import java.io.Serializable;

public class Order implements Serializable{

	private String orderTitle;
	private String text;
	private boolean acceptedStatus = false;
	private Rooms room;

	public Order() {}

	public Order(String orderTitle, String text, Rooms room) {
		this.orderTitle = orderTitle;
		this.text = text;
		this.room = room;
	}

	public Rooms getRoom() {
		return room;
	}

	public void setRoom(Rooms room) {
		this.room = room;
	}

	public String getOrderTitle() {
		return orderTitle;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public boolean getAcceptedStatus() {
		return acceptedStatus;
	}

	public void setAcceptedStatus(boolean acceptedStatus) {
		this.acceptedStatus = acceptedStatus;
	}

	@Override
	public String toString() {
		return "Order [orderTitle =" + orderTitle + ", text =" + text + ", room ="
				+ room.toString() + ", acceptedStatus =" + acceptedStatus + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (acceptedStatus ? 1231 : 1237);
		result = prime * result + ((orderTitle == null) ? 0 : orderTitle.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (acceptedStatus != other.acceptedStatus)
			return false;
		if (orderTitle == null) {
			if (other.orderTitle != null)
				return false;
		} else if (!orderTitle.equals(other.orderTitle))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

}
