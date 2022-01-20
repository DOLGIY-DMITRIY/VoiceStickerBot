package bot.statemachine.states;

import bot.statemachine.allowers.Allower;
import bot.storage.UserStorage;
import bot.statemachine.actions.Action;
import com.pengrad.telegrambot.model.Update;

abstract public class State {

    private final Allower allower;

    public State(Allower allower){
        this.allower = allower;
    }



    public boolean canApply(Update update){
        return allower.canAllow(update);
    }

}
