package bot.statemachine.allowers;

import com.pengrad.telegrambot.model.Update;

public class BackToAwait implements Allower{
    @Override
    public boolean canAllow(Update update) {
        return update.message().text() != null;
    }
}
