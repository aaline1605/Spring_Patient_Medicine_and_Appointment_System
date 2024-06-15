PATIENT_MEDICINE_APPOINTMENT_SYSTEM

***Overview***
This project is a Hospital Management System built using Spring Boot. It provides functionalities for managing patients, doctors, medicines, and appointments. The system includes user authentication 
and role-based access control for patient only.Make sure to read Mandatory information and I have attached Drive link next to mandatory information able to view Frontend, Documentation and ScreenShots.

***Table of Contents***
Features
Technologies Used
Setup and Configuration
Running the Application
API Endpoints
Data Validation Rules
Mandatory Information

***Features***
-User Registration and Authentication
-Manage Patient Information
-Manage Doctors Information
-Manage Medicines Information
-Schedule and Manage Appointments

***Technologies Used***
-Java
-Spring Boot
-Spring Security
-Spring Data JPA

***Thymeleaf***
-H2 Database (for development)
-MySQL (for production)
-Setup and Configuration

***Prerequisites**
Java 8 or higher
Maven
MySQL (for production environment)

***Clone the Repository**
bash
Copy code
git clone https://github.com/your-username/hospital-management-system.git
cd hospital-management-system

***Configure the Database***
Development Environment
The application uses H2 Database for development. No additional configuration is needed.

## Production Environment
-Create a MySQL database.
-Update application.properties with your MySQL database credentials.
##application.properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/your-database
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update

## Build the Project
bash
Copy code
mvn clean install

## Running the Application
bash
Copy code
mvn spring-boot:run
The application will be accessible at http://localhost:8080.

## API Endpoints
***User Registration and Authentication***

GET /registration: 
-Show the registration form

POST /registration: 
-Register a new user

## Patient Management
***GET /home***
-View the home page

***GET /displayMedicine*** 
-View all medicines for the logged-in patient

***GET /addMedicine*** 
-Show the form to add a new medicine

***POST /save*** 
-Save a new medicine

***GET /medicineUpdateById***
-Show the form to update medicine quantity

***PUT /saveUpdate***
-Update the medicine quantity

## Doctor Management
***GET /displayDoctors**
-View all doctors

***GET /bookAppointment/{doctorId}***
-Show the form to book an appointment with a doctor

##Appointment Management
***GET /appointment/{doctorId}***
-Show the appointment form

***POST /saveAppointment*** 
-Save a new appointment

***GET /displayAppointments***
-View all appointments for the logged-in patient

## Data Validation Rules

***Patient Registration***
-firstName: Not empty
-lastName: Not empty
-email: Valid email format, not empty
-password: Not empty, minimum length of 6 characters

***Medicine***
-name: Not empty
-quantity: Not empty, must be a positive integer

## Mandatory Information
NOTE
-I have a Request in this Project One User Configuration only available, So, there is no more ADMIN or CREDENTIAL Separate login Page. AS you, before you run my project You must add Insert table query 
for doctor details in your database that only you can see doctor availability in appointment section as well in this Document below, I will provide my Insert query You can Use it. When test my application.

## FrontEnd
-In this project you can able to see FrontEnd as well as Documentation, and Screenshots in Drive Link
-Click here: https://drive.google.com/drive/folders/1A-fCL6w6K1PFeTjDye8xQHdwO_L7IRbi?usp=drive_link

## Acknowledgements
- Special thanks to the Spring Boot, Thymeleaf, and MySQL communities for their excellent documentation and support.

---

***Happy Coding!***















