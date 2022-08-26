package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao department = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Department dep = department.findById(2);
		System.out.println(dep);
		
		
	}

}
