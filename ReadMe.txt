In application.yml file of microservcie achitype
-------------------------------------------------------------

This is Eureka-Server App
------------------------------------


server:
  port: 8761
  
  
eureka:
  client:
    fetch-registry: false
    register-with-eureka: false


//  --> fetch-registry: false : Bydeafult when we run app , it will search for Discovery Client to Register app into it 
						
						so, to avid for search we are giveing it as "false"

// --? register-with-eureka: false : For not to register in any Eureka , we are giving as "false"

@RestTemplate 
-----------------------
In conclusion, RestTemplate is a powerful tool for making HTTP requests in Spring Boot. With its various methods for making GET, POST, PUT, and DELETE requests, as well as its ability to handle responses and exceptions, it makes it easy to consume RESTful web services in your application.


@LaodBalanced
---------------------

The @LoadBalanced annotation creates an instance of created RestTemplate load-balanced. There is no code you need to write to make the RestTemplate load-balance HTTP request it sends to an internal microservice. The RestTemplate bean will be intercepted and auto-configured by Spring Cloud.


How to communicate from one microservice to anothe microservice
------------------------------------------------

By sending http request from one to another with healp of RestTamplate,and restTemplate is annotated with @LoadBalanced


	@Bean
	@LoadBalanced
	eg: public RestTemplate restTemplste(){

		return new RestTemplate(); 	
		}









