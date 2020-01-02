package com.deloitte.empl.applications;

import java.util.List;
import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

public class ViewEmpls {
	public static void main(String[] args) {
		EmpDao dao = new EmpDaoImpl();
		List<Emp> empls = dao.getEmpls();
		for(Emp e : empls)
			System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getJob()+" "+
			e.getMgr()+" "+e.getHiredate()+" "+e.getSal()+" "+e.getComm()+" "+
			e.getDeptno());
	}
}
