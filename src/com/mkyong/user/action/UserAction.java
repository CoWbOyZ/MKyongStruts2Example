package com.mkyong.user.action;

import com.mkyong.user.bo.UserBo;
import com.opensymphony.xwork2.ActionSupport;
 
public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//DI via Spring
	UserBo userBo;
	
	public UserBo getUserBo() {
		return userBo;
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String execute() throws Exception {
		
		/*WebApplicationContext context =
			WebApplicationContextUtils.getRequiredWebApplicationContext(ServletActionContext.getServletContext());
		
		UserBo userBo1 = (UserBo)context.getBean("userBo");
		userBo1.printUser();*/
		System.out.println("excute()");
		userBo.printUser();
		
		return SUCCESS;
		
	}
}