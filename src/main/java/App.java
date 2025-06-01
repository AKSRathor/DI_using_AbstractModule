

import com.google.inject.Guice;
import com.google.inject.Injector;

import ConnectorFolder.Impl.ConnectorImpl;
import Modules.MainModule;


public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MainModule());

        ConnectorImpl connector = injector.getInstance(ConnectorImpl.class);
        connector.connect();
    }
}
