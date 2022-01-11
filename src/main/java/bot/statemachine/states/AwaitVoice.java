package bot.statemachine.states;

import bot.statemachine.actions.Action;
import com.pengrad.telegrambot.model.Update;

public class AwaitVoice extends State{

    public AwaitVoice(Action action, Update update) {
        super(action, update);
    }

    @Override
    public State transition(Action action, Update update) {
        return new AwaitVoiceName(action, update);
    }


}
