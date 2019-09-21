package com.dev.ESSPortal;

public interface EssInt {
	public boolean addEmp(String s,Ess ess);
	//public boolean (Ess ess);
	public void getEmp(String s);
	public boolean leaveDate(String s,Ess ess);
	public boolean leaveStatus(String s,Ess ess);
	public boolean login(String s);
	public void display();
	
}
