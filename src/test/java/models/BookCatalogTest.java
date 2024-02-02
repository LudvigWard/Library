package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		Book book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
		assertDoesNotThrow(() -> bc.addBook(new Book(2, "Lord of the Rings", "JRR Tolkien",
				"078321", "Fantasy", 513)));
	}

	//G
	@Test
	public void testFindBook() {
		assertDoesNotThrow(() -> bc.findBook("Learning Java"));
	}

	//G
	@Test
	public void testFindBookIgnoringCase() {
		assertDoesNotThrow(() -> bc.findBook("LeArniNg JAVA"));
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() {
		assertDoesNotThrow(() -> bc.findBook("   Learning Java   "));
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {
		assertThrows(BookNotFoundException.class, () -> bc.findBook("Learning C#"));
	}

}
