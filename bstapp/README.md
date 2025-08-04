# Binary Search Tree Web Application

This is the final sprint project for the Data Structures and Algorithms course. The application allows users to input a series of comma-separated numbers, constructs a Binary Search Tree (BST), performs an in-order traversal, and stores both the input and result for future reference.
---
## 🛠️ Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- Thymeleaf
- H2 Database (in-memory)
- Maven
---
## 🚀 Features

### 1. Input Numbers
- Navigate to `/enter-numbers`
- Enter a list of numbers separated by commas (e.g., `5,3,8,1,4`)
- Click **Submit** to build the BST

### 2. View In-Order Traversal Result
- After submitting, the app displays the **in-order traversal** of the BST
- Example input: `5,3,8,1,4` → Output: `1 3 4 5 8`

### 3. See Previous Inputs
- Click the **Show Previous Trees** button on the form page
- Displays a list of all previous submissions and their BST results
---
## 🧪 Unit Tests
Located under `src/test/java/...`
- Tests cover in-order traversal, node insertion, and in-memory service logic
---
## 🗂️ Project Structure
src/
└── main/
├── java/
│ └── com.sprint.bstapp/
│ ├── controller/ # Web controllers
│ ├── model/ # TreeEntry, TreeNode, BinarySearchTree
│ ├── repository/ # JPA repository interface
│ └── service/ # TreeEntryService logic
└── resources/
├── templates/ # HTML (Thymeleaf) files
└── static/ # CSS styling

---
## 💡 How to Run
1. Clone the repo
2. Open in IntelliJ or your favorite IDE
3. Run the project with `SpringBootApplication` (port 8080)
4. Visit: `http://localhost:8080/enter-numbers`
---
## ✍️ Author
Christian Rose  
Final Sprint Project – DSA (Data Structures & Algorithms)  
Software Development Program – Keyin College

