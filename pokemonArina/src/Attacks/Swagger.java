package Attacks;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){super(Type.NORMAL, 0, 85);}
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.flinch(p);
        p.setMod(Stat.ATTACK,2);
    }
    @Override
    protected String describe() {
        return "сбивает цель с толку и повышает ее атаку на две ступени";
    }
}
