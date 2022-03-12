package Advanced2.SdTasks.Singleton3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Servers {



    /*
    *   Exercise 1 - singleton
    *   Exercise 2 - singleton
            Change the singleton from Exercise 1 in a way, to make it usable in a multithreaded application.
    *   Exercise 3 - singleton
            Change the singleton type from the previous exercise. Use eager type of singleton.
    */

    public static final Servers INSTANCE = new Servers();

    //Create a singleton Servers of lazy type.
    public Servers getInstance(){

        return INSTANCE;
    }

    //This singleton stores the list of servers (as String).
    private final List<String> serverList;
    public Servers(){
        serverList = new ArrayList<>();
    }

    /*
    *   adding a server to the list
    *   a method adding the server to the list should return boolean (true if the server has been added to the list, false if it's otherwise)
    *   adding is possible, if its name starts from http or https
    *   adding a duplicated name is impossible.
    */
    public boolean addServer(final String server){
        if ((server.startsWith("http") || server.startsWith("https")) && !serverList.contains(server)){
            return serverList.add(server);
        }
        return false;
    }

    //downloading a list of servers, that names start from http.
    public List<String> getHttpServers(){
        return serverList.stream()
                .filter(server -> server.startsWith("http"))
                .collect(Collectors.toUnmodifiableList());
    }

    public List<String> getServersStartingWith(final String prefix) {
        return serverList.stream()
                .filter(server -> server.startsWith(prefix))
                .collect(Collectors.toUnmodifiableList());
    }

    //downloading a list of servers, that names start from https.
    public List<String> getHttpsServers(){
        return serverList.stream()
                .filter(server -> server.startsWith("https"))
                .collect(Collectors.toUnmodifiableList());
    }
}
