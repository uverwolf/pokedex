package com.uverwolf.pokedex;

public class TestPokemon {
	public static void main(String[] args) {
	
		
		Pokedex pokedex = new Pokedex();
		
		Pokemon raichu  =pokedex.createPokemon("Raichu", 100, "Electrico");
		Pokemon pikachu =pokedex.createPokemon("Pikachu", 500, "Electrico");
		pokedex.agregar(raichu);
		pokedex.agregar(pikachu);
		System.out.println(raichu.getNombre());
		
		raichu.attack(pikachu);
		pokedex.listaPokemon();
		
	}
}
