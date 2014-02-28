package service;

import domain.Book;
import domain.Member;

/**
 * @author tanmay.waikar
 * Interface ILiberarian 
 */
public interface ILibrarian {

	/**
	 * @param title
	 * @return Book
	 * Method to find the book by providing title
	 */
	public Book findBookByTitle(String title);
	
	/**
	 * @param author
	 * @return array of Book
	 * Method to find the Books by Author
	 */
	public Book[] findBookByAuthor(String author);
	
	/**
	 * @param aMember
	 * @return Boolean
	 * Method to determine whether the book is overdue
	 */
	public Boolean isBookOverDue(Member aMember);
	
	/**
	 * @param aMember
	 * @param aBook
	 * Method to issue the book
	 */
	public void lendBook(Member aMember,Book aBook);
	
	
}
