package service;

import java.util.Scanner;

import domain.Member;

/**
 * @author tanmay.waikar 
 * LiberaryService class calling the other library and
 * member interface methods.
 */
public class LibraryService {

	public void activateMember(Member aMember) {

		ILibrarian librarian = new LibrarianImpl();
		IMember member = new MemberImpl();

		// check for the member role from the input system
		if (aMember.getIsLibrarian()) {

			// librarian interface can be used to call its service
			// implementations
			// As per commands, different service api can be used following the
			// command pattern

			// Get the choice from the UI interface for this example choice is
			// system input
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice 1. findBooksByTitle 2. findBooksByAuthor 3. isBookOverDue  4. lendBook");
			int choice = sc.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("Enter the title of the book");
				String title = sc.next();
				librarian.findBookByTitle(title);
			}
				break;

			case 2: {
				System.out.println("Enter the author of the book");
				String author = sc.next();
				librarian.findBookByAuthor(author);
			}
				break;

			case 3:
				librarian.isBookOverDue(aMember);
				break;
			case 4: {
				System.out.println("Which book title to issue ?");
				String title = sc.next();
				System.out.println("Which author you would like ?");
				String author = sc.next();

				librarian.lendBook(aMember,
						member.requestToIssue(title, author));
			}
				break;
			default:
				break;
			}

		} else if (aMember.getIsMember()) {

			// call the service method to borrow the books
			member.borrowBooks();

		} else if (!aMember.getIsMember()) {
			// call the service method to register
			member.register();
		}

	}

}
