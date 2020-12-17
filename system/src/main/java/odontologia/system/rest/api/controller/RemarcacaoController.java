package odontologia.system.rest.api.controller;

import odontologia.system.rest.api.model.RemarcacaoModel;
import odontologia.system.rest.api.repository.RemacacaoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RemarcacaoController {

    private RemacacaoRepository repository;

    RemarcacaoController(RemacacaoRepository remacacaoRepository){
        this.repository = remacacaoRepository;
    }

    @CrossOrigin
    @PostMapping(path = "/remarcacao")
    public RemarcacaoModel salvar(@RequestBody RemarcacaoModel remarcacao){

        return repository.save(remarcacao);
    }

    @DeleteMapping(path ="/remarcacao/{id}/delete")
    public ResponseEntity delete(@PathVariable long id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

    @CrossOrigin
    @GetMapping(path = "/remarcacoes")
    public List<RemarcacaoModel> Lista(){
        return this.repository.findAll();
    }
}
