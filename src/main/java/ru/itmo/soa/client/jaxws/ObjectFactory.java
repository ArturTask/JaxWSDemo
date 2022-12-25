
package ru.itmo.soa.client.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.itmo.soa.server.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloWorldResponse_QNAME = new QName("http://ws.server.soa.itmo.ru/", "helloWorldResponse");
    private final static QName _HiResponse_QNAME = new QName("http://ws.server.soa.itmo.ru/", "hiResponse");
    private final static QName _HelloWorld_QNAME = new QName("http://ws.server.soa.itmo.ru/", "helloWorld");
    private final static QName _Hi_QNAME = new QName("http://ws.server.soa.itmo.ru/", "hi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.itmo.soa.server.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hi }
     * 
     */
    public Hi createHi() {
        return new Hi();
    }

    /**
     * Create an instance of {@link HelloWorldResponse }
     * 
     */
    public HelloWorldResponse createHelloWorldResponse() {
        return new HelloWorldResponse();
    }

    /**
     * Create an instance of {@link HiResponse }
     * 
     */
    public HiResponse createHiResponse() {
        return new HiResponse();
    }

    /**
     * Create an instance of {@link HelloWorld }
     * 
     */
    public HelloWorld createHelloWorld() {
        return new HelloWorld();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.soa.itmo.ru/", name = "helloWorldResponse")
    public JAXBElement<HelloWorldResponse> createHelloWorldResponse(HelloWorldResponse value) {
        return new JAXBElement<HelloWorldResponse>(_HelloWorldResponse_QNAME, HelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.soa.itmo.ru/", name = "hiResponse")
    public JAXBElement<HiResponse> createHiResponse(HiResponse value) {
        return new JAXBElement<HiResponse>(_HiResponse_QNAME, HiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.soa.itmo.ru/", name = "helloWorld")
    public JAXBElement<HelloWorld> createHelloWorld(HelloWorld value) {
        return new JAXBElement<HelloWorld>(_HelloWorld_QNAME, HelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.soa.itmo.ru/", name = "hi")
    public JAXBElement<Hi> createHi(Hi value) {
        return new JAXBElement<Hi>(_Hi_QNAME, Hi.class, null, value);
    }

}
