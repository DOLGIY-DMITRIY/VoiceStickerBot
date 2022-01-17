package bot.background;

import bot.Bot;
import bot.storage.UserStorage;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.request.SendMessage;

public class MainHandler {

    private final UserStorage storage = new UserStorage();
    private final Bot bot = new Bot();

    public BaseRequest execute(){
        Message message = update.message();
        long userID = message.chat().id();


        if(storage.get(userID) != null){
            System.out.println(message.toString());
            return new SendMessage(userID, "I remember you!");
        } else{
            storage.add(new User(update));
            return new SendMessage(userID, "Hi!");
        }
    }
}
