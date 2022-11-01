package Attacks;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast(){super(Type.FIGHTING, 120, 70);}
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.1).turns(1).stat(Stat.SPECIAL_DEFENSE, -1);
        effect.attack();
    }
    @Override
    protected String describe() {
        return "с вероятностью 10% атакует и понижает специальную защиту цели на 1 ступень";
    }
}
