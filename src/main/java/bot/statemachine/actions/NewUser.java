package bot.statemachine.actions;

import bot.background.User;
import bot.storage.UserStorage;
import com.pengrad.telegrambot.model.Update;

public class NewUser implements Action{

    @Override
    public void execute(Update update, UserStorage storage) {
        storage.add(new User(update));
    }
}
