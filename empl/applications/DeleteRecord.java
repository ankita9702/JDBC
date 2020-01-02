package com.deloitte.empl.applications;

import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

public class DeleteRecord {
	public static void main(String[] args) {
		EmpDao dao = new EmpDaoImpl();
		int rows=0;
		try{
			rows = dao.deleteRecord(11);
		}
		catch(NullPointerException err){
			System.out.println("Employee not found");
		}
		if(rows==1)
			System.out.println("Deleted");
		else
			System.out.println("Not Deleted");
	}
}
