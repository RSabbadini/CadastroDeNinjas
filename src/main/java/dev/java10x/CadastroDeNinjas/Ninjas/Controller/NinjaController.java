package dev.java10x.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nesta rota";
    }

    // Adicionar Ninja (Creat)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criada com sucesso";
    }

    //Mostrar todos os Ninjas (Read)
    @GetMapping("/todos")
    public String mostrarNinja(){
        return "Ninja Mostrado com sucesso";
    }

    //Mostrar Ninja por ID (Read)
    @GetMapping("/todosID")
    public String mostrarNinjaPorID(){
        return "Ninja Mostrado com sucesso";
    }

    //Alterar dados dos Ninjas (Update)
    @PutMapping("/alterarID")
    public String alterarNinjaporID(){
        return "Ninja Alterado com sucesso";
    }

    //Deletar Ninja (Delete)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Ninja Deletado com sucesso";
    }

}
