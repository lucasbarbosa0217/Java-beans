package br.com.traveller.beans;

import java.util.ArrayList;

public class Cidade {
 private int populacao;
 private static int controleId; //Variável para criar ID autonumérica
 private int id;
 private String nome;
 private String descricao;
 private ArrayList<String> fotosUrl;
 
 public Cidade(String nome, int populacao, String descricao, ArrayList<String> fotosUrl) {
	super();
	this.id = controleId;
	this.nome = nome;
	this.populacao = populacao;
	this.descricao = descricao;
	this.fotosUrl = fotosUrl;
	controleId++;

}

@Override
public String toString() {
	return "Cidade [populacao=" + populacao + ", id=" + id + ", nome=" + nome + ", descricao=" + descricao
			+ ", fotosUrl=" + fotosUrl + "]";
}

public ArrayList<String> getFotosUrl() {
	return fotosUrl;
}

public void setFotosUrl(ArrayList<String> fotosUrl) {
	this.fotosUrl = fotosUrl;
}

public Cidade() {
	super();
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
public int getPopulacao() {
	return populacao;
}
public void setPopulacao(int populacao) {
	this.populacao = populacao;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}

}
