# busticketing
Bus Ticketing System and tried to implement an Admin portal which can be operated over browsers and a series of REST APIs to interact with the system using mobile applications or frontend applications written for the browsers. The complete systems has two important actors :  

1. Admin user 
2. End user  

The _Admin user_ can access this application on browser (laptop or mobile/tablet, doesn't really matter as this is built using bootstrap, material design and is completely responsive) and can perform the following actions :  

1. Signup 
2. Login (Spring sessions) 
3. Update their profile 
4. Create an agency 
5. Add buses to the agency 
6. Add trips consisting of predefined stops and buses   

The _End user_ can use their mobile application (yet to be built, however the REST APIs are ready and could be used via Postman or Swagger) to perform the following actions :  

1. Signup 
2. Login (and get a JWT token)  
3. List all available stops 
4. Search a trip between any two stops 
5. Filter search results with a date option 
6. Book a ticket for a given trip schedule  

Admin interface and REST APIs both have their independent authentication mechanisms, the web application uses the cookie based authentication (provided by default by Spring security) and the REST API uses the JWT authentication for access. This application assumes the availability of 'MySQL' installation on the localhost where the server will run or the use of docker-compose to boot up a mysqldb container and link the application with it within the realm of docker.  Any changes that the admin users will do on the web portal will impact the search results of the end users, there will be certain use cases which you may find missing here, I hope you will appreciate that the overall idea was to present a way to create such an application completely inside the realm of Spring Boot and not to actually building a fully functional reservation system.  The admin user interface is completely written in material design using Bootstrap v4 and is responsive to suite a variety of devices. The template engine used to render the admin views is Thymeleaf since the library is extremely extensible and its natural templating capability ensures templates can be prototyped without a back-end – which makes development very fast when compared with other popular template engines such as JSP.
