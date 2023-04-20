package com.jsp.map.cascode.joincolumn;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.jsp.bank.branch.Branch;
@Entity
public class Bank1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(mappedBy = "bank1",cascade = CascadeType.ALL)
	private List<Branch1> branches;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Branch1> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch1> branches) {
		this.branches = branches;
	}

}
