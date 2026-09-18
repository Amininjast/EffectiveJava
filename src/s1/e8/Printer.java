package s1.e8;

public class Printer implements WifiConnectable{
    @Override
    public void connectToWifi() {
        System.out.println("Printer Connected to the Wifi");
    }
}
