package com.deloitte.empl.utils;

public class EmpUtils {
	public static String insertqry="insert into emp values(?,?,?,?,?,?,?,?)";
	public static final String GETEMPLS = "select * from emp";
	public static final String GETEMPlBYCODE = "select * from emp where empno=?";
	public static final String UPADTESALARY = "update emp set sal=? where empno=?";
	public static final String UPADTECOMM = "update emp set comm=? where empno=?";
	public static final String DELETERECORD = "delete from emp where empno=?";
}
