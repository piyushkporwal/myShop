myShop - E-commerce Web Application
myShop is a full-stack e-commerce web application built with React for the frontend and Spring Boot for the backend. It allows users to browse products, toggle between light and dark themes, and manage products via a REST API. The application features a responsive product grid, intuitive navigation, and planned functionalities for cart management, search, and user authentication.
Features

Product Management: View, add, update, and delete products using a REST API.
Responsive Design: Mobile-friendly product grid with Bootstrap and custom CSS animations.
Theme Toggling: Switch between light and dark themes, persisted with localStorage.
Navigation: Fixed navbar with Home, Add Product, and Categories dropdown.
API Integration: Fetch product data seamlessly with Axios.
Planned Features: Cart functionality, product search, and user login system.

Technologies

Frontend: React, Bootstrap, Axios, CSS (with variables and animations), JavaScript
Backend: Spring Boot, Spring Data JPA, Java
Database: H2 (in-memory)
Other: REST API, localStorage, Git

Project Structure
myShop/
├── ecom-frontend-1/                  # React frontend
│   ├── public/                      # Public assets
│   ├── src/                         # Frontend source
│   │   ├── App.css                  # Theme and component styles
│   │   ├── Home.jsx                 # Product listing component
│   │   ├── AddProduct.jsx           # Placeholder for product addition
│   │   ├── Navbar.jsx               # Navigation with theme toggle
│   │   └── ...                      # Other React components
│   ├── package.json                 # Frontend dependencies
│   └── ...                          # Frontend configs
├── src/                             # Spring Boot backend
│   ├── main/
│   │   ├── java/com/piyush/myShop/
│   │   │   ├── controller/          # REST controllers
│   │   │   │   ├── HomeController.java
│   │   │   │   ├── LoginController.java
│   │   │   │   ├── ProductsController.java
│   │   │   ├── model/              # Data models
│   │   │   │   ├── Product.java
│   │   │   ├── repository/         # JPA repositories
│   │   │   │   ├── ProductRepo.java
│   │   │   ├── service/            # Business logic
│   │   │   │   ├── ProductService.java
│   │   ├── resources/
│   │   │   ├── application.properties  # Database and server config
│   └── test/                       # Backend tests
├── pom.xml                         # Maven dependencies
├── .gitignore                      # Ignored files
└── README.md                       # Project documentation

Prerequisites

Node.js (v16 or later) and npm
Java (JDK 17 or later) and Maven
Git
IDE: IntelliJ IDEA or VS Code

Installation
Clone the Repository
git clone https://github.com/piyushkporwal/myShop.git
cd myShop

Backend Setup

Navigate to the backend directory:
cd myShop


Configure H2 Database:

The project uses an H2 in-memory database, configured in src/main/resources/application.properties:
spring.application.name=myShop
spring.datasource.username=piyush
spring.datasource.password=kumar
spring.datasource.url=jdbc:h2:mem:piyush
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update


Note: Added spring.jpa.hibernate.ddl-auto=update for schema creation. Update application.properties if not already present.



Install dependencies and run:
mvn clean install
mvn spring-boot:run


Backend runs on http://localhost:8080.



Frontend Setup

Navigate to the frontend directory:
cd ecom-frontend-1


Install dependencies:
npm install


Run the frontend:
npm start


Frontend runs on http://localhost:3000, connecting to the backend.



IntelliJ VCS Setup
To avoid Invalid VCS Root Mapping errors in IntelliJ IDEA:

Open IntelliJ IDEA > Preferences > Version Control.
Ensure only the myShop directory is mapped to Git (remove entries for ecom-frontend-1 or others).
Verify the .git folder exists in myShop/ and not in subdirectories.
If errors persist, go to VCS > Enable Version Control Integration, select Git, and restart IntelliJ (File > Invalidate Caches / Restart).

Usage

Access the App: Open http://localhost:3000.
Browse Products: View products on the homepage.
Toggle Theme: Use the sun/moon icon in the navbar.
API Endpoints (test with Postman):
GET /products: List products.
GET /products/{id}: Get a product.
POST /products: Add a product (e.g., { "name": "Laptop", "brand": "Dell", "price": 50000 }).
PUT /products: Update a product.
DELETE /products/{id}: Delete a product.
GET /: Welcome message.
GET /about: About message.
GET /login: Login message.



Contributing

Fork the repository.
Create a branch: git checkout -b feature/your-feature.
Commit changes: git commit -m "Add your feature".
Push: git push origin feature/your-feature.
Open a Pull Request.

License
This project is licensed under the MIT License.
Contact

GitHub: piyushkporwal

