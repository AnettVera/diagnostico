package mx.edu.utez.diagnostico.model.dao;

import mx.edu.utez.diagnostico.model.entity.PersonBean;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<PersonBean, Integer> {
}
