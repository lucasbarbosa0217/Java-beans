package br.com.traveller.beans;

import java.util.Date;

public class Usuario {
	 private static int controleId; //Variável para criar ID autonumérica
	 private int id;
	 private String nome;
	 private Endereco endereco;
	 private Date dataDeNascimento;
	 private String cpf;
	 private String email;
	 
	public Usuario(String nome, Endereco endereco, Date dataDeNascimento, String cpf, String email) {
		super();
		this.id = controleId;
		this.nome = nome;
		this.endereco = endereco;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.email = email;
		controleId++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + 
				", endereco=" + endereco + ", dataDeNascimento="
				+ dataDeNascimento + ", cpf=" + cpf + ", email=" 
				+ email + "]";
	}

	public int getId() {
		return id;
	}
	 
	 
}
