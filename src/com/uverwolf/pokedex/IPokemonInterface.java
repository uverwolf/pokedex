package com.uverwolf.pokedex;

public interface IPokemonInterface {
	public abstract Pokemon createPokemon(String nombre,int salud, String tipo);
	public abstract String pokemonInfo(Pokemon pokemon);
	void listaPokemon();
	
}
