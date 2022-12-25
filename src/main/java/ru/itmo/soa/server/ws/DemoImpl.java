package ru.itmo.soa.server.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class DemoImpl implements Demo{

    @WebMethod
    public String helloWorld() {
        return "Hello World";
    }

    @WebMethod
    public String hi(String name) {
        return "Hello lala " + name;
    }
}
