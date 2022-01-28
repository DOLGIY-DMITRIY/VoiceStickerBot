package bot.statemachine.states;

import bot.statemachine.allowers.BackToAwait;

public class AwaitVoiceName extends State{
    public AwaitVoiceName() {
        super(new BackToAwait());
    }
}
