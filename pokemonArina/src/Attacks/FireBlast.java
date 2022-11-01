package Attacks;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast() {
       super(Type.FIRE, 110, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.1);
        effect.attack();
        Effect.burn(pokemon);
    }
    @Override
    protected String describe() {
        return "с вероятностью 10% атакует и поджигает цель";
    }
}
