package br.gov.sp.fatec.projetolab5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.service.SegurancaService;
import br.gov.sp.fatec.projetolab5.entity.Usuario;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuario")
public class UsuarioControler {

    @Autowired
    private SegurancaService segurancaService;

    @GetMapping
    public List<Usuario> todosUsuarios() {
        return segurancaService.todosUsuarios();
    }

    @GetMapping(value = "/{id}")
    public Usuario buscarPeloId(@PathVariable("id") Long id){
        return segurancaService.buscarUsuarioPorId(id);

    }

    
}
