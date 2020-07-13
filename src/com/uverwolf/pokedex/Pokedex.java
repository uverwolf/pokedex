package com.uverwolf.pokedex;
import java.util.ArrayList;
import java.util.Iterator;
public class Pokedex extends PokemonAbstract implements Iterable<Pokemon> {
	 static int myPokemon;
	 ArrayList<Pokemon> pokedexs = new ArrayList<Pokemon>();
		public void agregar(Pokemon pkm) {
			pokedexs.add(pkm);
			myPokemon++;
		}
	@Override
	public void listaPokemon() {
		// TODO Auto-generated method stub
		System.out.println("Existen :"+myPokemon+" pokemon en la pokedex");
		for(Pokemon o :pokedexs) {
			System.out.println("-"+o.getNombre());
		}
	}





	@Override
	public Iterator<Pokemon> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
