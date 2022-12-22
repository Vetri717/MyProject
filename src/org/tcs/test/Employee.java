package org.tcs.test;

public class Employee {
public void empId() {
	System.out.println("employee id 123");
}
public void empName() {
	System.out.println("employee name vetri");
}

public void empDob() {
	System.out.println("employee Dob 03-05-1995");
	
}

public void empPhone() {
	System.out.println("employee phone 8148687021 ");
	
}

public void empEmail() {
	System.out.println("employee email vetrivemsd07@gmail.com");
}

public void empAdress () {
	System.out.println("employee Adress No.54 10th street, Nandhivaram, Guduvancheri, 603202");
}
public static void main(String[]args) {
	Employee e=new Employee();
	e.empName();
	e.empId();
	e.empDob();
	e.empEmail();
	e.empPhone();
	e.empAdress();
}
  
}