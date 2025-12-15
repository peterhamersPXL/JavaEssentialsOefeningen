package be.pxl.h4.oefening2;

public class Pokedex {
    private Pokemon[] pokemons;

    public Pokedex(int size) {
        this.pokemons = new Pokemon[size];
    }

    public boolean bevat(Pokemon pokemon) {
        for (Pokemon p : pokemons) {
            if (p != null && p.equals(pokemon)) {
                return true;
            }
        }
        return false;
    }

    public void voegToe(Pokemon pokemon) {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] == null) {
                pokemons[i] = pokemon;
                return; // Stop after adding
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Pokemon p : pokemons) {
            if (p != null) {
                result.append(p.toString()).append("\n");
            }
        }
        return result.toString();
    }
}