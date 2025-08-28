# QA Engineer Test Automation Project

This repository contains a test automation suite for a Unity-based counter application, built using [AltTester SDK (Community Edition)](https://alttester.com/docs/sdk/latest/) and Java.  
It includes a modified Unity project based on [Estoty/qa-engineer-test](https://github.com/Estoty/qa-engineer-test), adapted to support automated UI testing.

---

## ✅ Prerequisites

To run the tests, please ensure the following tools are installed:

- Unity Hub with a compatible Unity version
- AltTester SDK (already integrated into the Unity)
- AltTester Desktop v2.2.5
- IntelliJ IDEA Community Edition
- Java 17+
- Maven 3.8+

---

## ⚙️ Setup Guide

### 1. Open the Unity project

- Launch Unity Hub and open the Unity project included in this repository (path)
- Make sure the scene contains:
    - A button named `Button`
    - A text element named `CountText`
    - Scripts attached and configured
- Build the project using the **Build and Run** button in AltTester Editor

### 2. Start AltTester Desktop

- Launch AltTester Desktop
- Wait until the status bar shows **Connected** — this confirms that the Unity app is ready for testing

### 3. Open the test project in IntelliJ

- Open the Java test automation folder in IntelliJ IDEA
- Wait for Maven to finish indexing
- Run tests directly from IntelliJ

---

## 🧪 Test Scenarios

The following test cases are implemented:

- ✅ Button is interactable
- ✅ Count value increases when the button is pressed
- ✅ Count value is exactly 10 after pressing the button 10 times

---
