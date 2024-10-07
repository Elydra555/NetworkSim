/*
* File: App.java
* Author: Klíber Regő Benedek
* Copyright: 2024, Klíber Regő Benedek
* Group: Szoft II/I/N
* Date: 2024-09-30
* Github: https://github.com/Elydra5/
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {
        Network network = new Network();
        network.connectToNetwork("AnimeUwUGirlKawaiiNetwork");
        network.disconnectFromNetwork();
    }
}
