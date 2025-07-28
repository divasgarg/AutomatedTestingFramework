# 🔍 Automated Testing Framework

![Java](https://img.shields.io/badge/Java-ED8B00?logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-A1B000?logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF6B6B?logo=apachemaven&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-00599C?logo=apache&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green.svg)

A reusable, scalable **Java-based automation testing framework** for end-to-end testing of web applications using **Selenium WebDriver**, **TestNG**, and **Maven**.

## 🚀 Features

- Modular and maintainable test design
- Page Object Model (POM) structure
- Supports functional, UI, and regression testing
- Auto-generated TestNG HTML reports
- Easily extendable for new test cases
- Reduces manual testing effort by automating critical flows


## 🛠️ Tech Stack

- **Language:** Java 8+
- **Build Tool:** Maven
- **Testing Framework:** TestNG
- **Automation Tool:** Selenium WebDriver
- **Browser:** Google Chrome
- **Driver:** ChromeDriver


## 📁 Project Structure

AutomatedTestingFramework/
├── src/
│   ├── main/              # Page classes & utilities
│   └── test/              # TestNG test classes
├── testng.xml             # Test suite configuration
├── pom.xml                # Maven dependency file
├── README.md

## ⚙️ Setup Instructions

### 1. Prerequisites

- Java JDK 8 or higher
- Maven
- Google Chrome (latest)
- ChromeDriver (matching your Chrome version)

### 2. Clone the Repository

```bash
git clone https://github.com/divasgarg/AutomatedTestingFramework.git
cd AutomatedTestingFramework

3. Install Dependencies

mvn clean install

4. Run the Tests

Using TestNG via terminal:

mvn test

Or directly from IntelliJ:
	•	Right-click testng.xml → Run with TestNG

5. View Reports

After test execution, open:

test-output/index.html


📦 Dependencies

Listed in pom.xml:

<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.17.0</version>
</dependency>

<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.9.0</version>
    <scope>test</scope>
</dependency>
