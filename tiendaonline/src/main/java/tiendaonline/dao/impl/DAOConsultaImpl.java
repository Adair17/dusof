package tiendaonline.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import tiendaonline.bean.BeanCombo;
import tiendaonline.bean.BeanResult;
import tiendaonline.dao.DAOConsulta;
import tiendaonline.util.Constantes;

@Component
public class DAOConsultaImpl implements DAOConsulta{

	/** The logger. */
	private final Logger LOGGER = Logger.getLogger(DAOConsultaImpl.class);
	
	/** The jdbc template. */
	private JdbcTemplate jdbcTemplate;

	/** The data source. */
	@Autowired
	private DataSource dataSource;
	
	public List<BeanCombo> consulta(String parametro) {
		List<BeanCombo> resultado = new ArrayList<BeanCombo>();
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		List<Map<String, Object>> result = jdbcTemplate.queryForList(Constantes.CONSULTA, parametro);
		for (Map<String, Object> registro : result) {
			BeanCombo registroBean = new BeanCombo();
			registroBean.setKey(registro.get("pk").toString());
			registroBean.setValue(registro.get("value").toString());
			resultado.add(registroBean);
		}
		return resultado;
	}

	public BeanResult agregaRegistro(String id) {
		BeanResult result = new BeanResult(); 
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		try {
			jdbcTemplate.update(Constantes.INSERT, id);
			result.setEjecucionCorrecta(true);
		}catch(DataAccessException e) {
			result.setEjecucionCorrecta(false);
			LOGGER.error(e.getMessage(), e);
		}
		return result;
	}

	public BeanResult modificaRegistro(String id) {
		BeanResult result = new BeanResult(); 
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		try {
			jdbcTemplate.update(Constantes.UPDATE, id);
			result.setEjecucionCorrecta(true);
		}catch(DataAccessException e) {
			result.setEjecucionCorrecta(false);
			LOGGER.error(e.getMessage(), e);
		}
		return result;
	}

	public BeanResult eliminaRegistro(String id) {
		BeanResult result = new BeanResult(); 
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		try {
			jdbcTemplate.execute(String.format(Constantes.DELETE, id));
			result.setEjecucionCorrecta(true);
		}catch(DataAccessException e) {
			result.setEjecucionCorrecta(false);
			LOGGER.error(e.getMessage(), e);
		}
		
		return result;
	}

}
