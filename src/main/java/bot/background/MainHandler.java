package bot.background;

import bot.statemachine.StateMachine;
import bot.storage.UserStorage;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.request.SendMessage;

public class MainHandler {

    private final UserStorage storage = new UserStorage();
    StateMachine sm = new StateMachine();

    public BaseRequest execute(Update update){
        long userID = update.message().chat().id();
        String text = "test text";


        if(storage.get(userID) != null){
            if(storage.get(userID).canAllow(update)){

            }
        } else{
            storage.add(new User(update));
        }

        return message(userID, text);
    }

    private BaseRequest message(long chatID, String message){
        return new SendMessage(chatID, message);
    }
}
