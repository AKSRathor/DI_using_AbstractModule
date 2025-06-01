package ConnectorFolder.Impl;

import ConnectorFolder.ConnectorInterface;


public class ConnectorImpl implements ConnectorInterface {

    @Override
    public void connect() {
        System.out.println("Connected via ConnectorImpl!");
    }
}
