package com.exercicio.carros.repository;

import com.exercicio.carros.model.CarrosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrosRepository extends JpaRepository <CarrosModel, Long> {
}
