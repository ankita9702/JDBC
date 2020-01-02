package com.deloitte.empl.dao;

import java.util.List;
import com.deloitte.empl.beans.Emp;

public interface EmpDao {
	void openConnection();
	void close();
	int addEmp(Emp emp); 
	List<Emp> getEmpls();
	Emp getEmpByCode(int empcode);
	Emp updateSalary(int empno, double salary);
	Emp updateCommision(int empno, double comm);
	int deleteRecord(int empno);
}
