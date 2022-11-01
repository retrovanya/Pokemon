package Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class DragonClaw extends PhysicalMove {
    public DragonClaw(){super(Type.DRAGON, 80, 100);}
    @Override
    public String describe() {
        return "рубит врага острыми когтями";
    }
}
