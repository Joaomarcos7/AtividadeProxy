package org.serviceemail;

public class ClientInternet {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("www.ifpb.edu.br");
            internet.connectTo("www.youtube.com");
            internet.connectTo("www.facebook.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
