package br.org.generation.geracaoeco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name="tb_tema")
public class tema {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo descricao é Obrigatória")
	private String descricao;
	
	@NotBlank(message = "O atributo descricao é Obrigatória")
	private String tipo_assistencia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo_assistencia() {
		return tipo_assistencia;
	}

	public void setTipo_assistencia(String tipo_assistencia) {
		this.tipo_assistencia = tipo_assistencia;
	}
}
	
	
	