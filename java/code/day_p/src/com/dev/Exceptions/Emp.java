package com.dev.Exceptions;



public class Emp {

	
	private int id;
	private String name;
	private String email;
	private String pswd;

	public int getId() {
		return id;
	}
	public void setId(int i) {
		this.id= i;
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
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

		
		 @Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + ", email=" + email + ", pswd=" + pswd + "]";
		}
		

	/*
	 * public int compareTo(Emp emp) { return this.id-emp.id; }
	 */
}

