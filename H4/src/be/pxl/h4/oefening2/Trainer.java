package be.pxl.h4.oefening2;

public class Trainer {
    private String naam;
    private Pokedex pokedex;

    public Trainer(String naam) {
        this.naam = naam;
        this.pokedex = new Pokedex(10);
    }

    public String getNaam() {
        return naam;
    }

    public Pokedex getPokedex() {
        return pokedex;
    }

    public void vangPokemon(Pokemon pokemon) {
        if (!pokedex.bevat(pokemon)) {
            pokedex.voegToe(pokemon);
        }
    }

    @Override
    public String toString() {
        return naam;
    }
}