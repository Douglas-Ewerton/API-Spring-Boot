package odontologia.system.rest.api.controller;

import odontologia.system.rest.api.model.MarcacaoModel;
import odontologia.system.rest.api.model.PacienteModel;
import odontologia.system.rest.api.repository.MarcacaoRepository;
//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MarcacaoController {

    private MarcacaoRepository repository;

    MarcacaoController(MarcacaoRepository marcacaoRepository) {
        this.repository = marcacaoRepository;
    }

    @CrossOrigin
    @GetMapping(path = "/marcacoes")
    public List<MarcacaoModel> Lista(){
        return this.repository.findAll();
    }

    @CrossOrigin
    @PostMapping(path = "/marcacao")
    public MarcacaoModel salvar(@RequestBody MarcacaoModel marcacao){

        return repository.save(marcacao);
    }

    @CrossOrigin
    @DeleteMapping(path ="/marcacao/{id}/delete")
    public ResponseEntity delete(@PathVariable long id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
