package bot.background;

import com.pengrad.telegrambot.model.Update;

public class Voice {
    private final String id;
    private final String uniqueId;
    private String name;

    public Voice(Update update){
        this.id = update.message().voice().fileId();
        this.uniqueId = update.message().voice().fileUniqueId();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String id(){
        return id;
    }


}
