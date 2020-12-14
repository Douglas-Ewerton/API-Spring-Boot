package odontologia.system.rest.api.controller;

import odontologia.system.rest.api.model.PacienteModel;
import odontologia.system.rest.api.repository.PacienteRepository;
//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PacienteController {


    private PacienteRepository repository;

    PacienteController(PacienteRepository pacienteRepository) {
        this.repository = pacienteRepository;
    }

    //Buscar o paciente pelo id
    @CrossOrigin
    @GetMapping(path = "/paciente/{id}")
    public ResponseEntity consultar(@PathVariable("id") Long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    //Adicionar um novo paciente
    @CrossOrigin
    @PostMapping(path = "/paciente/cadastro")
    public PacienteModel salvar(@RequestBody PacienteModel paciente){

        return repository.save(paciente);
    }

    //Deletar um paciente pelo id
    @CrossOrigin
    @DeleteMapping(path ="/paciente/{id}/delete")
    public ResponseEntity delete(@PathVariable long id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

    //Atualiza as informações do paciente
    @CrossOrigin
    @PutMapping(value="/paciente/{id}/editar")
    public ResponseEntity Editar(@PathVariable("id") long id,
                                 @RequestBody PacienteModel pacienteModel) {
        return repository.findById(id)
                .map(record -> {
                    record.setNome(pacienteModel.getNome());
                    record.setCpf(pacienteModel.getCpf());
                    record.setEmail(pacienteModel.getEmail());
                    record.setTelefone(pacienteModel.getTelefone());
                    record.setDataNascimento(pacienteModel.getDataNascimento());
                    record.setSexo(pacienteModel.getSexo());
                    record.setCep(pacienteModel.getCep());
                    record.setLogradouro(pacienteModel.getLogradouro());
                    record.setBairro(pacienteModel.getBairro());
                    record.setLocalidade(pacienteModel.getLocalidade());
                    record.setUf(pacienteModel.getUf());
                    record.setComplemento(pacienteModel.getComplemento());
                    record.setFicha(pacienteModel.getFicha());


                    PacienteModel atualizado = repository.save(record);
                    return ResponseEntity.ok().body(atualizado);
                }).orElse(ResponseEntity.notFound().build());
    }
    @CrossOrigin
    @GetMapping(path = "/pacientes")
    public List<PacienteModel> Lista(){
        return this.repository.findAll();
    }

}
