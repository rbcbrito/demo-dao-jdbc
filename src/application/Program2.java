package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: department findByName ===");
		Department department = new Department(null, "Computers");
		List<Department> list = departmentDao.findByName(department);
		for (Department obj : list) {
			System.out.println(obj);
		}
	}

}
