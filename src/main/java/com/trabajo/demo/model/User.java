package com.trabajo.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Access(AccessType.FIELD)

public class User extends ParentEntity {

	private static final long serialVersionUID = -4300006180693755284L;

	
	@Column(name = "primer_nombre",nullable = false, length=255)
	private String primernombre;
	
	@Column(name = "segundo_nombre",nullable = true, length=255)
	private String segundonombre;
	
	@Column(name = "primer_apellido",nullable = false, length=255)
	private String primerapellido;
	
	@Column(name = "segundo_apellido",nullable = true, length=255)
	private String segundoapellido;
	
	@Column(name = "celular",nullable = true, length=30)
	private String celular;
	
	@Column(name = "direccion",nullable = false, length=150)
	private String direccion;
	
	public String getPrimernombre() {
		
		return primernombre;
	}
	public void setPrimernombre(String primernombre) {
		this.primernombre = primernombre;
	}
	public String getSegundonombre() {
		return segundonombre;
	}
	public void setSegundonombre(String segundonombre) {
		this.segundonombre = segundonombre;
	}
	public String getPrimerapellido() {
		return primerapellido;
	}
	public void setPrimerapellido(String primerapellido) {
		this.primerapellido = primerapellido;
	}
	public String getSegundoapellido() {
		return segundoapellido;
	}
	public void setSegundoapellido(String segundoapellido) {
		this.segundoapellido = segundoapellido;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
