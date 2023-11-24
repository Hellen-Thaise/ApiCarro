package com.exercicio.carros.controller;

import com.exercicio.carros.model.CarrosModel;
import com.exercicio.carros.service.CarrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class CarrosController {

    @Autowired
    CarrosService carroService;

    //Requisição GET - busca todos os carros no banco de dados
    @GetMapping(path = "/carros") //mapea o método get e como iremos acessar o método

    public List<CarrosModel> buscaTodosCarros(){
        return carroService.buscarTodos();
    }

    //pega uma lista e procura dentro dela uma informação

    @GetMapping(path = "/carros/{id}")
    public Optional<CarrosModel> buscarCarroPorId(@PathVariable Long id){
        return carroService.buscarPorId(id);
    }

    //Endpoints de INSERÇÃO

    //Requisição POST - insere algum dado dentro do banco

    @PostMapping(path = "/carros")
    @ResponseStatus(HttpStatus.CREATED)
    public CarrosModel cadastrarNovoCarro(@RequestBody CarrosModel carrosModel){ //colocamos o carrosModel como parametro para saber o que presiamos colocar no corpo da requisição
        return carroService.cadastrar(carrosModel);
    }

}
