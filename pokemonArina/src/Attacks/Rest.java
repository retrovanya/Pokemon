package Attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {super(Type.PSYCHIC, 0, 0);}
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(1).turns(2).stat(Stat.HP, 91);
        Effect.sleep(pokemon);
    }
    @Override
    protected String describe() {
        return "отдыхает и восстанавливает здщоровье";
    }
}
