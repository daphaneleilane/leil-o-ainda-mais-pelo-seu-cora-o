package br.edu.ifal.leilao.controle;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.edu.ifal.leilao.modelo.Lance;
import br.edu.ifal.leilao.modelo.Leilao;
import br.edu.ifal.leilao.modelo.Usuario;



public class AvaliadorTest {

@Test
public void avaliadorDeveFuncionarComLancesEmOrdemAleatoria() {
	Usuario usuario1 = new Usuario("Ana");
	Usuario usuario2 = new Usuario("Zé");
	Usuario usuario3 = new Usuario("Maria");
	
	Leilao leilao = new Leilao();
	leilao.propoe(new Lance(usuario1, 300));
	leilao.propoe(new Lance(usuario2, 400));
	leilao.propoe(new Lance(usuario3, 250));
	
	Avaliador  avaliador = new Avaliador();
	
	avaliador.avalia(leilao);
	double maiorLanceObtido = avaliador.getMaiorLance();
	double maiorLanceEsperado = 400;
	
	double menorLanceObtido = avaliador.getMenorLance();
	double menorLanceEsperado = 250;

	
	
	assertEquals(maiorLanceEsperado, maiorLanceObtido, 0.001);
	assertEquals(menorLanceEsperado, menorLanceObtido, 0.001);
	
}
@Test
public void avaliadorDeveFuncionarComLancesEmOrdemCrescente() {
	Usuario usuario1 = new Usuario("Beatriz");
	Usuario usuario2 = new Usuario("Romario");
	Usuario usuario3 = new Usuario("Ziraldo");
	
	Leilao leilao = new Leilao();
	leilao.propoe(new Lance(usuario1, 250));
	leilao.propoe(new Lance(usuario2, 300));
	leilao.propoe(new Lance(usuario3, 400));
	
	Avaliador  avaliador = new Avaliador();
	
	avaliador.avalia(leilao);
	double maiorLanceObtido = avaliador.getMaiorLance();
	double maiorLanceEsperado = 400;
	
	double menorLanceObtido = avaliador.getMenorLance();
	double menorLanceEsperado = 250;

	
	
	assertEquals(maiorLanceEsperado, maiorLanceObtido, 0.001);
	assertEquals(menorLanceEsperado, menorLanceObtido, 0.001);
}

@Test
public void avaliadorDeveFuncionarComLancesEmOrdemDecrescente() {
	Usuario usuario1 = new Usuario("Beatriz");
	Usuario usuario2 = new Usuario("Romario");
	Usuario usuario3 = new Usuario("Ziraldo");
	
	Leilao leilao = new Leilao();
	leilao.propoe(new Lance(usuario1, 400));
	leilao.propoe(new Lance(usuario2, 300));
	leilao.propoe(new Lance(usuario3, 250));
	
	Avaliador  avaliador = new Avaliador();
	
	avaliador.avalia(leilao);
	double maiorLanceObtido = avaliador.getMaiorLance();
	double maiorLanceEsperado = 400;
	
	double menorLanceObtido = avaliador.getMenorLance();
	double menorLanceEsperado = 250;

	
	
	assertEquals(maiorLanceEsperado, maiorLanceObtido, 0.001);
	assertEquals(menorLanceEsperado, menorLanceObtido, 0.001);
}
@Test
public void top3DeveFuncionarCom3LancesAleatorios() {
	Usuario usuario1 = new Usuario("Beatriz");
	Usuario usuario2 = new Usuario("Romario");
	Usuario usuario3 = new Usuario("Ziraldo");
	
	Leilao leilao = new Leilao();
	leilao.propoe(new Lance(usuario1, 400));
	leilao.propoe(new Lance(usuario2, 300));
	leilao.propoe(new Lance(usuario3, 250));
	
	Avaliador  avaliador = new Avaliador();
	
	avaliador.setTop3Lances(leilao);
	List<Lance> top3 = avaliador.getTop3Lances();
	double primeiroLanceObtido = top3.get(0).getValor();
	double segundoLanceObtido = top3.get(1).getValor();
	double terceiroLanceObtido = top3.get(2).getValor();
	int tamanhoTop3Obtido = top3.size();
	
	double primeiroLanceEsperado = 400;
	double segundoLanceEsperado = 300;
	double terceiroLanceEsperado = 250;
	int tamanhoTop3Esperado = 3;
	
	assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0.1);
	assertEquals(segundoLanceEsperado, segundoLanceObtido, 0.1);
	assertEquals(terceiroLanceEsperado, terceiroLanceObtido, 0.1);
	assertEquals(tamanhoTop3Esperado, tamanhoTop3Obtido, 0.1);
}

