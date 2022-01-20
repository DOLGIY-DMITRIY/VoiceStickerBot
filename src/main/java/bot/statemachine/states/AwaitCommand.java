package bot.statemachine.states;

import bot.statemachine.allowers.Allower;
import bot.statemachine.allowers.CreateUser;
import bot.statemachine.allowers.CreateVoice;

public class AwaitCommand extends State{

    public AwaitCommand(CreateVoice createVoice) {
        super(createVoice);
    }
}
