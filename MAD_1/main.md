# Modern Application Development 1

A list of resources:
- Link to all screencasts in the course: [click here](https://thejeshgn.com/projects/modern-application-development-1/)
- [Internetting is Hard](https://internetingishard.netlify.app/)
- [High performance Browser Networking](https://hpbn.co/)
- [MDN docs](https://developer.mozilla.org/en-US/)
- [Scrimba courses](https://v2.scrimba.com/courses)

# Contents
| Content | Topics |
|----|------|
| [Week-1](#week-1) | Architecture, Protocols, HTTP requests, Web performance <br> <ol> <li>[Tutorial 1.1 : Replit for MAD1](https://youtu.be/tWA2FT4i4cY)</li> <li>Screencast 1.1  Serve HTML files on LAN </li></ol> |
| [Week-2](#week-2) | HTML, CSS |


# Week 1
An app has three major components:
- Storage : Store temporary and permanent data as files
- Computation : Performs functions required to by the user
- Presentation : Display the output to user

There are many platforms to make apps for such as Desktop, Mobile, Web-based and Embedded. Each with their own I/O and storage type. Embedded are function specific with limited scope.

## 1.1. Network architecture:  
1. Client-server :  
    -
    - Well defined client and server applications, a server receives, processes, computes and responds back to the client. 
    - Clients are end users requesting data from server. (Note that client and server can as well be in same system, for a local network.)
    - Could be multiple servers, single queue, mutiple queues, load balancing frontend. 
    - Example : Email, databses, FTP, streaming sites.
2. Peer-to-peer/ Distributed  
    - 
    - Each application acts as both client and server. It sends and receives requests, respond if able to or forward to another peer.
    - More fault tolerant
    - Information/ data is shared among peers.
    - Examples: BitTorrent, Tahoe, Blockchain systems

## 1.2. Software architecture
There are many design patterns : MVC, MVA, MVP, MVV, PAC etc. 
This course focuses on MVC architecture. 
- Model: Handles data logic, integrity (connected to database)
- View : User interface, presentation of data to user.
- Controller : Handles business logic to manipulate the data. (brain)

<img src="img/01_MVC.png" width="550">

> User uses **controller** to manipulate **model** that updates the **view** that user sees.

## 1.3. How does the web work
**Packet switching:** Packets of digital information comprising some nuber of bytes are carried through the network somewhat independently. These chunks may come from different sources can be multiplexed (mixed together and pulled apart later). When a packet reaches a switch it is stored in a temp memory queue and prcessed as FIFO basis.

Advanced Research Projects Agency Network  (**ARPANET**, 1969) is the first wide area packet-swtiched network to implement the TCP/IP suite, which is the technical foundation of Internet.

Web 1.0 
: Read only web, static HTML documents. Minimal styling with inline CSS. Very minimal interactive elements..

Web 1.1 
: Dynamic content genration (introduction to srver side scripting using CGI, PHP, ASP), database integration, HTTP/1.0 standardized request-response communication with each request requiring new communication, increased interactivity.

Web 2.0 (2004 - present)
: Adoption of HTTP/1.1 and later HTTP/2, client side scripting (JS) and asynchronous communication (AJAX), rich UI-UX, dynamic content (AJAX, Websockets), significant API usage (RESTful APIs).

TCP/IP protocol suite (1980s) consists of 5 layers (compared to 7 in OSI model) specifying how end-to-end data communication should occur.
- **Internet Protocol, IP  :** A  connectionless network layer protocol. It does addressing (assigning IP addresses to devices), routing (determinins path for data packets), fragmentation and reassmbly of packets, encapsulation (encapsulating data into packets.)
 - **Transmission Control Protocol, TCP :**  Connection oriented transport layer protocol, deals with flow control, errors (such as packet loss, acknowledge received packets), duplication, packet reordering (if not done by IP layer). It does not preserve message boundaries.
 - **User Datagram Protocol, UDP :** Connectionless network layer protocol, preserves message boundaries, allows to send datagram but does not guarantee receiving at other end, hence reliability is handled by application layer. UDP provides port numbers for multiplexing and demultiplexing and integrity checksums.

Port numbers
: Port numbers are 16-bit non-negative integers, 0-65535, used to distinguish between applications on a device, ensuring proper routing.

IPv4
: The 4th version of IP, uses 32 bit addresses in the form `x1.x2.x3.x4` where `xi`ranges from 0 to 255. Cnnot start with 0 or 255.

IPv6
: The 6th version of IP, uses 128 bit address, 8 groups of hexadecimal chars separated by colons. Can be shortened by omitting leading zeros and keeping just `::`.




## 1.4. Web server and requests
A web server is a system that processes HTTP requests and serves web content to clients over internet. HTTP (Hypertext Transfer Protocol) is an application-layer protocol used for transmitting hypermedia documents, such as HTML. It defines how messages are formatted and transmitted between clients and servers.

Example of a simple web server, write the following in a file name it `server.sh`:  
```sh  
#!/bin/bash

while true; do
	echo -e "HTTP/1.1 200 OK\n\n $(date)" |
		nc -l localhost 1500;
done 
```
Run the following commands one by one:
1. Run the server : `bash server.sh`  
2. This sends a custom request to the server we created above : `$ curl http://localhost:1500`  
3. To be more verbose :  `$ curl -v http://localhost:1500`

Typical request looks like the following:
```
GET / HTTP/1.1
Host: localhost:1500
User-Agent: curl/7.64.1
Accept: */* 
```
The `*/*` means it accepts MIME type (Multipurpose Internet Mail extension)

Typical response looks like:
```
*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 1500 (#0)
> GET / HTTP/1.1
> Host: localhost:1500
> User-Agent: curl/7.64.1
> Accept: */*
>
< HTTP/1.1 200 OK
* no chunk, no close, no size. Assume close to signal end
<
 Thu Jun 17 08:14:55 IST 2021
 ```
Status codes are issues are indicative of how the request was handled.

## 1.5. Protocols, GET ,POST
Protocol
: A protocol is a set of rules governing communication, ensuring proper formatting, transmission and reception.

HTTP (Hypertext Transfer Protocol) is an application-layer protocol used for transmitting hypermedia documents, such as HTML. It is stateless, each request is independent. (make stateful by use of cookies/client session ID/token authenticatoin).
- GET: simple requests, search queries etc.
- POST: submit complex form of data, files etc.
- PUT: Update existing data. (more use in Web2.0)
- DELETE: Remove data. (more use in Web2.0)

## 1.6. Website performance
### Latency :  
Latency is the time taken for data to pass from one point to another on a network. It is often measured as time taken to transfer data between client and data center.

- Speed of light in cables ~ 2e8 m/s.  
- For a data center 2000km away, time taken for a one way request : 2000*1000/2e8 = 0.01s = 10ms (Latency).
- Round trip time (RTT) = 2* One-way Latency = 20ms in this case.
- This limits to communication maximum of 50 requests a second.

### Response size :
This refers to the amount of data being transmitted back and forth between two points.  

**Bandwidth** : Amount of ata that can be transmitted per unit time. (Mbps)

$$\text{Total transfer time} = \text{Round trip time} + \dfrac{\text{Response size in bits}}{\text{Bandwidth in bits per second}}$$

> **Example:**  
Continuing with previous example, suppose bandwidth is 10 Mbps and response size is 100 KB (kilobyte) = 800 Kb (kilobits).  
Then, Total time = RTT + Time for response = $20ms + \dfrac{800*1024}{10*10^6}\times 1000 ms = 20ms + 81ms = 101 \text{ms}$.  
So, in total we can handle, $\dfrac{1}{101} \times 1000 = 9.9 \approx 10$ requests a second.

Resource management is very necessary when working with large amounts of data to transfer and scaling to meet requirements.

## 1.7. Extra Reading & Material
1. Light read chapter 1 from [Book] : _TCP/IP Illustrated, Volume 1 by W. Richard Stevens_
2. Read about [HTTP in Launch School book](https://launchschool.com/books/http/read/making_requests#httpheaders)
3. Watch the video : [How the Internet Works for Developers by LearnCode.Academy](https://youtu.be/e4S8zfLdLgQ)


# Week 2