@Test
public void top3DeveFuncionarCom3LancesEmOrdemDecrescente() {
	Usuario usuario1 = new Usuario("Beatriz");
	Usuario usuario2 = new Usuario("Romario");
	Usuario usuario3 = new Usuario("Ziraldo");
	
	Leilao leilao = new Leilao();
	leilao.propoe(new Lance(usuario1, 400));
	leilao.propoe(new Lance(usuario2, 300));
	leilao.propoe(new Lance(usuario3, 250));
	
	Avaliador  avaliador = new Avaliador();
	
	avaliador.setTop3Lances(leilao);
	List<Lance> top3 = avaliador.getTop3Lances();
	double primeiroLanceObtido = top3.get(0).getValor();
	double segundoLanceObtido = top3.get(1).getValor();
	double terceiroLanceObtido = top3.get(2).getValor();
	int tamanhoTop3Obtido = top3.size();
	
	double primeiroLanceEsperado = 400;
	double segundoLanceEsperado = 300;
	double terceiroLanceEsperado = 250;
	int tamanhoTop3Esperado = 3;
	
	assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0.1);
	assertEquals(segundoLanceEsperado, segundoLanceObtido, 0.1);
	assertEquals(terceiroLanceEsperado, terceiroLanceObtido, 0.1);
	assertEquals(tamanhoTop3Esperado, tamanhoTop3Obtido, 0.1);
}

@Test
public void top3DeveFuncionarCom3LancesEmOrdemCrescente() {
	Usuario usuario1 = new Usuario("Beatriz");
	Usuario usuario2 = new Usuario("Romario");
	Usuario usuario3 = new Usuario("Ziraldo");
	
	Leilao leilao = new Leilao();
	leilao.propoe(new Lance(usuario1, 250));
	leilao.propoe(new Lance(usuario2, 300));
	leilao.propoe(new Lance(usuario3, 400));
	
	Avaliador  avaliador = new Avaliador();
	
	avaliador.setTop3Lances(leilao);
	List<Lance> top3 = avaliador.getTop3Lances();
	double primeiroLanceObtido = top3.get(0).getValor();
	double segundoLanceObtido = top3.get(1).getValor();
	double terceiroLanceObtido = top3.get(2).getValor();
	int tamanhoTop3Obtido = top3.size();
	
	double primeiroLanceEsperado = 400;
	double segundoLanceEsperado = 300;
	double terceiroLanceEsperado = 250;
	int tamanhoTop3Esperado = 3;
	
	assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0.1);
	assertEquals(segundoLanceEsperado, segundoLanceObtido, 0.1);
	assertEquals(terceiroLanceEsperado, terceiroLanceObtido, 0.1);
	assertEquals(tamanhoTop3Esperado, tamanhoTop3Obtido, 0.1);
}

@Test
public void top3DeveFuncionarCom4Lances() {
	Usuario usuario1 = new Usuario("Beatriz");
	Usuario usuario2 = new Usuario("Romario");
	Usuario usuario3 = new Usuario("Ziraldo");
	Usuario usuario4 = new Usuario("Cacilda");
	
	Leilao leilao = new Leilao();
	leilao.propoe(new Lance(usuario1, 400));
	leilao.propoe(new Lance(usuario2, 300));
	leilao.propoe(new Lance(usuario3, 250));
	leilao.propoe(new Lance(usuario4, 500));
	
	Avaliador  avaliador = new Avaliador();
	
	avaliador.setTop3Lances(leilao);
	List<Lance> top3 = avaliador.getTop3Lances();
	double primeiroLanceObtido = top3.get(0).getValor();
	double segundoLanceObtido = top3.get(1).getValor();
	double terceiroLanceObtido = top3.get(2).getValor();
	int tamanhoTop3Obtido = top3.size();
	
	double primeiroLanceEsperado = 500;
	double segundoLanceEsperado = 400;
	double terceiroLanceEsperado = 300;
	int tamanhoTop3Esperado = 3;
	
	assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0.1);
	assertEquals(segundoLanceEsperado, segundoLanceObtido, 0.1);
	assertEquals(terceiroLanceEsperado, terceiroLanceObtido, 0.1);
	assertEquals(tamanhoTop3Esperado, tamanhoTop3Obtido, 0.1);
}

