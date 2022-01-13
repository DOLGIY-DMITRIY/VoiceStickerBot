package bot.background;

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


        if(storage.get(userID) != null){
            return new SendMessage(userID, "I remember you!");
        } else{
            storage.add(new User(update));
            System.out.println(storage.get(userID).id());
            System.out.println(storage.get(userID).info());
            return new SendMessage(userID, "Hi!");
        }

    }
}
