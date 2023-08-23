package chapter08.multiinterface;

public class MultiInterfaceExample {
    public static void main(String[] args) {
        Remotecontrol rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();
        Searchable searchable = new SmartTelevision();
        searchable.search("http://youtube.com");
    }
}
