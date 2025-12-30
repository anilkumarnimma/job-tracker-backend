**Job Tracker Backend**

Job Tracker Backend is a simple Spring Boot application  
built to track job applications.

I created this project to improve my backend development skills  
using Java and Spring Boot.

The focus of this project is on REST APIs,  
request handling, and clean project structure.

---

The application stores job applications in memory.  
It exposes browser-friendly endpoints  
so the data can be viewed easily without extra tools.

Sample job data is automatically loaded  
when the application starts for demo purposes.

---

The backend provides:
- A health check endpoint
- An endpoint to view all job applications
- An endpoint to view a single job application by ID

This project demonstrates controller–service separation  
and in-memory data handling.

---

**Technologies Used**
- Java
- Spring Boot
- Maven

---

**How to Run**

1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Run the `JobtrackerApplication` class
4. Open a browser and visit:
http://localhost:8080/api/jobs

To check if the backend is running:
http://localhost:8080/api/jobs/ping
