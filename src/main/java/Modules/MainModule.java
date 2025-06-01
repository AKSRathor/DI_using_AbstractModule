package Modules;

import com.google.inject.AbstractModule;

import ConnectorFolder.ConnectorInterface;
import ConnectorFolder.Impl.ConnectorImpl;

public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        System.out.println("Configuring MainModule...");
        // Install submodule
        install(new SubModule());
        bind(ConnectorInterface.class).to(ConnectorImpl.class);
    }
}
