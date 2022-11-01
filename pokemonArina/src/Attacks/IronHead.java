package Attacks;

import ru.ifmo.se.pokemon.*;

public class IronHead extends PhysicalMove {
    public IronHead(){super(Type.STEEL, 80, 100);}
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3) Effect.flinch(p);

    }
    @Override
    protected String describe(){
        return "имеет 30% вероятность заставить цель дрогнуть";
    }
}
