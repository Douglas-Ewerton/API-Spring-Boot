package odontologia.system.rest.api.model;

import javax.persistence.*;
import java.util.Date;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "paciente")
public class PacienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name="data_nascimento")
    private Date dataNascimento;

    @Column(nullable = false)
    private String sexo;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String localidade;

    @Column(nullable = false)
    private String uf;

    @Column(nullable = false)
    private String complemento;

    @Column
    private String ficha;

}
