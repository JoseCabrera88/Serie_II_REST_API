package GestionDeFinanzasPersonales.RESTAPI.services;

import GestionDeFinanzasPersonales.RESTAPI.entities.Cuenta;

import java.util.List;

public interface CuentaService {
    public List<Cuenta> findAll();
    public Cuenta findById(Long id);

    public void create(Cuenta cuenta);
    public void update(Long id, Cuenta cuenta);
    public void delete(Long id);
}
