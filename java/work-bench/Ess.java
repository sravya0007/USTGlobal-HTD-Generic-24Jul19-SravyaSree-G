package com.dev.ESSPortal;

public class Ess {
	private int emp_id;
	private String emp_name;
	private double emp_type;
	private String email;
	private String password;
	private String leave_date;
	private String leave_status;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getEmp_type() {
		return emp_type;
	}

	public void setEmp_type(double emp_type) {
		this.emp_type = emp_type;
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

	public String getLeave_date() {
		return leave_date;
	}

	public void setLeave_date(String leave_date) {
		this.leave_date = leave_date;
	}

	public String getLeave_status() {
		return leave_status;
	}

	public void setLeave_status(String leave_status) {
		this.leave_status = leave_status;
	}

	@Override
	public String toString() {
		return "Ess [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_type=" + emp_type + ", email=" + email
				+ ", password=" + password + ", leave_date=" + leave_date + ", leave_status=" + leave_status + "]";
	}

}
