package odontologia.system.rest.api.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import  java.util.Calendar;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "marcacao")

public class MarcacaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String telefone;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_consulta")
    private Date dataConsulta;


    @Column(name = "hora_consulta")
    private Time horaConsulta;


}
