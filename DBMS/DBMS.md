Topicwise in order with BSCS2001 : Database Management Systems

Resources to follow along: 
1. KSS:  : Database System Concepts by Korth, Silberschatz, Sudarshan, 6 ed
2. RG: Database Management Systems by Ramakrishnan and Gerhke
3. [CMU DB 15-445/645](https://15445.courses.cs.cmu.edu/fall2022/schedule.html)

#  Contents
1. [Week-wise](#week-wise)
1. [Introduction to DBMS](#introduction-to-dbms)
2. [Relational model and SQL](#relational-model-and-sql)
3. [Database Design](#database-design)
4. [Dependency and Normal Forms](#dependency-and-normal-forms)
5. [Application development](#application-development)
6. [Algorithms and storage](#algorithms-and-storage)
7. [Indexing and Hashing](#indexing-and-hashing)
8. [Transaction and concurrency](#transaction-and-concurrency)
9. [Optimization](#optimization)

## Week-wise
| Week | Topic | Reading | Videos | Extra | 
| ----|--------|---------|--------|-------|
| 1 | Introduction to DBMS | - | - | - |
| 2 | Relational Model and SQL | - | - | - |
| 3 | More SQL | - | - | - |
| 4 | Formal relational query languages & ER Model | - | - | - |
| 5 | Database Design | - | - | - | 
| 6 | Dependency and Normal Forms | - | - | - |
| 7 | Application Development | - | - | - | 
| 8 | Algorithms & Storage | - | - | - |
| 9 | Indexing & Hashing | - | - | - |
| 10 | Transaction management | - | - | - |
| 11 | Backup and recovery | - | - | - | 
| 12 | Query Processing Optimization | - | - | - |

## Introduction to DBMS
- Quick review: [CMU DB Notes Lecture 1](https://15445.courses.cs.cmu.edu/fall2022/notes/01-introduction.pdf)
- Reading: KSS Chapter 1, RG Chapter 1

Introducing to database management system, how it developed over the years and its advantages over flat file system. The three levels of data abstraction: Physical, Logical, View and physical data independence. Then we look at data models: relational, ER, Object-based, semi-structured models. Data languages are introduced : DDL and DML (SQL can be used for both). Approaches to database design: ER Model and Normalisation theory (we look at both later in detail). The three parts of a database engine: Sotrage manager, Query processor, Transaction manager. Closing with database architecture : centralised, client server, parallel, distributed, cloud.

## Relational model and SQL
#### SQL
- Quick review: [CMU DB Notes Lecture 2](https://15445.courses.cs.cmu.edu/fall2022/notes/02-modernsql.pdf)
- Reading: KSS Chapter 2,3,4,5
#### Relational Algebra, TRC, DRC
- Reading: KSS Chapter 6; RG Chapter 4

Database Schema and Instance; Keys: Superkey, Candidate key, Primary key, Surrogate key, Secondary/Atlernate key, Simple key, Composite key, Foreign key ; Relational query languages: declarative, procedural ; Relational operators ; Domain types ; Intergrity constraints, Triggers.  And of course, a lot of SQL.

## Database Design
- Reading: KSS Chapter 7, RG Chapter 2

## Dependency and Normal Forms
- Reading: KSS Chapter 8; RG Chapter 15

## Application development
- Reading: KSS Chapter 9

## Algorithms and storage
- Reading: KSS Chapter 10

## Indexing and Hashing
- Reading: KSS Chapter 11

## Transaction and concurrency
- Reading: KSS Chapter 14, 15; RG Chapter 18,19

## Optimization
- Reading: KSS Chapter 12, 13; RG Chapter 13,14
