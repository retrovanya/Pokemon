package Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class XScissor extends PhysicalMove {
    public XScissor(){super(Type.BUG, 80, 100);}
    @Override
    public String describe() {
        return "режет противника ножницами";
    }

}
