package bot.statemachine.allowers;

import com.pengrad.telegrambot.model.Update;

public class CreateVoice implements Allower{
    @Override
    public boolean canAllow(Update update) {
        return update.message().voice() != null;
    }
}
