

# CSC6301 – Project 04

## Flexible Notification System (Composition Design Pattern)

---

## Overview

This project implements a **Flexible Notification System** designed to demonstrate the **Composition design pattern** in object-oriented programming.

The system separates *what a notification is* from *how it is delivered*. Notification behavior is abstracted through an interface, allowing different delivery mechanisms (Email, SMS, etc.) to be plugged into the system without modifying its core logic.

The design follows key SOLID principles:

* **Single Responsibility Principle** – Each service handles only its own delivery behavior.
* **Open/Closed Principle** – The system is open to extension but closed to modification.
* **Dependency Inversion Principle** – High-level modules depend on abstractions rather than concrete implementations.

This architecture ensures maintainability, scalability, and ease of extension.

---

## Architecture Overview

The system consists of the following components:

* `NotificationMedium` – Interface defining the contract for all notification services.
* `EmailService` – Concrete implementation that simulates sending email notifications.
* `SMSService` – Concrete implementation that simulates sending SMS notifications.
* `AlertSystem` – Composition container that delegates notification behavior to a `NotificationMedium` implementation.

The `AlertSystem` does not contain any hardcoded logic for specific delivery types. Instead, it receives a `NotificationMedium` instance and delegates the sending behavior to that implementation.

This demonstrates true composition: behavior is assembled dynamically rather than inherited.

---

## Project Structure

```id="yxt1az"
AlertSystem.java
NotificationMedium.java
EmailService.java
SMSService.java
project04Writeup.pdf
```

---

## Requirements

* Java JDK 17+ (or compatible version)
* Command line or Java IDE capable of compiling and running `.java` files

No external libraries are required.

---

## Build & Run Instructions

From the project root directory:

### Compile

```id="lqg3mv"
javac *.java
```

### Run

```id="mb0q93"
java AlertSystem
```

If test classes are included and assertions are used:

```id="0m3dvl"
java -ea TestClassName
```



## Design Rationale

Using composition rather than inheritance prevents tight coupling between the alert logic and specific delivery mechanisms.

Instead of hardcoding branching logic such as:

```java
if (type.equals("email")) { ... }
```

The system delegates responsibility to interchangeable components. This improves:

* Maintainability
* Testability
* Extensibility
* Readability

Future notification services can be added without altering existing classes.

---

