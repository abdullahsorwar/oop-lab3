# OOP Lab 3 

This lab contains **7 problems**. Each problem involves implementing specific object-oriented programming concepts using Java. You will complete the provided skeleton classes by filling in the required methods.

The problems are:
- **Gradebook:** Manage students and their subject marks, compute averages, and track highest and lowest scores.
- **Parking Lot with polymorphic Vehicle rates:** Simulate a parking lot with different vehicle types and calculate parking fees.
- **Shopping Cart with discounts:** Implement a shopping cart that handles products, supports discounts, and calculates total cost.
- **Employee Management:** Model employees including managers and interns, handle payments, and apply raises.
- **Library with nested Borrower class:** Manage books and borrowing information using nested classes.
- **Banking with static counters + transfers:** Implement bank accounts with deposit, withdrawal, and transfer functionalities, tracking total accounts.
- **Zoo with abstract Animal and polymorphic behaviors:** Model animals with different sounds and ages, and manage a collection of animals.

---

### 1. Student Gradebook

This problem requires you to design a system to manage students and their marks in various subjects. You will create a `Student` class to store individual student data and a `Gradebook` class to manage a collection of students, compute averages, and identify top performers.

Method Signatures:

Student

public class Student {
    public Student(String id, String name);
    public void addSubjectMark(String subject, int mark);
    public double average();
    public String highestSubject();
    public String lowestSubject();
    public String getId();
    public String getName();
    public java.util.Map<String,Integer> getMarksView();
}

Gradebook

public class Gradebook {
    public void addStudent(Student s);
    public Student findById(String id);
    public double classAverage();
    public java.util.ArrayList<Student> topK(int k);
}

---

### 2. Smart Parking Lot Simulation

In this problem, you will simulate a parking lot system that handles different types of vehicles. Each vehicle type has its own hourly rate. The parking lot should manage vehicle entry and exit, calculate fees based on parking duration, and track total revenue and occupancy.

Method Signatures:

Vehicle (superclass)

public abstract class Vehicle {
    public Vehicle(String plate, long entryTime);
    public String getPlate();
    public long getEntryTime();
    public abstract double ratePerHour();
}

Subclasses

public class Car extends Vehicle { ... }
public class Bike extends Vehicle { ... }
public class Truck extends Vehicle { ... }

ParkingLot

public class ParkingLot {
    public boolean park(Vehicle v);
    public double leave(String plate, long exitTime);
    public double getRevenue();
    public int getOccupancy();
}

---

### 3. Online Shopping Cart

This problem involves implementing a shopping cart system that can add and remove products, apply discounts, and calculate the total cost. You will manage products with their details and handle operations on the cart.

Method Signatures:

Product

public class Product {
    public Product(int id, String name, double price);
    public int getId();
    public String getName();
    public double getPrice();
}

ShoppingCart

public class ShoppingCart {
    public void addProduct(Product p);
    public boolean removeProductById(int id);
    public void applyDiscount(double percent);
    public double getTotalCost();
    public int size();
}

(Optional: add a Customer class that owns a ShoppingCart.)

---

### 4. Employee Management with Inheritance

You will model an employee management system with different types of employees, such as managers and interns. Each employee has an ID, name, and payment details. The system should support raising salaries and identifying the highest-paid employee.

Method Signatures:

Employee (abstract)

public abstract class Employee {
    public Employee(String id, String name);
    public String getId();
    public String getName();
    public abstract double getPayment();
    public void raiseByPercent(double pct);
}

Subclasses

public class Manager extends Employee { ... }
public class Intern extends Employee { ... }

Company

public class Company {
    public void add(Employee e);
    public Employee richest();
    public void raiseAll(double pct);
    public int size();
}

---

### 5. Library System with Nested Class

In this problem, you will implement a library system that manages books and their borrowing status. Each book can have a nested `Borrower` class to store the borrower's name and borrowing date. The library should track borrowed books and support searching by title.

Method Signatures:

Book

public class Book {
    public class Borrower {
        public Borrower(String name, String date);
        public String getName();
        public String getDate();
    }

    public Book(String title, String author);
    public boolean isBorrowed();
    public Book.Borrower getBorrower();
    public void borrow(String name, String date);
    public void giveBack();
    public String getTitle();
    public String getAuthor();
}

Library

public class Library {
    public void add(Book b);
    public Book findByTitle(String title);
    public java.util.ArrayList<Book> borrowedBooks();
}

---

### 6. Banking System with Static Variables

This problem focuses on implementing bank accounts that support deposits, withdrawals, and transfers. The system should also keep track of the total number of bank accounts created using static variables.

Method Signatures:

BankAccount

public class BankAccount {
    public BankAccount(int accountNumber, String holderName, double openingBalance);
    public void deposit(double amount);
    public boolean withdraw(double amount);
    public boolean transferTo(BankAccount other, double amount);
    public static int getTotalAccounts();
    public double getBalance();
}

---

### 7. Zoo Simulation with Abstract Class

You will create a zoo simulation with an abstract `Animal` class and specific animal subclasses. Each animal has a name, age, and a unique sound. The zoo manages a collection of animals, supports feeding all animals, and can identify the oldest animal.

Method Signatures:

Animal (abstract) + subclasses

public abstract class Animal {
    public Animal(String name, int age);
    public String getName();
    public int getAge();
    public abstract String makeSound();
}

public class Lion extends Animal { ... }
public class Elephant extends Animal { ... }
public class Monkey extends Animal { ... }

Zoo

public class Zoo {
    public void add(Animal a);
    public void feedAll();
    public Animal oldest();
    public int size();
}

---

## How to Run
Example for Problem 1:
```bash
cd Problem1_Gradebook
javac *.java
java Problem1Test

Repeat for Problem2Test, Problem3Test, … up to Problem7Test.


- Run the test for each problem (java ProblemXTest).
- Skeletons compile but many tests will **fail** until you implement the TODOs.
- If all tests show PASS and the summary prints ✅ All tests passed!, your solution is correct.
- Submit your code along with the PASS outputs.