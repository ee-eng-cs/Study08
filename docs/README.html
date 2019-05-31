<!DOCTYPE html>
<HTML>
<HEAD>
	<META charset="UTF-8">
</HEAD>
<BODY>
<IMG src="images/ColorScheme.png" height="25" width="800"/>
<H2 id="contents">Study08 README Contents</H2>
<H3>Research Microservices</H3>

<P>Java source code:<BR/>
<img src="images/aquaHR-500.png"><BR/>
<img src="images/aquaSquare.png"> common package 
	<a href="https://github.com/ee-eng-cs/Study08/tree/master/microservices-common/src/main/java/kp/common/">kp.common</a><BR/>
<img src="images/aquaSquare.png"> producer package
		<a href="https://github.com/ee-eng-cs/Study08/tree/master/microservices-producer/src/main/java/kp/producer/">kp.producer</a><BR/>
<img src="images/aquaSquare.png"> consumer package 
		<a href="https://github.com/ee-eng-cs/Study08/tree/master/microservices-consumer/src/main/java/kp/consumer/">kp.consumer</a><BR/>
<img src="images/aquaSquare.png"> registration package
		<a href="https://github.com/ee-eng-cs/Study08/tree/master/microservices-registration/src/main/java/kp/registration/">kp.registration</a><BR/>
<img src="images/aquaHR-500.png"></P>

<P>The example uses Spring Boot, Eureka server, Hystrix circuit breaker, and Spring Boot Actuator.<BR/>
Eureka and Hystrix are from the Spring Cloud Netflix.
</P>

<P><BR><IMG src="images/Diagram.png" height="200" width="600"/><BR>
<I>Microservices registration, lookup and consuming.</I>
</P>

<P>The microservice registration and discovery is done with Eureka server.<BR/>
The <B>consumer-service</B> is an example of the frontend (application) services.<BR/>
The <B>producer-service</B> is an example of the backend (business) services.
</P>

<P><BR><IMG src="images/EurekaDashboardFragment.png" height="157" width="1039"/><BR>
<I>Screenshot fragment from the Eureka Dashboard</I>
</P>

<P>Initial actions:<BR/>
<img src="images/orangeHR-500.png"><BR/>
<img src="images/orangeCircle.png"> 1. With batch file <I>"02 run registration.bat"</I> start Eureka registration server.<BR/>
<img src="images/orangeCircle.png"> 2. With batch file <I>"03 run producer.bat"</I> start <B>producer-service</B> server.<BR/>
<img src="images/spacer-32.png">It registers the first instance of <B>producer-service</B>.<BR/>
<img src="images/orangeCircle.png"> 3. With batch file <I>"04 run consumer.bat"</I> start <B>consumer-service</B> server.<BR/>
<img src="images/orangeCircle.png"> 4. With batch file <I>"05 run producer (9091).bat"</I> start another <B>producer-service</B> server on port 9091.<BR/>
<img src="images/spacer-32.png">It registers the second instance of <B>producer-service</B>.<BR/>
<img src="images/orangeHR-500.png"></P>

<P/>

<P>Actions:<BR/>
<img src="images/orangeHR-500.png"><BR/>
<img src="images/orangeCircle.png"> 1. Execute batch file <I>"06 CURL read.bat"</I>.<BR/>
<img src="images/orangeCircle.png"> 2. In web browser go to URL <A HREF="http://localhost:8081/content">http://localhost:8081/content</A>.
      It executes <B>producer-service</B> on default port 8081.<BR/>
<img src="images/orangeCircle.png"> 3. In web browser go to URL <A HREF="http://localhost:9091/content">http://localhost:9091/content</A>.
      It executes <B>producer-service</B> on explicit port 9091.<BR/>
<img src="images/orangeCircle.png"> 4. In web browser go to URL <A HREF="http://localhost:8082/launch_consumer_service">http://localhost:8082/launch_consumer_service</A>.
      It executes <B>consumer-service</B>.<BR/>
<img src="images/spacer-32.png">This consumer service starts sequentially two instances of <B>producer-service</B> (round robin load balancing algorithm).<BR/>
<img src="images/orangeHR-500.png"></P>

<P><IMG src="images/ConsoleLogCurl.png" height="531" width="1100"/><BR>
<I>First action result ("06 CURL read.bat"): console log from curl call.</I></P>

<P><IMG src="images/ConsoleLogConsumerServer.png" height="36" width="1100"/><BR>
<I>First action result ("06 CURL read.bat"): console log from consumer server.</I></P>

<P><IMG src="images/ConsoleLog1stProducerServer.png" height="36" width="1100"/><BR>
<I>First action result ("06 CURL read.bat"): console log from first producer server.</I></P>

<P><IMG src="images/ConsoleLog2ndProducerServer.png" height="36" width="1100"/><BR>
<I>First action result ("06 CURL read.bat"): console log from second producer server.</I></P>

<P><BR><IMG src="images/ActuatorMappings.png" height="139" width="727"/><BR>
<I>Fragment from "http://localhost:8082/actuator/mappings" response.</I>
</P>

<H3>Other Microservices Test Scenarios</H3>
<OL>
	<LI>Start Eureka registration server.</LI>
	<LI>Start <B>producer-service</B> server on default port 8081.</LI>
	<LI>Start <B>consumer-service</B> server.</LI>
	<LI>Execute <I>"06 CURL read.bat"</I>.</LI>
	<LI>Kill the producer service on default port 8081.</LI>
	<LI>Start <B>producer-service</B>' server on port 9091.</LI>
	<LI>Execute <I>"06 CURL read.bat"</I>.</LI>
	<LI>The <B>consumer-service</B> server switches to using the next <B>producer-service</B> server.</LI>
	<LI>When any producer service is down, then there is a response with content "fallback" from Hystrix fallback method.</LI>
</OL>

<P><IMG src="images/ConsoleLogConsumerServerFallback.png" height="36" width="1100"/><BR>
<I>Console log from consumer server with first normal response and next fallback response.</I></P>

<HR/>
<A href="apidocs/index.html?overview-summary.html" >API Specifications</A>
(API was not commited to <B>GitHub</B>; this link should be active after local build with <I>'mvn javadoc'</I>)
<HR/>
</BODY>
</HTML>