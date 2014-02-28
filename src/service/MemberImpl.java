package service;

import domain.Book;
import domain.Member;
import domain.User;

/**
 * @author tanmay.waikar
 * Member Impl class 
 */
public class MemberImpl implements IMember {

	@Override
	public int borrowBooks() {
		// query for the book to be borrowed with Book Type as 'borrowable'
		//return the book count
		//Assuming that the book records are already present in the database.
		return 0;
	}

	@Override
	public void register() {
		//create a new member record
		Member aMember = new Member();
		aMember.setBookIssued(null);
		aMember.setBookTitleIssued(null);
		aMember.setBookToBeReturned(null);
		aMember.setIsBookOverDue(false);
		aMember.setIsFineApplicable(false);
		aMember.setIsLibrarian(false);
		//create a unique member id by calling any id service utility
		aMember.setMemberId(1234);
		
		
		
		//create a user info record
		User aUser = new User();
		aUser.setAddress("test address");
		aUser.setAge(20);
		aUser.setMemberId(aMember.getMemberId());
		aUser.setName("test name");
		//save user info
		//save member
	}

	@Override
	public Book requestToIssue(String title,String author) {
		//Query for a book in the system with this title and author
		return null;
	}

	@Override
	public Member getById(int id) {
		//Query to get the member by member id
		//temperory returning member id 1234
		Member aMember = new Member();
		aMember.setMemberId(1234);
		return aMember;
	}

}
