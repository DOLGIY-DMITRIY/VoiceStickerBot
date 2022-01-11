package bot.statemachine.states;

import bot.statemachine.actions.Action;
import com.pengrad.telegrambot.model.Update;

public class AwaitVoiceName extends State{

    public AwaitVoiceName(Action action, Update update) {
        super(action, update);
    }

    @Override
    public State transition(Action action, Update update) {
        return null;
    }
}
