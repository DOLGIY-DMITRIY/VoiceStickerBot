package bot;

import bot.statemachine.states.State;

public class User {
    private final long id;
    private String lastName;
    private String userName;
    private final int voiceAvailableCount = 5;
    private String password;

    private State state;

    private final VoiceStorage voiceStorage = new VoiceStorage();

    public User(long id, String firstName, String lastName, String userName){
        this.id = id;
        this.lastName = firstName;
        this.userName = lastName;
        this.userName = userName;
    }

    public long id(){
        return id;
    }

    public int voiceCount(){
        return voiceStorage.size();
    }


}
