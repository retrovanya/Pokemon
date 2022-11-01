package Pokemons;

import Attacks.DoubleTeam;
import Attacks.FireBlast;
import Attacks.MoonBlast;
import Attacks.ShadowBall;
import ru.ifmo.se.pokemon.Type;

public class Clefairy extends Cleffa {
    public Clefairy(String name, int level) {
        super(name, level);
        setStats(70, 45, 48, 60, 65, 35);
        setType(Type.FAIRY);
        setMove(new DoubleTeam(), new FireBlast(), new MoonBlast());
    }

}
