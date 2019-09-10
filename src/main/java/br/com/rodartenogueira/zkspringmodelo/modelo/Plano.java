package br.com.rodartenogueira.zkspringmodelo.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "planos")
public class Plano {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;

	@Column(name = "cnpb", length = 30, nullable = false)
	private String cnpb;

	@Column(name = "nome", length = 100, nullable = false)
	private String nome;

	@Column(name = "modalidade", length = 2, nullable = false)
	private String modalidade;

	@Column(name = "benef_risco", length = 30, nullable = false)
	private String benefRisco;

	@Column(name = "situacao", length = 10, nullable = false)
	private String situacao;

	@Column(name = "ano_criacao", length = 11, nullable = false)
	private int anoCriacao;

	@Column(name = "patrimonio_social", nullable = true)
	private double patrimonio;

	@Column(name = "patrimonio_cobertura", nullable = true)
	private double patrimonioCobertura;

	@Column(name = "resultado", nullable = true)
	private double resultado;

	@Column(name = "caracteristica", length = 12, nullable = false)
	private String caracteristica;

	@Column(name = "legislacao_aplicavel", length = 30, nullable = false)
	private String legislacaoAplicavel;

	@Column(name = "duration", nullable = true)
	private double duration;

	@Column(name = "tipo_duration", length = 5, nullable = true)
	private String tipoDuration;

	@Column(columnDefinition = "TEXT", name = "observacoes", nullable = true)
	private String observacoes;

	@Column(name = "usuario", length = 11, nullable = false)
	private String usuario;

	@Column(name = "data_criacao", nullable = false)
	private LocalDateTime DataCriacao;

}
