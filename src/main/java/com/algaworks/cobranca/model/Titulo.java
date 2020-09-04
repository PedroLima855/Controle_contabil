 package com.algaworks.cobranca.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Entity
public class Titulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private String nomeDoCulto;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@Enumerated(EnumType.STRING)
	private StatusTitulo status;
	
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal dizimos;
	
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal ofertas;
	
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal doacoes;
	
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal outros;
	
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal total;
	
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNomeDoCulto() {
		return nomeDoCulto;
	}
	public void setNomeDoCulto(String nomeDoCulto) {
		this.nomeDoCulto = nomeDoCulto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public StatusTitulo getStatus() {
		return status;
	}
	public void setStatus(StatusTitulo status) {
		this.status = status;
	}
	public BigDecimal getDizimos() {
		return dizimos;
	}
	public void setDizimos(BigDecimal dizimos) {
		this.dizimos = dizimos;
	}
	public BigDecimal getOfertas() {
		return ofertas;
	}
	public void setOfertas(BigDecimal ofertas) {
		this.ofertas = ofertas;
	}
	public BigDecimal getDoacoes() {
		return doacoes;
	}
	public void setDoacoes(BigDecimal doacoes) {
		this.doacoes = doacoes;
	}
	public BigDecimal getOutros() {
		return outros;
	}
	public void setOutros(BigDecimal outros) {
		this.outros = outros;
	}
	
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titulo other = (Titulo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
}
