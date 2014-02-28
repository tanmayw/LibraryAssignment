package service;

import java.util.Calendar;
import java.util.logging.Logger;

import domain.Book;
import domain.Member;

/**
 * @author tanmay.waikar
 * LibrarianImpl class consisting of implementations for the ILiberarian interface
 */
public class LibrarianImpl implements ILibrarian {
	private static final Logger logger = Logger.getLogger(LibrarianImpl.class.getName());

	@Override
	public Book findBookByTitle(String title) {
		logger.info("Calling findBookByTitle");
		//Query to find the book by title 
		return null;
	}

	@Override
	public Book[] findBookByAuthor(String author) {
		logger.info("Calling findBookByAuthor");
		// Query to find the book by Author
		return null;
	}

	@Override
	public Boolean isBookOverDue(Member aMember) {
		logger.info("Calling Overdue module");
		// check if the overDue flag is set in the member relation
		if(aMember.getIsBookOverDue()){
			aMember.setIsBookOverDue(true);
			aMember.setIsFineApplicable(true);
			//save member record			
		return true;
		}else{
			return false;
		}
	}

	@Override
	public void lendBook(Member aMember, Book aBook) {
		logger.info("Calling lendBook module");
		if(aMember.getBooksBoorowed()==3){
			//raise an alert or error in system that no books can be issued
		}else{
		final Calendar cal = getCalendar();
		aMember.setBookIssued(cal.getTime());
		aMember.setBookTitleIssued(aBook.getTitle());
		final Calendar cal2 = getCalendar();
		cal2.set(Calendar.MONTH, 1);
		aMember.setBookToBeReturned(cal2.getTime());
		aMember.setIsBookOverDue(false);
		aMember.setIsFineApplicable(false);
		aMember.setIsLibrarian(false);
		aMember.setMemberId(aMember.getMemberId());
		
		aMember.setBooksBoorowed(aMember.getBooksBoorowed()+1);
		
		//save the aMember record
		}	
		}
		
	   public static Calendar getCalendar(){
		   return Calendar.getInstance();
	   }
		
	}


