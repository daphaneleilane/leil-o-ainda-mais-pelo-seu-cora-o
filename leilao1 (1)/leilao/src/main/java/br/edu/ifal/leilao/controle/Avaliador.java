package br.edu.ifal.leilao.controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.edu.ifal.leilao.modelo.Lance;
import br.edu.ifal.leilao.modelo.Leilao;

public class Avaliador {
	
	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	private List<Lance> top3MaioresLances;
	
	public void avalia(Leilao leilao) {
		for (Lance lance: leilao.getLances()) {
			if(lance.getValor()> maiorDeTodos) {
				maiorDeTodos = lance.getValor();
			}
			if(lance.getValor() < menorDeTodos) {
				menorDeTodos = lance.getValor();
			}
		}
	
		
	}
	
	public void setTop3Lances(Leilao leilao) {
		top3MaioresLances = new ArrayList<Lance>(leilao.getLances());
		Collections.sort(top3MaioresLances, new Comparator<Lance>() {
			public int compare(Lance o1, Lance o2) {
				if(o1.getValor() < o2.getValor()) return 1;
				if(o1.getValor() > o2.getValor()) return -1;
				return 0;
			}
		});
		top3MaioresLances = top3MaioresLances.subList(0, 3);
	}
	
	public double getMaiorLance() {
		return maiorDeTodos;
	}
	
	public List<Lance> getTop3Lances(){
		return top3MaioresLances;
	}
	
	public double getMenorLance() {
		return menorDeTodos;
	}

}
