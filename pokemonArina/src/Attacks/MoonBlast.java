package Attacks;

import ru.ifmo.se.pokemon.*;

public class MoonBlast extends SpecialMove {
    public MoonBlast() {
        super(Type.FAIRY, 95, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.3).turns(1).stat(Stat.SPECIAL_ATTACK, -1);
        effect.attack();
    }
    @Override
    protected String describe() {
        return "с вероятностью 20% атакует и понижает специальную атаку цели на 1 ступень";
    }

}
