package br.com.traveller.beans;

public class Endereco {
	private static int controleId; //Variável para criar ID autonumérica
	private int id;
	private Cidade cidade;
	private String bairro;
	private String rua;
	private String numero;
	private String complemento;

public Endereco(Cidade cidade, String bairro, 
		String rua, String numero, String complemento) {
	super();
	this.id = controleId;
	this.cidade = cidade;
	this.bairro = bairro;
	this.rua = rua;
	this.numero = numero;
	this.complemento = complemento;
	controleId++;
}

@Override
public String toString() {
	return "Endereco [id=" + id + ", cidade=" + cidade.getNome() + ","
			+ " bairro=" + bairro + ", rua=" + rua + ", numero=" + numero
			+ ", complemento=" + complemento + "]";
}

public Cidade getCidade() {
	return cidade;
}
public void setCidade(Cidade cidade) {
	this.cidade = cidade;
}
public int getId() {
	return id;
}

public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getRua() {
	return rua;
}
public void setRua(String rua) {
	this.rua = rua;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public String getComplemento() {
	return complemento;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}

}
