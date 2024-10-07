/*
* File: Network.java
* Author: Klíber Regő Benedek
* Copyright: 2024, Klíber Regő Benedek
* Group: Szoft II/I/N
* Date: 2024-09-30
* Github: https://github.com/Elydra5/
* Licenc: GNU GPL
*/

public class Network implements  Connectable {

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Sikeresen csatlakoztál az alábbi hálózathoz: " + networkName);
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Sikeresen lecsatlakoztál a hálózatról.");
    }

}
