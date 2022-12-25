package ru.itmo.soa.server.endpoint;

import ru.itmo.soa.server.ws.DemoImpl;

import javax.xml.ws.Endpoint;

public class MyPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:5983/ws/demo", new DemoImpl());
        System.out.println("Finished");
    }
}
