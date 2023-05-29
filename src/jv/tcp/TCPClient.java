package jv.tcp;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

    static String server = "localhost";
    static int serverPort = 6789;

    public static void main(String[] args) {

        Socket clientSocket;

        try {
            System.out.println("Conectando ao servidor " + server + ":" + serverPort);

            clientSocket = new Socket(server, serverPort);

            DataInputStream in = new DataInputStream(clientSocket.getInputStream());

            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            String msg = JOptionPane.showInputDialog("Digite a mensagem: ");

            out.writeUTF(msg + "\n");

            String data = in.readUTF();

            System.out.println("Recebido do servidor: " + data);

            clientSocket.close();

        } catch (UnknownHostException e) {
            System.out.println("Sock: " + e.getMessage());
        } catch (EOFException e) {
            System.out.println("EOF: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }
}
