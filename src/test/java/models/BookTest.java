package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(1, "Water", "Poseidon", "08398261", "Nature", 10);
		Book book2 = new Book(1, "Water", "Poseidon", "08398261", "Nature", 10);
        assertEquals(book1, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(1, "Water", "Poseidon", "08398261", "Nature", 10);
		Book book2 = new Book(3, "Lightning", "Zeus", "08398262", "Nature", 11);
        assertNotEquals(book1, book2);
	}

}
