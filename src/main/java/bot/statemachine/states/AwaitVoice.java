package bot.statemachine.states;

import bot.statemachine.allowers.SetVoiceName;

public class AwaitVoice extends State{
    public AwaitVoice(SetVoiceName setVoiceName) {
        super(setVoiceName);
    }
}
