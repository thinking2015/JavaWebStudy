package cn.edu.buaa.pojo;

import java.util.List;

public class JikeUser {
	
	private int id;
	private String userName;
	private String password;
	private List<Visit> visitList;
	
	// 注意：自己定义了构造函数后，需要加入默认的无参构造函数，mybatis会用到
	public JikeUser() {
		super();
	}

	public JikeUser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Visit> getVisitList() {
		return visitList;
	}

	public void setVisitList(List<Visit> visitList) {
		this.visitList = visitList;
	}

	@Override
	public String toString() {
		return id + " " + userName + " " + password;
	}
	
}
