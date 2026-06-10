# Full-Stack Dynamic PHP Quiz Application

A responsive, web-based quiz application built from scratch using native PHP and a MySQL database backend. Developed as a comprehensive academic course project for the Computer Science and Engineering (CSE) curriculum to demonstrate proficiency in server-side logic scripting, relational database management systems (RDBMS), state persistence, and dynamic frontend interaction.

## 🚀 Key Features

- **Secure User Authentication System:** Implemented native PHP session management for secure user registration, password processing, and login states.
- **Dynamic Quiz Engine:** Questions and multiple-choice options are dynamically fetched and rendered from a structured MySQL database.
- **Real-Time Automated Evaluation:** Features a server-side scoring engine that processes submitted forms, calculates scores instantly, and registers persistent grades.
- **Performance Analytics Dashboard:** Tracks user historical performance, recording timestamps and scoring records to track academic progress over time.
- **Responsive Interface:** Designed with a mobile-friendly, clean interface optimized for both desktop and mobile screens.

## 🛠️ Technical Stack & Tools

- **Backend Logic:** PHP (Procedural/Object-Oriented)
- **Database Backend:** MySQL / MariaDB
- **Frontend Architecture:** HTML5, CSS3, JavaScript, Bootstrap
- **Development Environment:** XAMPP Server / Apache Server, VS Code
- **Version Control:** Git, GitHub

---

## 📊 Database Architecture & Schema Design

The application operates on an optimized relational database layout designed to ensure data integrity and eliminate redundancies. The schema includes:

* `users` – Manages user authentication records, credentials, and account registration data.
* `questions` – Holds the question data bank, multi-choice answer options ($A, B, C, D$), and correct evaluation keys.
* `scores` – Captures test results, user associations, and final evaluations for history tracking.

---

## ⚙️ Local Installation & Setup Guide

Follow these steps to deploy and run the system locally using XAMPP:

### Prerequisites
Download and install [XAMPP Control Panel](https://www.apachefriends.org/) (including Apache and MySQL modules).

### 1. Clone and Place the Project
Clone or download this repository and move the root project folder into your local environment's web directory:
* **Windows (XAMPP):** `C:\xampp\htdocs\quiz-app`
* **Linux (LAMP):** `/var/www/html/quiz-app`

### 2. Import the Database Relational Schema
1. Open your web browser and navigate to the local administration dashboard: `http://localhost/phpmyadmin/`.
2. Create a new target database named **`quiz_db`** with default collation.
3. Select the `quiz_db` database, navigate to the **Import** tab on the top menu.
4. Click **Choose File**, select the provided database backup file included in this repository (e.g., `database.sql` or `quiz_db.sql`), and click **Go/Import**.

### 3. Configure Server Database Connectivity
Locate your environment database connection module (typically `config.php` or `db.php`) and confirm the access configurations map correctly to your local server settings:

```php
<?php
$host = "localhost";
$username = "root";     // Default XAMPP username
$password = "";         // Default XAMPP password is empty
$dbname = "quiz_db"; 

$conn = mysqli_connect($host, $username, $password, $dbname);

if (!$conn) {
    die("Database Connection Failed: " . mysqli_connect_error());
}
?>
