package GestionDeFinanzasPersonales.RESTAPI.controllers;

import GestionDeFinanzasPersonales.RESTAPI.entities.Cuenta;
import GestionDeFinanzasPersonales.RESTAPI.services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {

    @Autowired
    CuentaService cuentaService;

    @GetMapping
    public List<Cuenta> GetAll(){
        return cuentaService.findAll();
    }

    @GetMapping(value="/{id}")
    public Cuenta GetById(@PathVariable Long id){
        return cuentaService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Cuenta cuenta){
        cuentaService.create(cuenta);
    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Cuenta cuenta){
        cuentaService.update(id, cuenta);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        cuentaService.delete(id);
    }

}
