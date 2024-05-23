package bookstoreinventory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookStoreInventory 
{
	private static HashMap<String, Book> inventory = new HashMap<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) 
	{
		boolean running = true;

		// Sample books in the inventory
		inventory.put("978-0134685991", new Book("Effective Java", 10));
		inventory.put("978-0596009205", new Book("Head First Java", 15));
		inventory.put("978-0132350884", new Book("Clean Code", 8));
		inventory.put("978-0201633610", new Book("Design Patterns", 5));

		while (running) 
		{
			printMenu();
			int choice = scanner.nextInt();
			scanner.nextLine(); // consume newline

			switch (choice) 
			{
				case 1:
					addBook();
					break;
				case 2:
					updateBook();
					break;
				case 3:
					removeBook();
					break;
				case 4:
					displayInventory();
					break;
				case 5:
					checkBookAvailability();
					break;
				case 6:
					borrowBook();
					break;
				case 7:
					returnBook();
					break;
				case 8:
					running = false;
					break;
				default:
					System.out.println("Invalid choice, please try again.");
			}
		}

		scanner.close();
	}
	
	// Prints the main menu options for the user
	private static void printMenu() 
	{
		System.out.println("\nBookstore Inventory Management System");
		System.out.println("1. Add Book");
		System.out.println("2. Update Book");
		System.out.println("3. Remove Book");
		System.out.println("4. Display Inventory");
		System.out.println("5. Check Book Availability");
		System.out.println("6. Borrow Book");
		System.out.println("7. Return Book");
		System.out.println("8. Exit");
		System.out.print("Enter your choice: ");
	}
	
	// Adds a new book to the inventory
	private static void addBook() 
	{
		System.out.print("Enter 10 digit ISBN: ");
		String isbn = "978-" + scanner.nextLine();
		System.out.print("Enter Title: ");
		String title = scanner.nextLine();
		System.out.print("Enter Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine(); // consume newline

		if (inventory.containsKey(isbn)) {
			System.out.println("Book with this ISBN already exists.");
		} else {
			inventory.put(isbn, new Book(title, quantity));
			System.out.println("Book added successfully.");
		}
	}
	
	// Updates the quantity of an existing book in the inventory
	private static void updateBook() 
	{
		System.out.print("Enter 10 digit ISBN of the book to update: ");
		String isbn = "978-" + scanner.nextLine();

		if (inventory.containsKey(isbn)) 
		{
			System.out.print("Enter new Quantity: ");
			int quantity = scanner.nextInt();
			scanner.nextLine(); // consume newline
		
			Book book = inventory.get(isbn);
			book.setQuantity(quantity);
			System.out.println("Book quantity updated successfully.");
		} else {
			System.out.println("Book not found.");
		}
	}
	
	// Removes a book from the inventory
	private static void removeBook() 
	{
		System.out.print("Enter 10 digit ISBN of the book to remove: ");
		String isbn = "978-" + scanner.nextLine();

		if (inventory.containsKey(isbn)) {
			inventory.remove(isbn);
			System.out.println("Book removed successfully.");
		} else {
			System.out.println("Book not found.");
		}
	}
	
	// Displays all the books currently in the inventory
	private static void displayInventory() 
	{
		if (inventory.isEmpty()) {
			System.out.println("The inventory is empty.");
		} else {
			for (Map.Entry<String, Book> entry : inventory.entrySet()) {
				String isbn = entry.getKey();
				Book book = entry.getValue();
				System.out
						.println("ISBN: " + isbn + ", Title: " + book.getTitle() + ", Quantity: " + book.getQuantity());
			}
		}
	}
	
	// Checks the availability of a specific book by its ISBN
	private static void checkBookAvailability() 
	{
		System.out.print("Enter 10 digit ISBN to check availability: ");
		String isbn = "978-" + scanner.nextLine();

		if (inventory.containsKey(isbn)) {
			Book book = inventory.get(isbn);
			if (book.getQuantity() > 0) {
				System.out.println("The book \"" + book.getTitle() + "\" is available with " + book.getQuantity()
						+ " copies in stock.");
			} else {
				System.out.println("The book \"" + book.getTitle() + "\" is out of stock.");
			}
		} else {
			System.out.println("Book not found.");
		}
	}
	
	// Borrows a book from the inventory, reducing its quantity by 1
	private static void borrowBook() 
	{
		System.out.print("Enter 10 digit ISBN to borrow: ");
		String isbn = "978-" + scanner.nextLine();

		if (inventory.containsKey(isbn)) 
		{
			Book book = inventory.get(isbn);
			if (book.getQuantity() > 0) 
			{
				book.setQuantity(book.getQuantity() - 1);
				System.out.println("You have successfully borrowed \"" + book.getTitle() + "\".");
			} 
			else 
			{
				System.out.println("The book \"" + book.getTitle() + "\" is out of stock.");
			}
		} 
		else 
		{
			System.out.println("Book not found.");
		}
	}
	
	// Returns a book to the inventory, increasing its quantity by 1
	private static void returnBook() 
	{
		System.out.print("Enter 10 digit ISBN to return: ");
		String isbn = "978-" + scanner.nextLine();

		if (inventory.containsKey(isbn)) 
		{
			Book book = inventory.get(isbn);
			book.setQuantity(book.getQuantity() + 1);
			System.out.println("You have successfully returned \"" + book.getTitle() + "\".");
		} 
		else 
		{
			System.out.println("Book not found.");
		}
	}
}
