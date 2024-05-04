package GestionDeFinanzasPersonales.RESTAPI.services;

import GestionDeFinanzasPersonales.RESTAPI.dao.CuentaDao;
import GestionDeFinanzasPersonales.RESTAPI.entities.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    CuentaDao cuentaDao;

    @Override
    public List<Cuenta> findAll() {
        return (List<Cuenta>)cuentaDao.findAll();
    }

    @Override
    public Cuenta findById(Long id) {
        return cuentaDao.findById(id).orElse(null);
    }

    @Override
    public void create(Cuenta cuenta) {
        cuentaDao.save(cuenta);
    }

    @Override
    public void update(Long id, Cuenta cuenta) {
        if (cuentaDao.existsById(id)){
            cuenta.setId(id);
            cuentaDao.save(cuenta);
        }
    }

    @Override
    public void delete(Long id) {
        if (cuentaDao.existsById(id)){
            cuentaDao.deleteById(id);
        }
    }

}