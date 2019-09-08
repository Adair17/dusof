package tiendaonline.bean;

import java.io.Serializable;

import tiendaonline.util.Constantes;

public class BeanResult implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private boolean ejecucionCorrecta = false;
	
	private String msgError = Constantes.CADENA_VACIA;
	
	private String codError = Constantes.CADENA_VACIA;

	public boolean isEjecucionCorrecta() {
		return ejecucionCorrecta;
	}

	public void setEjecucionCorrecta(boolean ejecucionCorrecta) {
		this.ejecucionCorrecta = ejecucionCorrecta;
	}

	public String getMsgError() {
		return msgError;
	}

	public void setMsgError(String msgError) {
		this.msgError = msgError;
	}

	public String getCodError() {
		return codError;
	}

	public void setCodError(String codError) {
		this.codError = codError;
	}
}
