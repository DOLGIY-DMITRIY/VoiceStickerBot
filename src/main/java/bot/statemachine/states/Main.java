package bot.statemachine.states;

import bot.statemachine.actions.Action;

public class Main extends State<NullPointerException>{

    public Main(Action action, NullPointerException lastInput) {
        super(action, lastInput);
    }
}
