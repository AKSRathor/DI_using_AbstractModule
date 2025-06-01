package Modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

import Config.Config;
import ConnectorFolder.IMpl.ConnectorImpl;

public class SubModule extends AbstractModule {

    @Override
    protected void configure() {
        System.out.println("Configuring SubModule...");
    }

    @Provides
    @Singleton
    public Config provideConfig() {
        return new Config("https://example.com");
    }
    
    @Provides
    @Singleton
    public ConnectorFolder.Impl.ConnectorImpl provideConnectorImpl(Config config) {
        System.out.println("Using Config inside provider: " + config.getUrl());
        return new ConnectorFolder.Impl.ConnectorImpl(); 
    }
}
