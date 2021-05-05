package it.sirfin.EUR.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Dipendente implements Serializable {
	@Id
	@GeneratedValue

	private Long id;

	@Column
	private String nome;

	@Column
	private String cognome;

	@Column
	private LocalDate dataDiNascita;

	@Column
	private LocalDate dataAssunzione;

	@Column
	private Integer telefono;

	@Column
	private String email;

	@Column
	private String informazioniAggiuntive;

	@OneToMany(mappedBy = "dipendente")
	@JsonIgnoreProperties(value = "dipendente")
	private List<Qualifica> listaQualifiche;

	public Dipendente() {
		super();
	}

	public Dipendente(String nome, String cognome, LocalDate dataDiNascita, LocalDate dataAssunzione, Integer telefono,
			String email, String informazioniAggiuntive, List<Qualifica> listaQualifiche) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.dataAssunzione = dataAssunzione;
		this.telefono = telefono;
		this.email = email;
		this.informazioniAggiuntive = informazioniAggiuntive;
		this.listaQualifiche = listaQualifiche;
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public LocalDate getDataAssunzione() {
		return dataAssunzione;
	}

	public void setDataAssunzione(LocalDate dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInformazioniAggiuntive() {
		return informazioniAggiuntive;
	}

	public void setInformazioniAggiuntive(String informazioniAggiuntive) {
		this.informazioniAggiuntive = informazioniAggiuntive;
	}

	public List<Qualifica> getListaQualifiche() {
		if (listaQualifiche == null) {
			listaQualifiche = new ArrayList<>();
		}
		return listaQualifiche;
	}

	public void setListaQualifiche(List<Qualifica> listaQualifiche) {
		this.listaQualifiche = listaQualifiche;
	}

	@Override
	public String toString() {
		return "Dipendente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita
				+ ", dataAssunzione=" + dataAssunzione + ", telefono=" + telefono + ", email=" + email
				+ ", informazioniAggiuntive=" + informazioniAggiuntive + "]";
	}

}
