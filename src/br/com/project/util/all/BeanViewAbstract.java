package br.com.project.util.all;

public abstract class BeanViewAbstract implements ActionViewPadrao {

	
	private static final long serialVersionUID = 1L;

	@Override
	public String novo() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void limparLista() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public String save() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveNotReturn() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveEdit() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public String ativar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setarVariaveisNulas() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void consultarEntidade() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void statusOperation(StatusPersistencia a) throws Exception {
		Messagens.responseOperation(a);

	}
	
	protected void sucesso() throws Exception {
		statusOperation(StatusPersistencia.SUCESSO);
	}

	protected void error() throws Exception {
		statusOperation(StatusPersistencia.ERRO);
	}
	
	@Override
	public String redirecionarNewEntidade() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String redirecionarFindEntidade() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMsg(String msg) {
		Messagens.msg(msg);

	}

}
