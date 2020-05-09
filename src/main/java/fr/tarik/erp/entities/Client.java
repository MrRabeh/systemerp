package fr.tarik.erp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue
	private int id;

	private String lastname;

	private String firstname;

	private String codeclient;

	public Client() {
	}

	public Client(int id, String lastname, String firstname, String codeclient) {
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.codeclient = codeclient;
	}

	public int getId() {
		return id;
	}

	public String getLastname() {
		return lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getCodeclient() {
		return codeclient;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setCodeclient(String codeclient) {
		this.codeclient = codeclient;
	}
}
