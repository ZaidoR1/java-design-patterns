package structural.proxy;

import structural.proxy.image.Image;
import structural.proxy.image.ProxyImage;

/**
 * Created by rek on 22.06.17.
 */
public class App {

    public static void main(String[] args) {
        Image image = new ProxyImage("foobar.jpg");

        // image will be loaded from disc
        image.display();

        // image will not be loaded from disc because its loaded
        image.display();
    }
}
