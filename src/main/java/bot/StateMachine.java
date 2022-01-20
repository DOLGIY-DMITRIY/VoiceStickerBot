package bot;

import bot.statemachine.allowers.BackToAwait;
import bot.statemachine.allowers.CreateVoice;
import bot.statemachine.allowers.SetVoiceName;
import bot.statemachine.states.AwaitCommand;
import bot.statemachine.states.AwaitVoice;
import bot.statemachine.states.AwaitVoiceName;
import bot.statemachine.states.State;

public class StateMachine {
    public State transition(AwaitCommand awaitCommand){
        return new AwaitVoice(new SetVoiceName());
    }

    public State transition(AwaitVoice awaitVoice){
        return new AwaitVoiceName(new BackToAwait());
    }

    public State transition(AwaitVoiceName awaitVoiceName){
        return new AwaitCommand(new CreateVoice());
    }
}
