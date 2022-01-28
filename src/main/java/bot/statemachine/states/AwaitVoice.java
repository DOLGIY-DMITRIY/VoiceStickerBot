package bot.statemachine.states;

import bot.statemachine.actions.SaveVoice;
import bot.statemachine.allowers.SetVoiceName;

public class AwaitVoice extends State{
    public AwaitVoice() {
        super(new SetVoiceName());
    }
}
