package model;
import java.io.Serializable;

public class Students implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String address;
	private String encryptedPassword;
	private String gender;
	private String comment;
	private String imagepath;

	
	public Students(int id, String name, String address, String encryptedPassword, String gender, String comment,
			String imagepath) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.encryptedPassword = encryptedPassword;
		this.gender = gender;
		this.comment = comment;
		this.imagepath = imagepath;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
