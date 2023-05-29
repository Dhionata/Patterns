package jv.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    static int serverPort = 6789;

    public static void main(String[] args) {

        try {
            ServerSocket listenSocket = new ServerSocket(serverPort);

            System.out.println("Ouvindo na porta: " + serverPort);


            System.out.println("Aguardando conexão ...");
            Socket clientSocket = listenSocket.accept(); //estabeleço conexão

            System.out.println("Conexão estabelecida!");

            //Parte referente a connexão
            DataInput in = new DataInputStream(clientSocket.getInputStream());
            DataOutput out = new DataOutputStream(clientSocket.getOutputStream());

            String data = in.readUTF();

            out.writeUTF(data);
            System.out.println("Msg recebida: " + data);

            clientSocket.close();


        } catch (IOException e) {
            System.out.println("Listen: " + e.getMessage());
        }
    }
}
