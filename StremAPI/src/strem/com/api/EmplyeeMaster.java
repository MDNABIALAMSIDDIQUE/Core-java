package strem.com.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmplyeeMaster {
	
	public static void main(String[] args) {
		// Q1 
		List<Employee> employees = getAllEmployees();
		Map<String,Long> collect = employees.stream().
				collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(collect);
		// Q1 Ends
		
		//Q2
		Set<String> Collect2=employees.stream().map(e->e.getDepartment()).collect(Collectors.toSet());
		System.out.println(Collect2);
		
		
		
		
	}
	
	public static List<Employee> getAllEmployees(){
		
		List<Employee> employeelist=new ArrayList<Employee>();
		employeelist.add(new Employee(11,"NABI ALAM",25,"Male","TSM"));
		employeelist.add(new Employee(12,"Fatima",25,"Female","IT"));
		employeelist.add(new Employee(13,"Zohan",2,"Male","IT"));
		employeelist.add(new Employee(115,"Noor",25,"Female","BM"));
		employeelist.add(new Employee(116,"Sufi",25,"Female","IT"));
		employeelist.add(new Employee(118,"NABI ALAM",25,"Male","Helper"));
		employeelist.add(new Employee(119,"Raza",25,"Male","IT"));
		employeelist.add(new Employee(115,"Nehal",25,"Male","HR"));
		employeelist.add(new Employee(112,"Tahir",25,"Male","IT"));
		employeelist.add(new Employee(132,"Rajik",25,"Male","Driver"));
		employeelist.add(new Employee(121,"Zuraj",2,"Male","IT"));
		employeelist.add(new Employee(191,"NABI ALAM",25,"Male","IT"));
		employeelist.add(new Employee(161,"Fiza",25,"Female","SM"));
		
		
		return employeelist;
	}

}
