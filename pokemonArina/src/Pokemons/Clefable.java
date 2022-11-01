package Pokemons;

import Attacks.DoubleTeam;
import Attacks.FireBlast;
import Attacks.MoonBlast;
import Attacks.ShadowBall;
import ru.ifmo.se.pokemon.Type;

public class Clefable extends Clefairy {
    public Clefable(String name, int level) {
        super(name, level);
        setStats(95, 70, 73, 95, 90, 60);
        setType(Type.FAIRY);
        setMove(new DoubleTeam(), new FireBlast(), new MoonBlast(), new ShadowBall());
    }
}
