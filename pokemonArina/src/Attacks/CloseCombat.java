package Attacks;

import ru.ifmo.se.pokemon.*;

public class CloseCombat extends PhysicalMove {
    public CloseCombat(){super(Type.FIGHTING, 120, 100);}
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.DEFENSE,-1);
        pokemon.setMod(Stat.SPECIAL_DEFENSE,-1);
    }
    @Override
    protected String describe() {
        return "атакует врага, но снижает защиту и специальную защиту пользователя на 1 ступень";
    }
}
