package Pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cobalion extends Pokemon {
    public Cobalion(String name, int level ) {
        super(name, level);
        setType(Type.ROCK, Type.FLYING);
        setStats(91, 90, 129, 90, 72, 108);
        setMove(new Rest(), new FocusBlast(), new CloseCombat(), new Swagger());
    }
}
