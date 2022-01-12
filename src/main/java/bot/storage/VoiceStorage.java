package bot.storage;

import bot.background.Voice;

import java.util.HashMap;
import java.util.Map;

public class VoiceStorage implements Storage<Voice> {
    private final Map<Long, Voice> voiceStorage = new HashMap<Long, Voice>();

    @Override
    public void add(Voice object) {
        voiceStorage.put(object.id(), object);
    }

    @Override
    public void delete(Voice object) {
        voiceStorage.remove(object.id());
    }

    @Override
    public Voice get(long id) {
        return voiceStorage.get(id);
    }

    public int size(){
        return voiceStorage.size();
    }
}
