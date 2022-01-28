package bot.statemachine.actions;

import bot.background.Voice;
import bot.storage.VoiceStorage;
import com.pengrad.telegrambot.model.Update;

public class SaveVoice implements Action{
    public SaveVoice(Update update, VoiceStorage voiceStorage){
        voiceStorage.add(new Voice(update));
        System.out.println("Save voice with file id : " + update.message().voice().fileId());
    }
}
