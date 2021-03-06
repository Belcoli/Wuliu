
public class Order {
	private int order_id;
	private int seller_id;
	private int delivery_id;
	private int transportation_id;
	private int status; //订单状态，0: made, 1: transferring, 2: finished
	private int type; //货物种类
	private int weight;
	private int price;
	private char start;
	private char destination;
	
	public Order(int seller_id, int delivery_id, int transportation_id, int status, int type, int weight, int price, char start, char destination) {
		// TODO Auto-generated constructor stub
	}
	
	public int getDelivery_id() {
		return delivery_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public int getPrice() {
		return price;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public int getStatus() {
		return status;
	}
	public int getTransportation_id() {
		return transportation_id;
	}
	public int getType() {
		return type;
	}
	public int getWeight() {
		return weight;
	}
	public char getStart() {
		return start;
	}
	public char getDestination() {
		return destination;
	}
	public void setDelivery_id(int delivery_id) {
		this.delivery_id = delivery_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setTransportation_id(int transportation_id) {
		this.transportation_id = transportation_id;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setStart(char start) {
		this.start = start;
	}
	public void setDestination(char destination) {
		this.destination = destination;
	}

}
