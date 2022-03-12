package Advanced2.SdTasks.Singleton3;

public class main {

    public static void main(String[] args) {
        Servers server1 = new Servers();
        Servers server2 = new Servers();
        Servers server3 = new Servers();


        server1.addServer("http//www.something1.com");
        server1.addServer("http//www.something2.com");
        server1.addServer("http//www.something3.com");
        server1.addServer("http//www.something4.com");
        server1.addServer("http//www.something5.com");

        server2.addServer("http//www.something6.com");
        server2.addServer("http//www.something6.com");
        server2.addServer("http//www.something6.com");

        server3.addServer("http//www.something7.com");
        server3.addServer("http//www.something7.com");
        server3.addServer("http//www.something7.com");
        server3.addServer("http//www.something7.com");

        server3.addServer("https//www.something7.com");
        server3.addServer("https//www.something7.com");
        server3.addServer("https//www.something7.com");
        server3.addServer("https//www.something8.com");

        System.out.println("server1: " + server1.getHttpServers() + "\n");
        System.out.println("server2: " + server2.getServersStartingWith("http") + "\n");
        System.out.println("server3: " + server3.getHttpServers() + "\n");         // I don't get why it returns
        // server3: [http//www.something7.com, https//www.something7.com, https//www.something8.com]
        // 2 last ones shouldn't be in the list

        System.out.println("server3 https: " + server3.getHttpsServers() + "\n");

    }

}
