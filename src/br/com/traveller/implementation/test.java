package br.com.traveller.implementation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import br.com.traveller.beans.*;

public class test {


	public static void main(String[] args) {
		
		ArrayList<String> fotosSaoPaulo = new ArrayList();
		fotosSaoPaulo.add("https://viagemeturismo.abril.com.br/wp-content/uploads/2017/12/istock-842960000.jpg");
		fotosSaoPaulo.add("https://www.flytap.com/-/media/Flytap/new-tap-pages/destinations/south-america/brazil/sao-paulo/sao-paulo-banner-mobile-1024x553.jpg");
		
		Cidade saoPaulo = new Cidade(
				"S�o Paulo", 
				12330000,
				"S�o Paulo, centro financeiro do Brasil, est� entre as cidades mais populosas do mundo, com diversas institui��es culturais e uma rica tradi��o arquitet�nica. H� pr�dios simb�licos como a catedral neog�tica, o Edif�cio Martinelli, um arranha-c�u inaugurado em 1929, e o Edif�cio Copan, com suas linhas curvas projetadas pelo arquiteto modernista Oscar Niemeyer. A igreja em estilo colonial do P�tio do Col�gio marca o local onde os padres jesu�tas fundaram a cidade em 155",
				fotosSaoPaulo
				);
		System.out.println(saoPaulo.toString());
		
		Endereco enderecoFulano = new Endereco(
				saoPaulo,
				"Bairro",
				"Rua",
				"001",
				"Casa 1"
				);
		System.out.println(enderecoFulano.toString());

		
		Usuario fulano = new Usuario(
				"Fulano",
				enderecoFulano,
				new Date(2000, 01, 31),
				"00000000001",
				"email@fulano.com"
				);
		System.out.println(fulano.toString());

		
		PontoTuristico becoDoBatman = new PontoTuristico(
				"Beco do Batman", 
				"Atra��o Tur�stica", 
				"24 Horas", 
				new Endereco(saoPaulo, "Jardim das Badeiras", "Rua Madeiros de Albuquerque", "85-154", null)
				);
		

		
		
		Avaliacao avaliacao = new Avaliacao(
				"Texto da avaliacao Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vitae risus ac ipsum scelerisque vestibulum. Vivamus molestie lacinia neque, ut feugiat libero tincidunt nec. ",
				5.0,
				fulano,
				becoDoBatman
				);
		
		Avaliacao avaliacao2 = new Avaliacao(
				"Texto da avaliacao Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vitae risus ac ipsum scelerisque vestibulum. Vivamus molestie lacinia neque, ut feugiat libero tincidunt nec. ",
				3.0,
				fulano,
				becoDoBatman
				);
		
		System.out.println(avaliacao2.toString());
		
		ArrayList<Avaliacao> listaAvaliacoes = new ArrayList<>();
		listaAvaliacoes.add(avaliacao);
		listaAvaliacoes.add(avaliacao2);
		becoDoBatman.setListaAvaliacoes(listaAvaliacoes);
		becoDoBatman.InsertAvaliacao(avaliacao2);
		System.out.println(becoDoBatman.toString());

		System.out.println("M�dia das Avalia��es: "+becoDoBatman.ObterMediaNotas());
		
		
		
	
		
		
		
	
		
	
	}

}
