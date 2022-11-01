package Pokemons;

import Attacks.DragonClaw;
import Attacks.IronHead;
import Attacks.Snarl;
import Attacks.XScissor;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Silvally extends Pokemon {
    public Silvally(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(95, 95,95,95,95,95);
        setMove(new XScissor(), new DragonClaw(), new IronHead());
    }

}
