package main.design_patterns.singleton;

public class ConfigManager {
    private ConfigManager instance;

    public ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }
}
