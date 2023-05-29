package jv.udp;

import javax.swing.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {

    static String server = "localhost";
    static int port = 6789;

    public static void main(String[] args) {

        try (DatagramSocket clientSocket = new DatagramSocket()) {
            int i;
            do {

                InetAddress IPAddress = InetAddress.getByName(server);

                byte[] message;

                String text = JOptionPane.showInputDialog("Digite o texto a ser enviado ao servidor: ");

                message = text.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(message,
                        message.length, IPAddress, port);

                System.out.println("Enviando pacote UDP para " + server + ":" + port);

                clientSocket.send(sendPacket);

                byte[] buffer = new byte[1024];

                DatagramPacket reply = new DatagramPacket(buffer,
                        buffer.length);

                clientSocket.receive(reply);

                System.out.println("Resposta: " + new String(reply.getData()));
                i = JOptionPane.showConfirmDialog(null, "Deseja continuar?",
                        "Sim para continuar\nNão para cancelar",
                        JOptionPane.YES_NO_OPTION);
            } while (i == 0);

        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        } finally {
            System.out.println("Socket cliente fechado!");

        }

    }
}
