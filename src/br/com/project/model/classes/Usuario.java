package br.com.project.model.classes;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.envers.Audited;

@Audited
@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String login = null;

	private String senha;
	
	private boolean ativo = true;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date ultimoAcesso;
	
	public void setUltimoAcesso(Date ent_ultimoacesso) {
		this.ultimoAcesso = ent_ultimoacesso;
	}
	
	public Date getUltimoAcesso() {
		return ultimoAcesso;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	

}
