package domain;

import java.util.Date;

public class Member {	
	private Integer memberId;
	private Boolean isMember = false;
	private Boolean isLibrarian;
	private Boolean isFineApplicable;
	private String bookTitleIssued;
	private Date bookIssued;
	private Date bookToBeReturned;
	private Boolean isBookOverDue;
	private Integer booksBoorowed;
	/**
	 * @return the memberId
	 */
	public Integer getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return the isMember
	 */
	public Boolean getIsMember() {
		return isMember;
	}
	/**
	 * @param isMember the isMember to set
	 */
	public void setIsMember(Boolean isMember) {
		this.isMember = isMember;
	}
	/**
	 * @return the isLibrarian
	 */
	public Boolean getIsLibrarian() {
		return isLibrarian;
	}
	/**
	 * @param isLibrarian the isLibrarian to set
	 */
	public void setIsLibrarian(Boolean isLibrarian) {
		this.isLibrarian = isLibrarian;
	}
	/**
	 * @return the isFineApplicable
	 */
	public Boolean getIsFineApplicable() {
		return isFineApplicable;
	}
	/**
	 * @param isFineApplicable the isFineApplicable to set
	 */
	public void setIsFineApplicable(Boolean isFineApplicable) {
		this.isFineApplicable = isFineApplicable;
	}
	/**
	 * @return the bookTitleIssued
	 */
	public String getBookTitleIssued() {
		return bookTitleIssued;
	}
	/**
	 * @param bookTitleIssued the bookTitleIssued to set
	 */
	public void setBookTitleIssued(String bookTitleIssued) {
		this.bookTitleIssued = bookTitleIssued;
	}
	/**
	 * @return the bookIssued
	 */
	public Date getBookIssued() {
		return bookIssued;
	}
	/**
	 * @param bookIssued the bookIssued to set
	 */
	public void setBookIssued(Date bookIssued) {
		this.bookIssued = bookIssued;
	}
	/**
	 * @return the bookToBeReturned
	 */
	public Date getBookToBeReturned() {
		return bookToBeReturned;
	}
	/**
	 * @param bookToBeReturned the bookToBeReturned to set
	 */
	public void setBookToBeReturned(Date bookToBeReturned) {
		this.bookToBeReturned = bookToBeReturned;
	}
	/**
	 * @return the isBookOverDue
	 */
	public Boolean getIsBookOverDue() {
		return isBookOverDue;
	}
	/**
	 * @param isBookOverDue the isBookOverDue to set
	 */
	public void setIsBookOverDue(Boolean isBookOverDue) {
		this.isBookOverDue = isBookOverDue;
	}
	/**
	 * @return the booksBoorowed
	 */
	public Integer getBooksBoorowed() {
		return booksBoorowed;
	}
	/**
	 * @param booksBoorowed the booksBoorowed to set
	 */
	public void setBooksBoorowed(Integer booksBoorowed) {
		this.booksBoorowed = booksBoorowed;
	}
		
}
