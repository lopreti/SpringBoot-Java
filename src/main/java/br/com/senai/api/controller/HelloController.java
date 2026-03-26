package br.com.senai.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String olaMundo(){
        return "Olá, mundo!";
    }

    @GetMapping("hello")
    public String olaMundo(@RequestParam(value="nome", defaultValue = "mundo") String nome){
        return "Olá, "+ nome + "!";
    }

    @PostMapping
    public String olaPost(@RequestBody Pessoa pessoa){
        return pessoa.getNome();
    }
}
