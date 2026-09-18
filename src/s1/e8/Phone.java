package s1.e8;

public class Phone implements WifiConnectable{
    @Override
    public void connectToWifi() {
        System.out.println("Phone Connected to Wifi");
    }
}
