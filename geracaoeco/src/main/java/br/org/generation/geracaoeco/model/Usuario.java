package br.org.generation.geracaoeco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = " O campo Nome é obrigatório.")
	private String nome;
	
	@NotBlank(message = "O campo Usuário é obrigatório.")
	@Email (message = "O atributo Usuário deve ser um email válido!")
	private String usuario;
	
	@NotBlank(message = "O campo Senha é obrigatório")
	@Size(min = 8, message = "A Senha deve ter no mínimo 8 caracteres")
	private String senha;
	
	@NotBlank(message = "O campo tipo usuário é obrigatório")
	private String tipo_usuario;
	
	private String foto;

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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	} 
}
