package bot.statemachine.allowers;

import com.pengrad.telegrambot.model.Update;

public interface Allower {

    public boolean canAllow(Update update);
}
