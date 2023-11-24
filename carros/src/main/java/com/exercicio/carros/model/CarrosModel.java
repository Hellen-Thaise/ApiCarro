package com.exercicio.carros.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_CARROS")
@Getter //get utilizando lombok
@Setter //set utilizando lombok
@AllArgsConstructor //construtor utilizando lombok
@NoArgsConstructor //contrutor sem argumentos utilizando lombok

public class CarrosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera os ids de forma crescente
    private Long id;

    @Column(length = 50, nullable = false) //não deixa o nome ser nulo
    private String nome;

    @Column(length = 15, nullable = false) //não deixa a marca ser nula
    private String marca;

    @Column(length = 15, nullable = false) //não deixa o ano ser nulo
    private String ano;

    @Column(length = 15, nullable = false) //não deixa o valor ser nulo
    private Double valor;

    @Column(length = 15, nullable = false) //não deixa a cor ser nula
    private String cor;

    @Column(length = 15, nullable = false) //não deixa o numero de portas ser nulo
    private Integer numeroPortas;


}
