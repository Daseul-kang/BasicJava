package chapter19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    Socket socket;
    DataInputStream inputStream;
    DataOutputStream outputStream;
    String nickname;

    public void connect() {
        try {
            this.socket = new Socket("192.168.0.37", 50001);
            this.inputStream = new DataInputStream(socket.getInputStream());
            this.outputStream = new DataOutputStream(socket.getOutputStream());
            System.out.println("[클라이언트] 서버에 연결 됨");
        } catch (IOException e) {
            System.out.println("[클라이언트] 서버 연결 안 됨");
        }
    }

    public void disconnect() {
        try {
            this.socket.close();
        } catch (IOException e) {
            System.out.println("[클라이언트] 소켓 오류");
        }
    }

    public void send(String message) {
        try {
            this.outputStream.writeUTF(message);
            this.outputStream.flush();
        } catch (IOException e) {
            System.out.println("[클라이언트] 데이터 전송 오류");
        }
    }

    // receive 스레드 만들어야 됨 , 사실 send도 만드는 게 좋다 (동시에 처리)
    public void receive() {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    String receivedMessage = this.inputStream.readUTF();
                    System.out.println(receivedMessage);
                } catch (IOException e) {
                    System.out.println("[클라이언트] 서버 연결 끊김");
                    System.exit(0);
                }
            }
        });
        thread.start();
    }

    public static void main(String[] args) {
        ChatClient client = new ChatClient();
        client.connect();

        Scanner scanner = new Scanner(System.in);
        System.out.print("대화명 입력: ");
        client.nickname = scanner.nextLine();

        client.send("!!" + client.nickname);

        // 서버로부터 전송된 데이터를 처리
        // 내부적으로 스레드로 처리해야 된다고 함
        client.receive();

        System.out.println("----------------------------------");
        System.out.println("보낼 메세지를 입력하고 Enter");
        System.out.println("채팅을 종료하려면 q를 입력하고 Enter");
        System.out.println("----------------------------------");

        while (true) {
            String message = scanner.nextLine();
            if (message.equalsIgnoreCase("q")) {
                scanner.close();
                client.disconnect();
                break;
//                System.exit(0);
            } else {
                client.send(client.nickname + ": " + message);
            }
        }
    }
}


