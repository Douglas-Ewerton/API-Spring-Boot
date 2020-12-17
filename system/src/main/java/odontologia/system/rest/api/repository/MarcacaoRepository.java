package odontologia.system.rest.api.repository;

import odontologia.system.rest.api.model.MarcacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MarcacaoRepository extends JpaRepository<MarcacaoModel, Long> {
}
