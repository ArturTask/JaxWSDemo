# Demo project to show the interaction of soap-client and soap-server
Bottom-up approach - we implement classes and automatically generate WSDL (we dont have to write WSDL).

## Project structure
Server part consists of 2 packages:
* ws - our web services (**business logic**)
* endpoint - publisher, with help of witch we publish our web services

Client part consists of 1 package and 1 class:
* ```DemoClient``` - demonstration of how the client works in main method.
* jaxws - folder with generated classes

## Tutorial


Current url is ```http://localhost:5983/ws/demo```.
To see the generated wsdl visit ```http://localhost:5983/ws/demo?wsdl```
  
Then simply run the main method of ```MyPublisher``` class.
You should see "Finished" in console now if done correctly. 

After we finish our preparations we need 
to generate our "remote" classes that will be
used on our ```client``` side

Now we need to use the ```wsimport``` tool:
1) Go to {classpath}/target/classes (Projects/JaxWSTest/target/classes)
2) Write ```wsimport -keep -p ru.itmo.soa.server.ws http://localhost:5983/ws/demo?wsdl``` -p means specify package and link we're getting our generated classes from
3) Copy everything from **target/classes/ru/itmo/soa/server/ws** (that was generated!! i.e. everything except Demo.class and DemoImpl.class) to **src/main/java/ru/itmo/soa/client/jaxws** and delete all ```*.class``` files
4) Now we can use ```DemoImplService``` and ```DemoImpl``` (generated class and interface) in ```DemoClient```
    * If you see exception with @XmlType(name = "helloWorldResponse") in generated ```HelloWorldResponse```, ```HelloWorld```, ```Hi```, ```HiResponse``` classes, simply change the name of element @XmlType(name = "helloWorldResponse4")(exception is thrown due to same names in one namespace see xml namespaces)
5) We did it! just run main method from ```DemoClient``` class!


To prove that we've done everything correctly simply change ```DemoImpl``` method **from server** (for example ```hi```)
,so it returns other string and **rerun** ```MyPublisher``` then **rerun** ```DemoClient``` 

If everything is done correctly you should see that the client output changed.

## Note
SOAP client and SOAP server are not http client and server.
We use **SOAP client** to remotely envoke method from **SOAP server**.

So (http client) - (http server: (SOAP client) + (soap server))

If we want to make common Web server we also need to implement REST layer so that we can call methods from SOAP client.

![Alt text](SOAP.png?raw=true "soap")

 
## Useful links

* https://systems.education/soap-integration?ysclid=lc3gm3pd27391461167
* https://youtu.be/XFWoHayjMnE
* https://www.baeldung.com/jax-ws

 
