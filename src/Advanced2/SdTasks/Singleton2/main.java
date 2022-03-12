package Advanced2.SdTasks.Singleton2;

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
        server3.addServer("http//www.something7.com");

        server1.getHttpServers();
        System.out.println(server1.getHttpServers() + "\n");
        System.out.println(server2.getHttpServers() + "\n");
        System.out.println(server2.getHttpServers() + "\n");

    }

}
