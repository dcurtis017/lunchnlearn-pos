package lunchnlearn.excercise.pos;

import java.util.ArrayList;
import java.util.List;
public class ItemList 
{
	
	private ArrayList<Item> itemList;
	
	public ItemList()
	{
		itemList = new ArrayList<Item>();
		addItemToList("Milk", .99);
		addItemToList("Cheese", .99);
		addItemToList("Bread", 1.25);
		addItemToList("Flour", 2.99);
		addItemToList("Sugar", 1.99);
	}
	
	public void addItemToList(String itemName, Double itemPrice)
	{
		itemList.add(new Item(itemName, itemPrice));
	}
	
	public Item getItem(int itemIndex) throws IndexOutOfBoundsException
	{
		return itemList.get(itemIndex);
	}
	
	public List<Item> getItemList()
	{
		return this.itemList;
	}
}
