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


  public Projeto() {
    super();
  }


  public Projeto(String nome, long id, int anoDeInicio) {
    super();
    this.nome = nome;
    this.id = id;
    this.anoDeInicio = anoDeInicio;
  }


  public String getNome() {
    return nome;
  }


  public void setNome(String nome) {
    this.nome = nome;
  }


  public long getId() {
    return id;
  }


  public void setId(long id) {
    this.id = id;
  }


  public int getAnoDeInicio() {
    return anoDeInicio;
  }


  public void setAnoDeInicio(int anoDeInicio) {
    this.anoDeInicio = anoDeInicio;
  }



}
