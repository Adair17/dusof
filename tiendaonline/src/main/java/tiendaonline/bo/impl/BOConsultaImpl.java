package tiendaonline.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tiendaonline.bean.BeanCombo;
import tiendaonline.bean.BeanResult;
import tiendaonline.bo.BOConsulta;
import tiendaonline.dao.DAOConsulta;

@Component("boConsulta")
public class BOConsultaImpl implements BOConsulta {

	@Autowired
	DAOConsulta daoConsulta;

	public List<BeanCombo> consulta(String parametro) {
		// TODO Auto-generated method stub
		return null;
	}

	public BeanResult agregaRegistro(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public BeanResult modificaRegistro(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public BeanResult eliminaRegistro(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
