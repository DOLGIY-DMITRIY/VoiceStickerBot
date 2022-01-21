package bot.background;

import bot.statemachine.states.State;
import bot.storage.UserStorage;
import bot.storage.VoiceStorage;
import com.pengrad.telegrambot.model.Update;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String userName;
    private final int voiceAvailableCount = 5;

    private String password; //TODO

    private State state;

    private final VoiceStorage voiceStorage = new VoiceStorage();

    public User(Update update){
        this.id = update.message().chat().id();
        this.firstName = update.message().chat().firstName();
        this.lastName = update.message().chat().lastName();
        this.userName = update.message().chat().username();
    }

    public long id(){
        return id;
    }

    public boolean canAllow(Update update){
        return state.canApply(update);
    }

    public int voiceCount(){
        return voiceStorage.size();
    }

    public String info(){
        return "User Name :" + userName + "; First Name : " + firstName + "; Last Name : " + lastName;
    }



}
