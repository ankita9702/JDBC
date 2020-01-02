package com.deloitte.empl.applications;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

public class UpdateEmpCommision {
	public static void main(String[] args) {
		EmpDao dao = new EmpDaoImpl();
		Emp e = null;
		try{
			e = dao.updateCommision(7566, 4598.0);
		}
		catch(NullPointerException err){
			System.out.println("Employee not found");
		}
		System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getJob()+" "+
				e.getMgr()+" "+e.getHiredate()+" "+e.getSal()+" "+e.getComm()+" "+
				e.getDeptno());
	}
}
