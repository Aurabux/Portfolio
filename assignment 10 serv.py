#Server
import socket

#Object
sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


#Bind
bound_address = (' ', 8192)
sock.bind(bound_address)

#Listen
sock.listen(5)

#Accept
while 1:
    client_conn, client_addr = sock.accept()
    print("Received connection from:", client_addr)
    #recv
    message = ""
    while 1:
        data = client_conn.recv(4096)
        if not data:
            break
        message += data.decode('ascii')
    #send
    reply = "Winter is comming"
    client_conn.send(reply.encode('ascii'))
    
    #close
    client_conn.close()
    
sock.close()
