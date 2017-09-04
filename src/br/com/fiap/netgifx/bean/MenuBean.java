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
		
		//Substituir por usuario.isLogado()
		if (true){
			model.addElement(menuCategorias());
			
			//Substituir por usuario.isAdmin()
			if(true){
				model.addElement(cadastrarCategoria());
				model.addElement(cadastrarGif());
			}
			
			model.addElement(menuConta());
		}else{
			model.addElement(login());
			model.addElement(signin());
		}
	}
	
	private DefaultSubMenu menuCategorias(){
		DefaultSubMenu categorias = new DefaultSubMenu("Categorias");

		DefaultMenuItem categoria;
		
		//Conectar com banco de dados para buscar categorias
		for (int i = 0; i < 3; i++) {
			categoria = new DefaultMenuItem("Categoria: " + i);
			categoria.setUrl("url para categorias");

			categorias.addElement(categoria);			
		}
		
		return categorias;
	}
	
	private DefaultSubMenu menuConta(){
		//Buscar nome do usuario do objeto Usuario
		DefaultSubMenu conta = new DefaultSubMenu("usuario.getNome()");
		
		DefaultMenuItem perfil = new DefaultMenuItem("Perfil");
		perfil.setUrl("url para detalhes do perfil");
		
		conta.addElement(perfil);
		
		conta.addElement(new DefaultSeparator());
		
		DefaultMenuItem logout = new DefaultMenuItem("Logout");
		//Deslogar usuario usuario.logout()
		
		conta.addElement(logout);
		
		return conta;
	}
	
	private DefaultMenuItem cadastrarCategoria(){
		DefaultMenuItem cadastrarCategoria = new DefaultMenuItem("Cadastrar Categoria");
		cadastrarCategoria.setUrl("url para cadastro de categorias");
		
		return cadastrarCategoria;
	}
		 
	private DefaultMenuItem cadastrarGif(){
		DefaultMenuItem cadastrarGif = new DefaultMenuItem("Cadastrar Gif");
		cadastrarGif.setUrl("url para cadastro de gifs");
		
		return cadastrarGif;
		
	}

	private DefaultMenuItem login(){
		DefaultMenuItem login = new DefaultMenuItem("Login");
		login.setUrl("url para login");
		
		return login;
	}
		 
	private DefaultMenuItem signin(){
		DefaultMenuItem signin = new DefaultMenuItem("Cadastre-se");
		signin.setUrl("url para signin");
		
		return signin;
		
	}
	
	public MenuModel getModel() {
		return model;
	}	
}
