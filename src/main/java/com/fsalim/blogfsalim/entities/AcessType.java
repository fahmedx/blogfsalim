package com.fsalim.blogfsalim.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tipoacesso", schema="public")
public class AcessType {
	@Id
	@Column(name="id_tipoacesso")
	private Integer id;
	
	@Column(name="ds_tipoacesso")
	private String description;
	
	AcessType(){
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
