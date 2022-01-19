package bot;

import bot.background.MainHandler;
import bot.storage.Storage;
import bot.storage.UserStorage;
import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.BaseResponse;

public class Bot implements HttpFunction{
    private final String TELEGRAM_BOT_KEY = "5097621438:AAGFrbmxA5tHjgbwMmnAj-vLbBVCN1WiX3c";
    private final TelegramBot bot = new TelegramBot(TELEGRAM_BOT_KEY);
    private final MainHandler handler = new MainHandler();

    public void serve(){
        bot.setUpdatesListener(updates -> {
            // ... process updates
            // return id of last processed update or confirm them all
            updates.forEach(this::process);
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }

    private void process(Update update) {
        handler.execute(update);
    }




    @Override
    public void service(HttpRequest request, HttpResponse response) throws Exception {
        var writer = response.getWriter();
        writer.write("Hello developers!");
    }
}
