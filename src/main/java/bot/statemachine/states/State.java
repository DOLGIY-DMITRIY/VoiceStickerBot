package bot.statemachine.states;

import bot.storage.UserStorage;
import bot.statemachine.actions.Action;
import com.pengrad.telegrambot.model.Update;

abstract public class State {
    protected Action action;
    protected Update update;

    State(Action action, Update update) {
        this.action = action;
        this.update = update;
    }

    public void action(UserStorage storage) {
        action.execute(update, storage);
    }

    abstract public State transition(Action action, Update update);


}
