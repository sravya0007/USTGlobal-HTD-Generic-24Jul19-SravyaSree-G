
package com.dev.ESSPortal;

import java.util.HashSet;
import java.util.Scanner;

public class ESSData {

	public static void main(String[] args) {
		ESSImpl e = new ESSImpl();
		Ess e1 = new Ess();
		Ess e2 = new Ess();
		Ess e3 = new Ess();
		Ess e4 = new Ess();
		Ess e5 = new Ess();
		e1.setEmp_id(13);
		e1.setEmp_name("nani");
		e1.setEmp_type(3000);
		e1.setEmail("nani@gmail.com");
		e1.setPassword("qwerty");

		e2.setEmp_id(23);
		e2.setEmp_name("poni");
		e2.setEmp_type(312300);
		e2.setEmail("poni@gmail.com");
		e2.setPassword("qwerty");

		e3.setEmp_id(9);
		e3.setEmp_name("ant");
		e3.setEmp_type(30);
		e3.setEmail("poni@gmail.com");
		e3.setPassword("qwerty");

		e4.setEmp_id(13);
		e4.setEmp_name("moni");
		e4.setEmp_type(30100);
		e4.setEmail("moni@gmail.com");
		e4.setPassword("qwerty");
		e.addEmp("a", e1);
		e.addEmp("b", e2);
		e.addEmp("c", e3);
		e.addEmp("d", e4); // e.getEmp();
		System.out.println("press 1 for register, 2 for login");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		int b = 0;
		// register
		if (a == 1) {
			e5.setEmp_id(153);
			e5.setEmp_name("toni");
			e5.setEmp_type(3100);
			e5.setEmail("toni@gmail.com");
			e5.setPassword("qwerty");
			e.addEmp("e", e5);
			e.display();

		}
		// login
		else {

			System.out.println("enter id");
			s.nextLine();
			boolean b1 = e.login(s.nextLine());
			System.out.println(b1);
			if (b1 == true) {
				System.out.println("enter leave date");
				String leave_date = s.nextLine();
				e4.setLeave_date(leave_date);
				System.out.println("enter leave status");
				String leave_status = s.nextLine();
				e4.setLeave_status(leave_status);
				e.getEmp("c");
			}

		}

	}

}
