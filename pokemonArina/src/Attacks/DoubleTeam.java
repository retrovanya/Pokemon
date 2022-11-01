package Attacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {


    protected int i =0;
    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
       pokemon.setMod(Stat.EVASION, 1);

    }

    @Override
    protected String describe() {
        return "повышает уклонение пользователя на 1 ступень";
    }

}
