package com.jing.entity;

import java.io.Serializable;


/**
 * 用户信息
 * @author Administrator
 *
 */
public class User implements Serializable{

	private static final long serialVersionUID = -5434601490952477749L;
	public User() {
		super();
	}
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public User(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	private Integer id;
	private String name;
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
