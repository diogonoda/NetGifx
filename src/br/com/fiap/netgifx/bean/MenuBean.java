package br.com.fiap.netgifx.bean;

import javax.faces.bean.ManagedBean;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSeparator;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@ManagedBean
public class MenuBean {
	private MenuModel model;
	
	public MenuBean() {
		model = new DefaultMenuModel();

		//Busca usuario logado getUsuario()
		
		//Substituir por usuario.logado()
		if (true){
			DefaultSubMenu firstSubmenu = new DefaultSubMenu("Categorias");

			DefaultMenuItem categoria;
			
			//Conectar com banco de dados para buscar categorias
			for (int i = 0; i < 3; i++) {
				categoria = new DefaultMenuItem("Categoria: " + i);
				categoria.setUrl("url para categorias");

				firstSubmenu.addElement(categoria);			
			}
		 
			model.addElement(firstSubmenu);

			//Buscar nome do usuario do objeto Usuario
			DefaultSubMenu secondSubmenu = new DefaultSubMenu("usuario.getNome()");
			
			DefaultMenuItem perfil = new DefaultMenuItem("Perfil");
			perfil.setUrl("url para detalhes do perfil");
			
			secondSubmenu.addElement(perfil);
			
			secondSubmenu.addElement(new DefaultSeparator());
			
			DefaultMenuItem logout = new DefaultMenuItem("Logout");
			//Deslogar usuario usuario.logout()
			
			secondSubmenu.addElement(logout);
			
			model.addElement(secondSubmenu);
		}
	}
		 
	public MenuModel getModel() {
		return model;
	}	
	
/*	private String phone;
	
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
	
	public void logout(){
		System.out.println("Logout disparado");
	}
*/
	
/*	private MenuModel model;

	public menuBean() {
		model = new DefaultMenuModel();

        //First submenu  
        Submenu submenu = new Submenu();  
	        submenu.setLabel("Dynamic Submenu 1");  
	        MenuItem item = new MenuItem();  
	        item.setValue("Dynamic Menuitem 1.1");  
	        item.setUrl("#");  
	        submenu.getChildren().add(item);  
	        model.addSubmenu(submenu);  
	        //Second submenu  
	        submenu = new Submenu();  
	        submenu.setLabel("Dynamic Submenu 2");  
	        item = new MenuItem();  
	        item.setValue("Dynamic Menuitem 2.1");  
	        item.setUrl("#");  
	        submenu.getChildren().add(item);  
	        item = new MenuItem();  
	        item.setValue("Dynamic Menuitem 2.2");  
	        item.setUrl("#");  
	        submenu.getChildren().add(item);  
	        model.addSubmenu(submenu);  
	    }
	    */
}
