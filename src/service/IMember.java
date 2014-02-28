package service;

import domain.Book;
import domain.Member;

/**
 * @author tanmay.waikar
 * Interface IMember.
 */
public interface IMember {

	/**
	 * @return no of borrowed books
	 * Method to borrow books
	 */
	public int borrowBooks();
	/**
	 * Method to register a new member
	 */
	public void register();
	/**
	 * @param title
	 * @param author
	 * @return Book
	 * Method to Issue a book on basis of title and author
	 */
	public  Book requestToIssue(String title, String author);
	/**
	 * @param id
	 * @return Member
	 * Method to get the member by its memberid
	 */
	public Member getById(int id);
}

