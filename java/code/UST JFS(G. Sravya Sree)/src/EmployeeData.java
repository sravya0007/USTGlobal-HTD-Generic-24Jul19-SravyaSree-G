
public class EmployeeData {
	public static void main(String []args) {
		EmployeeImpl el = new EmployeeImpl();
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		Employee e5=new Employee();
		
		e1.setEmpid(101);
		e1.setEname("sravya");
		e1.setEmail("sravya@gmail.com");
		e1.setPassword("12345");
		e1.setSalary(1200000);
		
		e2.setEmpid(201);
		e2.setEname("sunny");
		e2.setEmail("sunny@gmail.com");
		e2.setPassword("12qe345");
		e2.setSalary(893773);

		e3.setEmpid(341);
		e3.setEname("kavya");
		e3.setEmail("kavya@gmail.com");
		e3.setPassword("kavya45");
		e3.setSalary(765896);

		e4.setEmpid(501);
		e4.setEname("ravi");
		e4.setEmail("ravi@gmail.com");
		e4.setPassword("oop12345");
		e4.setSalary(987654);

		e5.setEmpid(191);
		e5.setEname("ram");
		e5.setEmail("ram@gmail.com");
		e5.setPassword("ram45");
		e5.setSalary(1234560);
		el.insertEmp("a",e1);
		el.insertEmp("b",e2);
		el.insertEmp("c",e3);
		el.insertEmp("d",e4);
		el.insertEmp("e",e5);
		System.out.println("--------------------Insertion-------------");
		
		el.getData(e1);
		System.out.println("--------------------updation--------------");
		//updation
		e1.setEname("John");
		e1.setEmail("john@gmail.com");
		el.getData(e1);
		System.out.println("--------------------Removing--------------");
		el.removeEmp("a");
		el.getData(e1);
		System.out.println("--------------------searching--------------");
		boolean b1=el.searchEmp("d");
		System.out.println(b1);
		
		boolean b=el.searchEmp("g");
		System.out.println(b);
		
		
		
		
		

}

}
