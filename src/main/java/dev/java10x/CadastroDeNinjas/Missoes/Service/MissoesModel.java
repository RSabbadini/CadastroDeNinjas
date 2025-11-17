package dev.java10x.CadastroDeNinjas.Missoes.Service;
import dev.java10x.CadastroDeNinjas.Ninjas.Service.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")

public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private char rankDaMissao;

    //Uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missões")
    private List<NinjaModel> ninjas;


}
