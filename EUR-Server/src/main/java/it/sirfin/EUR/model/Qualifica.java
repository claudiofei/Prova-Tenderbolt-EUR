package it.sirfin.EUR.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Qualifica implements Serializable {

	@Id
	@GeneratedValue

	private Long id;

	@Column
	private String nome;

	@Column
	private Double stipendio;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Dipendente dipendente;

	public Qualifica() {
		super();
	}

	public Qualifica(String nome, Double stipendio, Dipendente dipendente) {
		super();
		this.nome = nome;
		this.stipendio = stipendio;
		this.dipendente = dipendente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getStipendio() {
		return stipendio;
	}

	public void setStipendio(Double stipendio) {
		this.stipendio = stipendio;
	}

	public Dipendente getDipendente() {
		return dipendente;
	}

	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}

	@Override
	public String toString() {
		return "Qualifica [id=" + id + ", nome=" + nome + ", stipendio=" + stipendio + ", dipendente=" + dipendente
				+ "]";
	}

}
