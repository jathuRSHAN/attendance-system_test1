"# Attendance System" 


This is a simple student attendance management system built using:
- **Frontend:** HTML, JavaScript
- **Backend:** Java (Spring Boot)
- **Authentication:** JWT (JSON Web Token)

---

## Project Setup

###  1. Clone the Repository
```sh
git clone https://github.com/jathuRSHAN/attendance-system_test1.git
cd attendance-system_test1

Backend Setup (Spring Boot)
###2. Install Java & Maven
Ensure you have Java JDK 17+ and Maven installed.
Check versions:

java -version
mvn -version

Start the Backend Server
#cd server
#mvn spring-boot:run
#backend will run at: http://localhost:8080
#login API is available at: POST http://localhost:8080/auth/login

Frontend Setup (HTML + JavaScript)
# Open Client Pages
#Open client/index.html in a web browser.
#Enter username and password (admin / password123).
#If correct, it redirects to the home page.
#If incorrect, it shows "Invalid login".
#Logout Functionality
#On the home page, clicking Logout redirects back to login.

