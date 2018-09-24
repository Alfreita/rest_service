package br.com.alura.loja.modelo;

/**
 * Copyright (c) 2018 <strong>Pad<font color='orange'>tec</font></strong>
 *
 * @author tc.vfreitas / 24 de set de 2018
 * @version 1.0
 * @since 1.0
 */
public class Projeto {
  private String nome;
  private long id;
  private int anoDeInicio;


  public Projeto(String nome, long id, int anoDeInicio) {
    super();
    this.nome = nome;
    this.id = id;
    this.anoDeInicio = anoDeInicio;
  }



}
