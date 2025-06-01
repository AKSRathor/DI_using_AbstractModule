package Modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

import Config.Config;
import ConnectorFolder.ConnectorInterface;
import ConnectorFolder.Impl.ConnectorImpl;

public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        System.out.println("Configuring MainModule...");
        // Install submodule
        install(new SubModule());
        System.out.println("Submodule installed");
        bind(ConnectorInterface.class).to(ConnectorImpl.class);
    }
    
    @Provides
    @Singleton
    public Config provideConfig() {
    	System.out.println("Inside the provideConfig");
        return new Config("https://example.com");
    }
}
