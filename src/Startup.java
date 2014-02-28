import java.util.Scanner;
import java.util.logging.Logger;

import service.IMember;
import service.LibraryService;
import service.MemberImpl;
import domain.Member;

/**
 * @author tanmay.waikar 
 * A startup class to start the library system
 */
public class Startup {

	private static final Logger logger = Logger.getLogger(Startup.class
			.getName());

	// Main method to get the user input and call respective modules
	public static void main(String args[]) {
		Scanner libScanner = new Scanner(System.in);
		System.out.println("Enter your type 1. Librarian 2. Member 3. New User");
		final int libChoice = libScanner.nextInt();
		// instantiating the liberary service
		final LibraryService libSvc = new LibraryService();
		// instantiating a domain member
		Member aMember = new Member();
		// Using a member interface
		final IMember member = new MemberImpl();
		switch (libChoice) {
		case 1:
			callLibrarian(libSvc, member);
			break;
		case 2:
			callMember(libSvc, member);
			break;
		case 3:
			callUser(libSvc, aMember);
			break;
		default:
			break;
		}

	}

	/**
	 * @param libSvc
	 * @param aMember
	 * private method to register a member
	 */
	private static void callUser(LibraryService libSvc, Member aMember) {
		logger.info("Calling User");
		aMember.setIsMember(false);
		libSvc.activateMember(aMember);

	}

	/**
	 * @param libSvc
	 * @param member
	 * private method to call the member module
	 */
	private static void callMember(LibraryService libSvc, IMember member) {
		logger.info("Calling Member");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your memberid");
		int memberid = scanner.nextInt();
		// get the member by calling service method
		Member aMember = member.getById(memberid);
		// temperory setting it as a liberary member
		aMember.setIsMember(true);
		libSvc.activateMember(aMember);

	}

	/**
	 * @param libSvc
	 * @param member
	 * private method to call the librarian module
	 */
	private static void callLibrarian(LibraryService libSvc, IMember member) {
		logger.info("Calling Librarian");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your memberid");
		int memberid = scanner.nextInt();
		// get the member by calling service method
		Member aMember = member.getById(memberid);
		// temperory setting it as librarian
		aMember.setIsLibrarian(true);
		libSvc.activateMember(aMember);

	}

}
