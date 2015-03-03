package lunchnlearn.excercise.pos;

import java.util.Scanner;
import java.util.List;

public class Register {

	public static void outputItemsMenu(List<Item> itemList)
	{
		System.out.println("0) Complete Transaction");
		int i = 1;
		for(Item item: itemList)
		{
			System.out.println(i+") "+item.getItemName()+" ("+item.getItemPrice()+")");
			++i;
		}
	}
	
	public static void main(String[] args) {
		//prompt for name
		Scanner scanner = new Scanner(System.in);
		ItemList itemList = new ItemList();
		List<Item> items = itemList.getItemList();
		System.out.print("What is your name? ");
		CustomerTransaction custTrans = new CustomerTransaction();
		custTrans.setCustomerName(scanner.nextLine());
		System.out.println("Hello "+custTrans.getCustomerName()+", your current total is: "+custTrans.getTransactionTotal());
		int selectedOption = 0;
		//list items in loop
		do
		{
			System.out.println("Hello "+custTrans.getCustomerName()+", your current total is: "+custTrans.getTransactionTotal());
			Register.outputItemsMenu(items);
			selectedOption = scanner.nextInt();
			if(selectedOption != 0)
			{
				custTrans.addItem(itemList.getItem(selectedOption-1));
			}
		}while(selectedOption != 0);
		System.out.println("Thank you for shopping with us "+custTrans.getCustomerName()+", your total is: "+custTrans.getTransactionTotal());
		System.out.println("Your order consists of the following:");
		for(Item item: custTrans.getCustomerItems())
		{
			System.out.println(item.getItemName());
		}
		scanner.close();
	}
}
