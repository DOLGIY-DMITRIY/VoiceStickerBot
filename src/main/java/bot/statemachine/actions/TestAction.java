package bot.statemachine.actions;

import bot.UserStorage;
import com.pengrad.telegrambot.model.Update;

public class TestAction implements Action{
    @Override
    public void execute(Update update, UserStorage storage) {
        System.out.println("Test action was successfully");
    }
}
