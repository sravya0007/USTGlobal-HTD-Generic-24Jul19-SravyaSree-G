package com.dev.Exceptions;

public class EmpData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

EmpImpl e= new EmpImpl();
Emp ee=new Emp();
Emp ee1=new Emp();
Emp ee2=new Emp();
Emp ee3=new Emp();
ee.setId(2);
ee.setName("Sravya");
ee.setEmail("123@gmail.com");
ee.setPswd("1234");

ee1.setId(3);
ee1.setName("nani");
ee1.setEmail("nani3@gmail.com");
ee1.setPswd("1hgsd");

ee2.setId(76);
ee2.setName("sunny");
ee2.setEmail("sunny@gmail.com");
ee2.setPswd("1234");

ee3.setId(99);
ee3.setName("bunny");
ee3.setEmail("bunny@gmail.com");
ee3.setPswd("1234");
e.putEmp("s", ee);
e.putEmp("s1", ee1);
e.putEmp("s2", ee2);
e.putEmp("s3", ee3);
e.getEmp(ee);


}

}
