package com.uverwolf.pokedex;

public abstract class PokemonAbstract implements IPokemonInterface {

	@Override
	public Pokemon createPokemon(String nombre, int salud, String tipo) {		
		return new Pokemon(nombre,salud,tipo);
	}

	@Override
	public String pokemonInfo(Pokemon pokemon) {

	
		return pokemon.nombre;
	}


}
