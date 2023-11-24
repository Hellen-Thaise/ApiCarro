package com.exercicio.carros.service;

import com.exercicio.carros.model.CarrosModel;
import com.exercicio.carros.repository.CarrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarrosService {
    @Autowired
    CarrosRepository carrosRepository;

    //método que busca todos os carros no banco

    public List<CarrosModel> buscarTodos(){
        return carrosRepository.findAll();
    }
    //método que busca um carro no banco pelo id
    public Optional<CarrosModel> buscarPorId(Long id){
        return carrosRepository.findById(id);
    }

    //método que cadastra um novo carro no banco
    public CarrosModel cadastrar(CarrosModel carrosModel){
        carrosModel.getId();
        carrosModel.getNome();
        carrosModel.getAno();
        carrosModel.getValor();
        carrosModel.getCor();
        carrosModel.getNumeroPortas();

        return carrosRepository.save(carrosModel); //salva as informações
    }
}
