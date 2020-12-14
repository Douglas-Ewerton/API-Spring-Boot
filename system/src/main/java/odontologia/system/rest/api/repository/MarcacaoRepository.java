package odontologia.system.rest.api.repository;

import odontologia.system.rest.api.model.MarcacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface MarcacaoRepository extends JpaRepository<MarcacaoModel, Long> {
}
