# 🚀 Selenium Java Automation Framework – Book Management

![Java](https://img.shields.io/badge/Java-17-orange)
![Selenium](https://img.shields.io/badge/Selenium-4.x-green)
![TestNG](https://img.shields.io/badge/TestNG-Test_Framework-red)
![Allure](https://img.shields.io/badge/Allure-Report-blue)
![CI](https://img.shields.io/badge/CI-GitHub_Actions-yellow)

---

## 📌 Introduction

This project is built using **Selenium WebDriver 4** and **Java 17**, applying the **Page Object Model (POM)** design pattern with **TestNG** to automate testing for a Book Management System.

---

## 🏗️ Tech Stack

- Java 17
- Selenium WebDriver 4
- TestNG
- Allure Report
- Maven

---

## 🚀 Key Features

- Page Object Model (POM) architecture
- Cross-browser & Headless support
- Allure reporting with screenshot attachment
- Material UI handling (Dropdown, Upload, Hidden Textarea)

---

## 📦 Installation

### Clone repository

```bash
git clone https://github.com/Hong-203/selenium-antigravity-java
```

### Install dependencies

```bash
mvn clean install -DskipTests
```

---

## 🧪 Run Tests

### Run with UI

```bash
mvn clean test
```

### Run Headless (CI)

```bash
mvn clean test -Dheadless=true
```

### View Allure Report

```bash
mvn allure:serve
```

---


## 📝 Test Cases

### Link TestCase
```
https://docs.google.com/spreadsheets/d/1q6-AphReK6Qs_xc5eRuqJUzzVLA0R9Sn0wiVj6NY-Xo/edit?usp=sharing
```

| ID   | Test Case Name | Description |
|------|----------------|------------|
| TC01 | Verify Login Successfully | Login with valid credentials |
| TC02 | Navigate to Book Management | Navigate to Book Management page |
| TC03 | Add New Book – Valid Data | Successfully create new book |
| TC04 | Add New Book – Missing Fields | Validate required field |
| TC05 | Add New Book – Invalid Price | Validate negative price |
| TC06 | Verify Search Functionality | Search created book |
| TC07 | Verify Reset Button | Reset form |
| TC08 | Verify Empty Submit | Prevent empty submit |

---

## 👨‍💻 Author

Prompt & Business Logic: Dang Hong  

