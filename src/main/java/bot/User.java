package bot;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String userName;
    private final int voiceAvailableCount = 5;
    private int voiceCount = 0;
    private String password;

    private final VoiceStorage voiceStorage = new VoiceStorage();

    User(long ID, String firstName, String lastName, String userName){
        //TODO
    }

    public long id(){
        return id;
    }

}
