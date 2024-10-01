package com.Nil.nishil.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int Sid;
	
	private String Sname;
	
	private String Sadd;
	
	private int srank;
	
	private String jobRoll;

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getSadd() {
		return Sadd;
	}

	public void setSadd(String sadd) {
		Sadd = sadd;
	}

	public int getSrank() {
		return srank;
	}

	public void setSrank(int srank) {
		this.srank = srank;
	}

	public String getJobRoll() {
		return jobRoll;
	}

	public void setJobRoll(String jobRoll) {
		this.jobRoll = jobRoll;
	}

	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Sadd=" + Sadd + ", srank=" + srank + ", jobRoll="
				+ jobRoll + "]";
	}
	
	

}
