package com.example.crudUsuarios.controller;

import java.util.List;

import com.example.crudUsuarios.model.Setores;
import com.example.crudUsuarios.repository.SetorRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/setores")
public class SetorController {

    @Autowired
    private SetorRepo setorRepo;

    @GetMapping
	public List<Setores> findAll(){
		return setorRepo.findAll();
	}

    @PostMapping
    public Setores save(@RequestBody Setores novoSetor){
        return setorRepo.save(novoSetor);
    }

    @PutMapping
    public Setores update(@RequestBody Setores setorAtualizar){
        return setorRepo.save(setorAtualizar);
    }

    @DeleteMapping
    public String delete(@RequestBody Setores setorDeletar){
        setorRepo.delete(setorDeletar);
        return "Setor deletado com sucesso!";
    }


}
