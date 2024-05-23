package bookstoreinventory;

public class Book 
{
	private String title;
	private int quantity;
	
	// Constructor to initialize the book with title and quantity
	public Book(String title, int quantity) 
	{
		this.title = title;
		this.quantity = quantity;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public int getQuantity() 
	{
		return quantity;
	}
	
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
}
