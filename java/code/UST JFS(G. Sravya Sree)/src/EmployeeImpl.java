import java.util.HashMap;

public class EmployeeImpl implements EmployeeInt {

	HashMap<String,Employee> hm=new HashMap<String,Employee> ();
	
	String []sal= {"AA","A","B","C","D"};
	float []t= { 9.35f, 8.87f,8.19f,7.34f,5.4f};
	int []pf= {5619,4876,4321,3765,3189};
	
	@Override
	public boolean insertEmp(String s, Employee emp) {
		// TODO Auto-generated method stub
		if(emp!=null) {
			hm.put(s,emp);
		return true;
		}
		return false;
	}

	
	

	@Override
	public boolean searchEmp(String s) {
		// TODO Auto-generated method stub
		if(s!=null) {
			boolean b=hm.containsKey(s);
			
			return b;
	}
		return false;
	}


	@Override
	public boolean removeEmp(String key) {
		// TODO Auto-generated method stub
		if(key!=null) {
			hm.remove(key);
		return true;
		}
		return false;

	}


	@Override
	public boolean updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int totalTax(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int netPay(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void salGrade(Employee emp) {
		// TODO Auto-generated method stub
		
	}

public void getData(Employee emp) {
	System.out.println(hm);
}

}
