package com.basics;

import java.util.Arrays;

public class HasARelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(401, "Data Structure", "Patrick K.");
		Book book2 = new Book(402, "Mechanics", "John Doe");
		Book book3 = new Book(403, "Rich Dad Poor Dad", "Robert");
		Book book4 = new Book(404, "Think And Grow Rich", "Amit Shah");
		Book[] scienceStream = {book1,book2};
		Book[] selfImprovement = {book3,book4};
		Section section1 = new Section("Science Stream", scienceStream);
		Section section2 = new Section("Self Improvement", selfImprovement);
		
//		Section[] library = {section1,section2};
		
		for(Section sec : new Section[] {section1,section2}) {
			if(sec.section=="Science Stream") {
				for(Book book : sec.books) {
					System.out.println(book.author);
				}
			}
		}
	}

}

class Section{
	String section;
	Book[] books;
	
	public Section(String section, Book[] books) {
		this.section = section;
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [\nsection=" + section + ", \nbooks=" + Arrays.toString(books) + "]";
	}
	
	
	
}

class Book{
	int bookid;
	String name;
	String author;
	public Book(int bookid, String name, String author) {
		this.bookid = bookid;
		this.name = name;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", name=" + name + ", author=" + author + "]\n";
	}
	
	
	
}
