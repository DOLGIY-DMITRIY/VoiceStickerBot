package bot.background;

import bot.statemachine.actions.TestAction;
import bot.statemachine.states.General;
import bot.statemachine.states.State;
import bot.storage.VoiceStorage;
import com.pengrad.telegrambot.model.Update;

public class User {
    private long id;
    private String lastName;
    private String userName;
    private final int voiceAvailableCount = 5;
    private String password;

    private State state;

    private final VoiceStorage voiceStorage = new VoiceStorage();

    public User(Update update){
        this.id = update.message().chat().id();
        this.lastName = update.message().chat().firstName();
        this.userName = update.message().chat().lastName();
        this.userName = update.message().chat().username();
        state = new General(new TestAction(), update);
    }

    public long id(){
        return id;
    }

    public int voiceCount(){
        return voiceStorage.size();
    }


}
