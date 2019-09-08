package tiendaonline.bo;

import java.util.List;

import tiendaonline.bean.BeanCombo;
import tiendaonline.bean.BeanResult;
import tiendaonline.exception.BusinessException;

public interface BOConsulta {

	List<BeanCombo> consulta(String parametro) throws BusinessException;
	
	BeanResult agregaRegistro(String id) throws BusinessException;
	
	BeanResult modificaRegistro(String id) throws BusinessException;
	
	BeanResult eliminaRegistro(String id) throws BusinessException;
	
	
}
