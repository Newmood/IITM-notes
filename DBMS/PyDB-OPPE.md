

### How to open txt file and read:
```Python
a = open('name.txt','r')
name = a.read()
```
In exam, txt will be in same folder, so we dont need to write the path of txt file.

### Connecting database
1. Create connection
2. Create cursor
3. Execute querey
4. Close cursor
5. Close connection

```Python
import psycopg2
import os
import sys

database = 'flis'
user= 'postgres'
password = 'yeayea'
port = '5433'
host = 'localhost'
conn = None

try:
	conn = psycopg2.connect(database=database,user=user,password=password,host=host,port=port)
	print('Database connected succesfully')
except(Exception,psycopg2.DatabaseError) as error:
	print('error')
finally:
	if conn is not None:
		conn.close()
```


### Complete format
```Python
import psycopg2
import os
import sys

#file reading
f=open('player.txt','r')
name = f.read()

#setup (values be given)
database = 'flis'
user= 'postgres'
password = 'yeayea'
port = '5433'
host = 'localhost'
conn = None

#connection
try:
	conn = psycopg2.connect(database=database,user=user,password=password,host=host,port=port)
	print('Database connected succesfully')
	
	cur=conn.cursor()
	cur.execute("write your SQL query here = %s",(name,))

	#format output
	result = cur.fetchall()
	
	for res in result:
		print('res')
	
	cur.close()

except(Exception,psycopg2.DatabaseError) as error:
	print('error')


finally:
	if conn is not None:
		conn.close()
```
