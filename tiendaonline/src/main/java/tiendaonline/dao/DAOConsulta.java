package tiendaonline.dao;

import java.util.List;

import tiendaonline.bean.BeanCombo;
import tiendaonline.bean.BeanResult;

public interface DAOConsulta {

	List<BeanCombo> consulta(String parametro);
	
	BeanResult agregaRegistro(String id);
	
	BeanResult modificaRegistro(String id);
	
	BeanResult eliminaRegistro(String id);
}
