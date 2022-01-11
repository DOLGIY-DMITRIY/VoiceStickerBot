package bot.statemachine.actions;

import bot.Storage;
import bot.UserStorage;
import com.pengrad.telegrambot.model.Update;

public interface Action {
    public void execute(Update update, UserStorage storage);
}
