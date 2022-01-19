package bot.background;

import bot.Bot;
import bot.storage.UserStorage;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.request.SendMessage;

public class MainHandler {

    private final UserStorage storage = new UserStorage();

    public BaseRequest execute(Update update){
        Message message = update.message();
        long userID = message.chat().id();
        String text = "";


        if(storage.get(userID) != null){
            System.out.println(message.toString());
            text = "I remember you!";
        } else{
            storage.add(new User(update));
            text = "Hi, " + message.chat().username();
        }

        return message(userID, text);
    }

    private BaseRequest message(long chatID, String message){
        return new SendMessage(chatID, message);
    }
}
