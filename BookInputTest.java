package books;

import java.util.Scanner;

class Book
{
String title;
String author;
int numberOfPages;
}


public class BookInputTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Book oop = new Book();
		System.out.println("Please enter the title of the book");
		oop.title= input.nextLine();
		System.out.println("Please enter the author name");
		oop.author = input.nextLine();
		System.out.println("Please enter the number of pages");
		oop.numberOfPages = input.nextInt();
		
		System.out.println("The book title is: " +oop.title);
		System.out.println("The author is: " +oop.author);
		System.out.println("The book has " +oop.numberOfPages+ " pages");
		

	}

}