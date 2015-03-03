package lunchnlearn.excercise.pos;

import java.util.ArrayList;

public class CustomerTransaction {
	
	public ArrayList<Item> customerItems;
	
	public String customerName;
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public CustomerTransaction()
	{
		customerItems = new ArrayList<Item>();
		customerName = null;
	}
	
	public void addItem(Item item)
	{
		this.customerItems.add(item);
	}
	
	public Double getTransactionTotal()
	{
		Double total = 0.0d;
		for(Item item: customerItems)
		{
			total+=item.getItemPrice();
		}
		return total;
	}
	
	public ArrayList<Item> getCustomerItems()
	{
		return this.customerItems;
	}
}
