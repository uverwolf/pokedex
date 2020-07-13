package com.uverwolf.pokedex;

public class Pokemon {
	protected String nombre;
	protected int salud;
	protected String tipo;
	protected static int contador;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Pokemon(String nombre, int salud, String tipo) {
		this.nombre = nombre;
		this.salud = salud;
		this.tipo = tipo;
		contador++;
	}
	public void attack(Pokemon objetivo) {
		objetivo.setSalud(objetivo.getSalud()-10);
		System.out.println(this.getNombre()+" Ataco a "+objetivo.nombre+" y le quito 10 puntos de salud");
	}
}
