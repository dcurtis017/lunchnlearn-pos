package lunchnlearn.excercise.pos;

public class Item {
	
	private String itemName;
	private Double itemPrice;
	
	public Item(String itemName, Double itemPrice)
	{
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	public String getItemName()
	{
		return this.itemName;
	}
	
	public Double getItemPrice()
	{
		return this.itemPrice;
	}

}
