[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

---Library Management System

## Problem Statement (max 150 words)

---Managing library operations manually or with poorly structured systems leads to inefficiencies such as lost records, difficulty tracking borrowed books, and errors in maintaining member and inventory data. These challenges reduce productivity and increase administrative workload. A Library Management System aims to automate and streamline these processes by providing an organized platform to manage books, users, and transactions. The system will ensure accurate record-keeping, quick data retrieval, and improved user experience. By applying Object-Oriented Programming (OOP) principles, the system will be modular, scalable, and easy to maintain. It will also support future enhancements such as digital catalogs and automated notifications, making library operations more efficient and reliable.

## Target User

---Primary Users: Librarians or library administrators

Secondary Users: Students, faculty, or general library members

## Core Features

- Add, update, and delete books in the catalog

- Register and manage library members

- Search books by title, author, or category

- Borrow and return books

- Track issued books and due dates

- Maintain transaction history

Basic authentication system for librarian access
- Key Features:

A login interface where the librarian enters a username and password

Credentials are verified against stored data (hardcoded or stored in a file/database)

Access is granted only if the credentials match

Unauthorized users are denied access with an error message
- Working Process:

Librarian enters login credentials

System checks credentials against stored records

If valid → access granted to admin functionalities

If invalid → error message displayed and retry option given

-Security Enhancements:

Password masking during input

Limited login attempts to prevent misuse

Password encryption (basic hashing)

Session-based access control
--

## OOP Concepts Used

- Abstraction:Abstract class LibraryItem defines common attributes like:

ID

Title

Availability

Abstract methods like borrow() and returnItem() provide a blueprint for subclasses.
- Inheritance:Book, Magazine, Journal inherit from LibraryItem

User base class extended by:

Member

Librarian
- Polymorphism:Methods such as:

displayDetails() behave differently for books, journals, etc.

calculateFine() varies based on user type or item type
- Exception Handling:Handles runtime errors such as:

Borrowing unavailable books

Invalid book/member ID

Returning unissued books

Custom exceptions:

BookNotAvailableException

InvalidUserException
- Collections / Threads:
- Collections:

ArrayList / HashMap used to store books, users, and transactions

Threads (optional enhancement):

Background thread for due date reminders or notifications

---

## Proposed Architecture Description

---

## How to Run

---

## Git Discipline Notes
Minimum 10 meaningful commits required.
