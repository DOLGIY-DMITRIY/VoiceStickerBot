package bot.statemachine.states;

import bot.statemachine.actions.SaveVoice;
import bot.statemachine.allowers.CreateVoice;

public class AwaitCommand extends State{

    public AwaitCommand() {
        super(new CreateVoice());
    }
}
