package com.internousdev.login3.action;

import com.internousdev.login3.dao.LoginDAO;
import com.internousdev.login3.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;

	public String execute(){
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();
		dto = dao.select(username,password);

			if(username.equals(dto.getUsername())){
				if(password.equals(dto.getPassword())){
					ret = SUCCESS;
				}
			}
			return ret;
		}





	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username セットする username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}