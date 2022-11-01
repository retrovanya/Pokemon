
import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class Main {

    public static void main(String[] args) {

        Battle field = new Battle();
        field.addAlly(new Cleffa("cleffa", 3));
        field.addAlly(new Cobalion("cobalion", 3));
        field.addAlly(new Silvally("silvally", 3));
        field.addFoe(new Clefairy("clefairy", 1));
        field.addFoe(new Clefable("clefable", 1));
        field.addFoe(new Minior("minior", 1));
        field.go();

    }
}
