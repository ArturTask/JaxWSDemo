package ru.itmo.soa.client;

import ru.itmo.soa.client.jaxws.DemoImpl;
import ru.itmo.soa.client.jaxws.DemoImplService;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoClient {
//    @WebServiceRef(wsdlLocation = "http://localhost:5983/ws/demo?wsdl")
//    private static Demo d;



    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:5983/ws/demo?wsdl");
        DemoImplService service = new DemoImplService(url);
        DemoImpl proxy = service.getDemoImplPort();


        System.out.println(proxy.hi("wsss"));

    }
}
