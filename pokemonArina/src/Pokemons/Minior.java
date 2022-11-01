package Pokemons;
import Attacks.*;
import ru.ifmo.se.pokemon.Pokemon;

import ru.ifmo.se.pokemon.Type;
public class Minior extends Silvally {
    public Minior(String name, int level) {
        super(name, level);
        setType(Type.ROCK, Type.FLYING);
        setStats(60, 60, 100, 60, 100, 60);
        setMove(new XScissor(), new DragonClaw(), new IronHead(), new Snarl());
    }
}
