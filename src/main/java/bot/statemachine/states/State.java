package bot.statemachine.states;

import bot.statemachine.actions.Action;

abstract public class State<I> {
    private Action action;
    private I lastInput;

    public State(Action action, I lastInput){
        this.action = action;
        this.lastInput = lastInput;
    }


}
