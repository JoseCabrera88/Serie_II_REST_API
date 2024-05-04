package GestionDeFinanzasPersonales.RESTAPI.dao;

import GestionDeFinanzasPersonales.RESTAPI.entities.Cuenta;
import org.springframework.data.repository.CrudRepository;

public interface CuentaDao extends CrudRepository<Cuenta, Long> {

}
