package odontologia.system.rest.api.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "remarcacao")
public class RemarcacaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_paciente", referencedColumnName = "id", nullable = false)
    private PacienteModel pacienteModel;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_remarcacao", nullable = false)
    private Date dataRemarcacao;

    @Column(name = "hora_remarcacao", nullable = false)
    private Time horaRemarcacao;
}
