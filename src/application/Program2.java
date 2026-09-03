package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartamentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartamentDao depDao = DaoFactory.createDepartamentDao();
		
		System.out.println("=== TEST 1: seller findById ====");
		Department dep = depDao.findById(1);
		System.out.println(dep);
	
		System.out.println("\n=== TEST 2: seller findAll ====");
		List<Department> list = depDao.findAll();
		
		for (Department obj : list) {
			
			System.out.println(obj);
		}

	}

}
