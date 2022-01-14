package bot.statemachine.actions;

import bot.storage.UserStorage;
import com.pengrad.telegrambot.model.Update;

public interface Action<O> {
    public O action(Update update);
}
