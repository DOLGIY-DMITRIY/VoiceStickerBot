package bot.statemachine.actions;

import bot.Storage;
import bot.User;
import bot.UserStorage;
import com.pengrad.telegrambot.model.Update;

public class NewUser implements Action{

    @Override
    public void execute(Update update, UserStorage storage) {
        storage.add(new User(
                update.message().chat().id(),
                update.message().chat().firstName(),
                update.message().chat().lastName(),
                update.message().chat().username()
        ));

    }
}
