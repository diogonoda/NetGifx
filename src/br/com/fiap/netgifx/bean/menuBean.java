package br.com.fiap.netgifx.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class menuBean {
	private String phone;
	
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
	
	public void logout(){
		System.out.println("Logout disparado");
	}
}
