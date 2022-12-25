package ru.itmo.soa.server.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "ru.itmo.soa.server.ws.Demo")
public interface Demo {

    @WebMethod
    public String helloWorld();

    @WebMethod
    public String hi(String name);

}
