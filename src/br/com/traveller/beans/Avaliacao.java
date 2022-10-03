package br.com.traveller.beans;

public class Avaliacao {

	private String avaliacaoTexto;
	private Double nota;
	 private static int controleId; //Variável para criar ID autonumérica
	 private int id;
	 private Usuario usuario;
	 private PontoTuristico pontoTuristico;
	
	public Avaliacao(String avaliacaoTexto, Double nota, Usuario usuario, PontoTuristico pontoTuristico) {
		super();
		this.avaliacaoTexto = avaliacaoTexto;
		this.nota = nota;
		this.pontoTuristico = pontoTuristico;
		this.usuario = usuario;
		this.id = controleId;
		controleId++;
	}
	
	@Override
	public String toString() {
		return "Avaliacao [avaliacaoTexto=" + avaliacaoTexto + ", nota=" + nota + ", id=" + id + ", usuario=" + usuario.getNome()
				+ ", pontoTuristico=" + pontoTuristico.getNome() + "]";
	}

	public int getId() {
		return id;
	}

	public String getAvaliacaoTexto() {
		return avaliacaoTexto;
	}
	public void setAvaliacaoTexto(String avaliacaoTexto) {
		this.avaliacaoTexto = avaliacaoTexto;
	}
	public Double getNota() {
		return nota;
	}
	
	public void setNota(Double nota) {
		this.nota = nota;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public PontoTuristico getPontoTuristico() {
		return pontoTuristico;
	}
}
