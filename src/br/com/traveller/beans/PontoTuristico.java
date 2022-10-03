package br.com.traveller.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class PontoTuristico {
private static int controleId; //Variável para criar ID autonumérica
private int id;
private String nome;
private String tipo;
private ArrayList<Avaliacao> listaAvaliacoes;
private String horaFuncionamento;
private Endereco endereco;

public PontoTuristico(String nome, String tipo, String horaFuncionamento, Endereco endereco) {
	super();
	this.id = controleId;
	this.nome = nome;
	this.tipo = tipo;
	this.horaFuncionamento = horaFuncionamento;
	this.endereco = endereco;
	controleId++;
}

public int getId() {
	return id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getHoraFuncionamento() {
	return horaFuncionamento;
}
public void setHoraFuncionamento(String horaFuncionamento) {
	this.horaFuncionamento = horaFuncionamento;
}
public Endereco getEndereco() {
	return endereco;
}
public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}

public ArrayList<Avaliacao> getListaAvaliacoes() {
	return listaAvaliacoes;
}
public void setListaAvaliacoes(ArrayList<Avaliacao> listaAvaliacoes) {
	this.listaAvaliacoes = listaAvaliacoes;
}



public double ObterMediaNotas() {
	double notas = 0;
	for (Avaliacao avaliacao : this.listaAvaliacoes) {
		notas += avaliacao.getNota(); 
	}
	notas = notas/this.listaAvaliacoes.size();
	return notas;
}


public void InsertAvaliacao(Avaliacao avaliacao) {
	this.listaAvaliacoes.add(avaliacao);
}


@Override
public String toString() {
	return "PontoTuristico [id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", mediaAvaliacoes=" + this.ObterMediaNotas()
			+ ", horaFuncionamento=" + horaFuncionamento + ", endereco=" + endereco + "]";
}

}
