package com.fsalim.blogfsalim.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(schema="public",name="usuario")
public class User {

	@Id
	@Column(name="cd_usuario")
	private Integer id;
	
	@Column(name="ds_username")
	private String usermame;

	@Column(name="ds_email")
	private String email;
	
	@JsonIgnore
	@Column(name="ds_senha")
	private String password;
	
	@Temporal(jakarta.persistence.TemporalType.DATE)
	@Column(name="dt_cadastro")
	private Date singinDate;
	
	@ManyToOne
	@JoinColumn(name="fk_tipoacesso")
	private AcessType acessType;
	
	
	public User () {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getUsermame() {
		return usermame;
	}

	public void setUsermame(String usermame) {
		this.usermame = usermame;
	}

	public String getPassword() {
		return password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getSinginDate() {
		return singinDate;
	}

	public void setSinginDate(Date singinDate) {
		this.singinDate = singinDate;
	}
	
	public AcessType getAcessType() {
		return acessType;
	}

	public void setAcessType(AcessType acessType) {
		this.acessType = acessType;
	}

	
}


