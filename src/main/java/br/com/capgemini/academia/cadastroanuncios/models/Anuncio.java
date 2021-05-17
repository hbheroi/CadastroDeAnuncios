package br.com.capgemini.academia.cadastroanuncios.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Anuncio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;

	private String nomeAnuncio;
	private String nomeCliente;
	private String dataInicio;
	private String dataTermino;
	private double valorInvestido;
	private double valorTotalInvestido;
	private double quantCliques;
	private double quantCompartilhamento;
	private double quantVisualizacoes;
	private int quantDias;
	private double quantMaxVisualizacoes;
	private double quantMaxCliques;
	private double quantMaxCompartilhamento;
	
	public double getQuantMaxCompartilhamento() {
		return quantMaxCompartilhamento;
	}

	public void setQuantMaxCompartilhamento(double quantMaxCompartilhamento) {
		this.quantMaxCompartilhamento = quantMaxCompartilhamento;
	}

	public double getQuantMaxCliques() {
		return quantMaxCliques;
	}

	public void setQuantMaxCliques(double quantMaxCliques) {
		this.quantMaxCliques = quantMaxCliques;
	}

	public double getQuantMaxVisualizacoes() {
		return quantMaxVisualizacoes;
	}

	public void setQuantMaxVisualizacoes(double quantMaxVisualizacoes) {
		this.quantMaxVisualizacoes = quantMaxVisualizacoes;
	}

	public int getQuantDias() {
		return quantDias;
	}

	public void setQuantDias(int quantDias) {
		this.quantDias = quantDias;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public double getValorTotalInvestido() {
		return valorTotalInvestido;
	}

	public void setValorTotalInvestido(double valorTotalInvestido) {
		this.valorTotalInvestido = valorTotalInvestido;
	}

	public double getQuantCliques() {
		return quantCliques;
	}

	public void setQuantCliques(double quantCliques) {
		this.quantCliques = quantCliques;
	}

	public double getQuantCompartilhamento() {
		return quantCompartilhamento;
	}

	public void setQuantCompartilhamento(double quantCompartilhamento) {
		this.quantCompartilhamento = quantCompartilhamento;
	}

	public double getQuantVisualizacoes() {
		return quantVisualizacoes;
	}

	public void setQuantVisualizacoes(double quantVisualizacoes) {
		this.quantVisualizacoes = quantVisualizacoes;
	}

	public void setValorInvestido(double valorInvestido) {
		this.valorInvestido = valorInvestido;
	}

	public String getNomeAnuncio() {
		return nomeAnuncio;
	}

	public void setNomeAnuncio(String nomeAnuncio) {
		this.nomeAnuncio = nomeAnuncio;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	public double getValorInvestido() {
		return valorInvestido;
	}

	public void setValorInvestido(String valorInvestido) {
		this.valorInvestido = Double.parseDouble(valorInvestido.replaceAll(",", "."));
		;
	}

	public double calculaProjecao(double valor) {

		quantVisualizacoes = Math.floor(valor * 30);

		double viewsExtra = Math.floor(quantVisualizacoes);

		for (int i = 0; i < 3; i++) {

			quantCliques = Math.floor(viewsExtra * 0.12);
			quantCompartilhamento = Math.floor(quantCliques * 0.15);
			viewsExtra = quantCompartilhamento * 40;
			quantVisualizacoes = Math.floor(quantVisualizacoes + viewsExtra);
			setQuantMaxCliques(quantMaxCliques+quantCliques);
			setQuantMaxCompartilhamento(quantMaxCompartilhamento + quantCompartilhamento);
		}

		return quantVisualizacoes;
	}
	
	public void calculaValorTotalInvestido(double valor, int dias) {
		setValorTotalInvestido(valor*dias);
		
	}
	
	public void calculaQuantMaxVisualizacoes(int dias, double valor) {
		for(int i =0; i<dias; i++) {
			setQuantMaxVisualizacoes(quantMaxVisualizacoes= quantMaxVisualizacoes+calculaProjecao(valor));
		}
	}
	
	
}