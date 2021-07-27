package com.ning;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name = "users")
public class User {
	
	@Id
	long id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Size(min = 3, max = 50)
	private String name;
	
	@NotBlank
	@Email(message = "Please enter a valid e-mail address")
	private String email;
	
	@NotBlank
	@Size(min = 8, max = 15)
	private String password;
	@Size(max = 100)
	private String note;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date ordertime;
	
	@NotBlank
	private String item;

	@Min(value = 10)
	@Max(value = 100)
	private long price;

	
	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public String getItem() {
		return item;
	}

	public void seItem(String item) {
		this.item = item;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
/*
	

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", orderTime=" + orderTime + ", note="
				+ note + ", item=" + item + ",  price="+ price + "]";
	}

	
*/
	
}
