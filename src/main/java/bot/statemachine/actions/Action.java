package bot.statemachine.actions;

import bot.storage.UserStorage;
import com.pengrad.telegrambot.model.Update;

public interface Action {
    public void execute(Update update, UserStorage storage);
}