@Test
public void top3DeveFuncionarCom1Lance() {
	Usuario usuario1 = new Usuario("Beatriz");

	
	Leilao leilao = new Leilao();
	
	leilao.propoe(new Lance(usuario1, 250));
	
	Avaliador  avaliador = new Avaliador();
	
	avaliador.setTop3Lances(leilao);
	List<Lance> top3 = avaliador.getTop3Lances();
	double primeiroLanceObtido = top3.get(0).getValor();
	int tamanhoTop3Obtido = top3.size();
	
	double primeiroLanceEsperado = 250;
	
	int tamanhoTop3Esperado = 3;
	
	assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0.1);
	assertEquals(tamanhoTop3Esperado, tamanhoTop3Obtido, 0.1);
}

@Test
public void top3DeveFuncionarCom2Lances() {
	Usuario usuario1 = new Usuario("Beatriz");
	Usuario usuario2 = new Usuario("Romario");

	
	Leilao leilao = new Leilao();
	leilao.propoe(new Lance(usuario1, 250));
	leilao.propoe(new Lance(usuario2, 300));

	
	Avaliador  avaliador = new Avaliador();
	
	avaliador.setTop3Lances(leilao);
	List<Lance> top3 = avaliador.getTop3Lances();
	double primeiroLanceObtido = top3.get(0).getValor();
	double segundoLanceObtido = top3.get(1).getValor();
	int tamanhoTop3Obtido = top3.size();
	
	double primeiroLanceEsperado = 250;
	double segundoLanceEsperado = 300;

	int tamanhoTop3Esperado = 3;
	
	assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0.1);
	assertEquals(segundoLanceEsperado, segundoLanceObtido, 0.1);
	assertEquals(tamanhoTop3Esperado, tamanhoTop3Obtido, 0.1);
}

@Test
public void top3DeveFuncionarSemLances() {

	Leilao leilao = new Leilao();
	
	Avaliador  avaliador = new Avaliador();
	
	avaliador.setTop3Lances(leilao);
	List<Lance> top3 = avaliador.getTop3Lances();
	int tamanhoTop3Obtido = top3.size();

	int tamanhoTop3Esperado = 3;
	
	assertEquals(tamanhoTop3Esperado, tamanhoTop3Obtido, 0.1);
}

@Test
public void top3DeveFuncionarCom3LancesIguais() {
	Usuario usuario1 = new Usuario("Beatriz");
	Usuario usuario2 = new Usuario("Romario");
	Usuario usuario3 = new Usuario("Ziraldo");
	
	Leilao leilao = new Leilao();
	leilao.propoe(new Lance(usuario1, 250));
	leilao.propoe(new Lance(usuario2, 250));
	leilao.propoe(new Lance(usuario3, 250));
	
	Avaliador  avaliador = new Avaliador();
	
	avaliador.setTop3Lances(leilao);
	List<Lance> top3 = avaliador.getTop3Lances();
	double primeiroLanceObtido = top3.get(0).getValor();
	double segundoLanceObtido = top3.get(1).getValor();
	double terceiroLanceObtido = top3.get(2).getValor();
	int tamanhoTop3Obtido = top3.size();
	
	double primeiroLanceEsperado = 250;
	double segundoLanceEsperado = 250;
	double terceiroLanceEsperado = 250;
	int tamanhoTop3Esperado = 3;
	
	assertEquals(primeiroLanceEsperado, primeiroLanceObtido, 0.1);
	assertEquals(segundoLanceEsperado, segundoLanceObtido, 0.1);
	assertEquals(terceiroLanceEsperado, terceiroLanceObtido, 0.1);
	assertEquals(tamanhoTop3Esperado, tamanhoTop3Obtido, 0.1);
}




}
