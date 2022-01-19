package bot.statemachine.allowers;

import com.pengrad.telegrambot.model.Update;

public class CreateUser implements Allower{
    @Override
    public boolean canAllow(Update update) {
        return update.message().text().equals("/start");
    }
}
