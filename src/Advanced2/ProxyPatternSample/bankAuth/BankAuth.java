package Advanced2.ProxyPatternSample.bankAuth;

import java.io.BufferedReader;
import java.io.IOException;

public class BankAuth {
    public void run() {

        //Following code is just some random sample that I know gives Exception
        // and doesn't allow my main code to run on

        String requestString;
        try{
            BufferedReader proxyToClientBr = null;
            requestString = proxyToClientBr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading request from client");
            return;
        }

        System.out.println("Reuest Received " + requestString);
        String request = requestString.substring(0,requestString.indexOf(' '));

        String urlString = requestString.substring(requestString.indexOf(' ')+1);
        urlString = urlString.substring(0, urlString.indexOf(' '));

        if(!urlString.substring(0,4).equals("http")){
            String temp = "http://";
            urlString = temp + urlString;
        }
    }
}
