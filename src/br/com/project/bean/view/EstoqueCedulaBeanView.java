package br.com.project.bean.view;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.framework.interfac.crud.InterfaceCrud;
import br.com.project.bean.geral.BeanManagedViewAbstract;
import br.com.project.geral.controller.EstoqueCedulaController;

@Controller
@Scope(value = "session")
@ManagedBean(name = "estoqueEstoqueCedulaBeanView")
public class EstoqueCedulaBeanView extends BeanManagedViewAbstract {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EstoqueCedulaController estoqueEstoqueCedulaController;

	@Override
	protected Class<?> getClassImplement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected InterfaceCrud<?> getController() {
		// TODO Auto-generated method stub
		return null;
	}


}
