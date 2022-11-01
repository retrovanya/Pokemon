package Attacks;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.2).turns(1).stat(Stat.SPECIAL_DEFENSE, -1);
        effect.attack();
    }
    @Override
    protected String describe() {
        return "с вероятностью 30% атакует и понижает специальную защиту цели на 1 ступень";
    }
}
