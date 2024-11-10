import java.net.*;

public class UdpEchoServer {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(9876)) {
            byte[] buffer = new byte[1024];
            System.out.println("UDP Echo Server is running on port 9876...");

            while (true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                socket.receive(request);

                String receivedMessage = new String(request.getData(), 0, request.getLength());
                System.out.println("Received: " + receivedMessage);

                // Echo the message back to the client
                DatagramPacket response = new DatagramPacket(
                    request.getData(), request.getLength(),
                    request.getAddress(), request.getPort()
                );
                socket.send(response);
            }
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
