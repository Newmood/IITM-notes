# Modern Application Development 1

## Contents
| Week | Topics |
|----|------|
|1. [Week-1](#week-1) |  |
|2. [Week-2](#week-2) |  |

## Week 1
An app has three major components:
- Storage : Store temporary and permanent data as files
- Computation : Performs functions required to by the user
- Presentation : Display the output to user

There are many platforms to make apps for such as Desktop, Mobile, Web-based and Embedded. Each with their own I/O and storage type. Embedded are function specific with limited scope.

### Network architecture:  
1. Client-server :  
2. Peer-to-peer :

### Software architecture
There are many design patterns : MVC, MVA, MVP, MVV, PAC etc. 
This course focuses on MVC architecture. 
- Model: Handles data logic, integrity (connected to database)
- View : User interface, presentation of data to user.
- Controller : Handles business logic to manipulate the data. (brain)

<img src="img/01_MVC.png" width="550">

> User uses **controller** to manipulate **model** that updates the **view** that user sees.

