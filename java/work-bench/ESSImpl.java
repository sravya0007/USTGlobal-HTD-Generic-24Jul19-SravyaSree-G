package com.dev.ESSPortal;

import java.util.HashMap;
import java.util.Scanner;

public class ESSImpl implements EssInt {

	static HashMap<String, Ess> hs = new HashMap<String, Ess>();

	public boolean addEmp(String s, Ess ess) {
		if (ess != null) {
			hs.put(s, ess);
			return true;

		}

		return false;
	}

	@Override
	public void getEmp(String s) {
		// TODO Auto-generated method stub
		System.out.println(hs.get(s));
	}

	@Override
	public boolean leaveDate(String s, Ess ess) {

		if (s != null) {
			return false;
		}
		return false;

	}

	@Override
	public boolean leaveStatus(String s, Ess ess) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean login(String s, Ess ess) {
		if (hs.containsKey(s)) {
			System.out.println(hs.get(s));

			return true;

		}
		return false;

	}

	@Override
	public boolean login(String s) {
		// TODO Auto-generated method stub
		if (hs.containsKey(s)) {
			System.out.println(hs.get(s));

			return true;

		}
		return false;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(hs);
	}

}
