package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException {
        DesiredCapabilities d= new DesiredCapabilities();
        d.setCapability(MobileCapabilityType.DEVICE_NAME,"demo");
        d.setCapability(MobileCapabilityType.APP,"Appium\\app-debug.apk");
        AndroidDriver ad= new AndroidDriver(new URL("http://192.168.231:4723/wd/hub"),d);


    }
}