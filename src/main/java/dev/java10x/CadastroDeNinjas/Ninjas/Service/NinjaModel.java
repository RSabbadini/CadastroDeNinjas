package dev.java10x.CadastroDeNinjas.Ninjas.Service;
import dev.java10x.CadastroDeNinjas.Missoes.Service.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// JPA = Java Persistence API
// ⬇️ Transforma a classe em uma entidade do db
@Entity
@Table(name= "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    //Um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missões_id") //chave estrangeira
    private MissoesModel missoes;
}
