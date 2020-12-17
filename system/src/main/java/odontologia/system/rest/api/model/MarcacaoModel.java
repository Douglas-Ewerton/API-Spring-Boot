package odontologia.system.rest.api.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "marcacao")

public class MarcacaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String telefone;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_consulta",nullable = false)
    private Date dataConsulta;

    @Column(name = "hora_consulta",nullable = false)
    private Time horaConsulta;


}
