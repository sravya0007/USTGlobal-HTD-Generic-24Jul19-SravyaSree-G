package com.dev.Exceptions;
import java.util.HashMap;

public class EmpImpl implements Empint{

	HashMap <String,Emp> h=new HashMap<String,Emp>();
	
	@Override
	public boolean putEmp(String key, Emp emp) {
		if(emp!=null) {
			h.put(key,emp);
		return true;
		}
		return false;
	}

	@Override
	public boolean removeEmp(Emp emp) {
		// TODO Auto-generated method stub
		
		if(emp!=null) {
			h.remove(emp);
		return true;
		}return false;
	}

	@Override
	public void getEmp(Emp emp) {
		// TODO Auto-generated method stub
		System.out.println(h);
		
	}

}
