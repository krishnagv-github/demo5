package trng.samp.core1.demo5;

public class Customer {

	private int customerId;
	private String customerName;
	private String address;
	private double salary;

	public Customer(int customerId, String customerName, String address, double salary) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.salary = salary;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAddress() {
		return address;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", salary=" + salary + "]";
	}

}