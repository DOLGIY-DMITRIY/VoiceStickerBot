package bot.statemachine.actions;

import bot.storage.UserStorage;
import com.pengrad.telegrambot.model.Update;

// Create User
// Create Voice
// Set Voice Name
// Delete Voice
//
public interface Action<O> {
    public O action(Update update);
}
