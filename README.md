# Bookstore Inventory Management System

This project provides a Java application for managing a bookstore's inventory, complete with borrowing and returning functionalities. Whether you're borrowing a book ➡️ or returning one ⬅️, let this system be your guide!

## Usage

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/veenanikhar/Page-Turner-Tracker.git
    ```

2. **Navigate to the Directory:**
    ```bash
    cd Page-Turner-Tracker
    ```

3. **Compile the Java File:**
    ```bash
    javac src/com/example/bookstoreinventory/*.java
    ```

4. **Run the Program:**
    ```bash
    java -cp src com.example.bookstoreinventory.BookstoreInventory
    ```
    
## Features:

- **Add Books**(➕): Add new books to the inventory by specifying ISBN, title, and quantity.
- **Update Books**(✏️): Modify existing book information, like quantity.
- **Remove Books**(🚮): Remove books from the inventory.
- **Display Inventory**(📖): View a list of all books, including title, ISBN, quantity, and availability status.
- **Check Availability**(🔍): Check if a specific book is currently in stock.
- **Borrow Books**(➡️): Borrow a book, reducing its available quantity by 1 (if available).
- **Return Books**(⬅️): Return a borrowed book, increasing its available quantity by 1.

## Getting Started:

### Prerequisites:

- Java Development Kit (JDK) 8 or later ([Download JDK](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)) ☕️
- A text editor or IDE (e.g., IntelliJ IDEA, Eclipse)

### Compile and Run:

1. Clone or download the project repository.
2. Open a terminal or command prompt and navigate to the project directory.
3. Compile the code using a Java compiler (e.g., `javac BookstoreInventory.java Book.java`).
4. Run the application using `java BookstoreInventory`.

## Usage:

The application presents a menu-driven interface. Select an option from the following:

1. Add Book (➕)
2. Update Book (✏️)
3. Remove Book (🚮)
4. Display Inventory (📖)
5. Check Book Availability (🔍)
6. Borrow Book (➡️)
7. Return Book (⬅️)
8. Exit (🚪)

Follow the prompts to enter book information and perform desired actions.

### Example Usage:

1. Adding a New Book:
Enter 10 digit ISBN: 978-0321356681
Enter Title: Clean Code
Enter Quantity: 8
Book added successfully.✅

2. Updating Book Quantity:
Enter 10 digit ISBN of the book to update: 978-0134685991
Enter new Quantity: 5
Book quantity updated successfully.⏫

3. Removing a Book:
Enter 10 digit ISBN of the book to remove: 978-0201633610
Book removed successfully.🚮

4. Displaying Inventory:
ISBN: 978-0321356681, Title: Clean Code, Quantity: 8
ISBN: 978-0134685991, Title: Effective Java, Quantity: 5
... (information for other books)📖

5. Checking Book Availability:
Enter 10 digit ISBN to check availability: 978-0321356681
The book "Clean Code" is available with 8 copies in stock.🔍

6. Borrowing a Book (if available):
Enter 10 digit ISBN to borrow: 978-0321356681
You have successfully borrowed "Clean Code".➡️

7. Returning a Book:
Enter 10 digit ISBN to return: 978-0321356681
You have successfully returned "Clean Code".⬅️
