

package com.dev.encapsulation;

public class Dog implements Comparable<Dog>  {
	private int age;
	private String bread;
	private String color;
	@Override
	public String toString() {
		return "Dog [age=" + age + ", bread=" + bread + ", color=" + color + ", name=" + name + "]";
	}
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Dog d) {
		// TODO Auto-generated method stub
		return (this.age - d.age);
	}
	

}
