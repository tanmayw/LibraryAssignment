package domain;

/**
 * @author tanmay.waikar
 * Domain class User
 */
public class User {

	private String name;
	private Integer age;
	private String address;
	private Boolean isMember;
	private Integer memberId;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
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
	
}
