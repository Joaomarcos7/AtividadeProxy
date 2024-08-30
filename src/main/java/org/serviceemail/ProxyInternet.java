package org.serviceemail;
import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private RealInternet realInternet = new RealInternet();
    private static List<String> blockedSites;

    static {
        blockedSites = new ArrayList<>();
        blockedSites.add("www.youtube.com");
        blockedSites.add("www.facebook.com");
        // Adicione mais sites bloqueados conforme necessário
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if (blockedSites.contains(serverhost.toLowerCase())) {
            System.out.println("Acesso negado ao site " + serverhost);
        } else {
            realInternet.connectTo(serverhost);
        }
    }
}
