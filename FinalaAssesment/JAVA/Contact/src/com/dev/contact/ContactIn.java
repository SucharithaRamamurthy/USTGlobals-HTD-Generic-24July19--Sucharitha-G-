package com.dev.contact;

public class ContactIn {
	private String name;
	private long phnno;
	private String group;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhnno() {
		return phnno;
	}
	public void setPhnno(long phnno) {
		this.phnno = phnno;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "ContactIn [name=" + name + ", phnno=" + phnno + ", group=" + group + "]";
	}
	

}
