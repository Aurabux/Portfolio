#Client Assignment 10

#client

import socket

#Object
sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

#server location and message
server_address = ('localhost', 8192)
sock.connect(server_address)
message = input("Type in anything for Quote of the Day: ")

#send
sock.sendall(message.encode('ascii'))
sock.shutdown(socket.SHUT_WR)


#Receive
response = ""
while 1:    
    data = sock.recv(4096)
    if not data:
        break
    response += data.decode('ascii')
print(response)

#Close
sock.close()
input("Press enter to quit")
 
