package br.com.project.bean.view;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.project.bean.geral.BeanManagedViewAbstract;

@Controller
@Scope(value = "session")
@ManagedBean(name = "usuarioBeanView")
public class UsuarioBeanView extends BeanManagedViewAbstract{
	
	@Autowired
	private ContextoBean contextoBean;

	private static final long serialVersionUID = 1L;

	public String getUsuarioLogadoSecurity() {
		return contextoBean.getAuthentication().getName();
	}

}
