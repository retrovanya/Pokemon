package Attacks;

import ru.ifmo.se.pokemon.*;

public class Snarl extends SpecialMove {
    public Snarl() {super(Type.DARK, 55, 95);};
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(1).turns(1).stat(Stat.SPECIAL_ATTACK, -1);
        effect.attack();
    }
    @Override
    protected String describe() {
        return "с вероятностью 100% атакует и понижает специальную атаку цели на 1 ступень";
    }
}
