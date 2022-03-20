package Advanced2.SdaTasks.Singleton1;

public class main {

    public static void main(String[] args) {
        Servers server = Servers.getInstance();

        server.addServer("http//www.something1.com");
        server.addServer("http//www.something2.com");
        server.addServer("http//www.something3.com");
        server.addServer("http//www.something4.com");
        server.addServer("http//www.something4.com");

        server.addServer("https//www.something4.com");
        server.addServer("https//www.something4.com");
        server.addServer("https//www.something5.com");
        server.addServer("https//www.something5.com");
        server.addServer("https//www.something6.com");
        server.addServer("https//www.something6.com");


        System.out.println(server.getHttpServers() + "\n");
        System.out.println(server.getHttpsServers() + "\n");


    }

}
