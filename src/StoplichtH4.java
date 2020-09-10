import java.awt.*;
import java.applet.*;

public class StoplichtH4 extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            setBackground(Color.white);
            g.setColor(Color.BLACK);
            g.fillRoundRect(50, 50, 80, 170, 20, 20);
            g.setColor(Color.RED);
            g.fillArc(67,60,45,45, 360, 360);
            g.setColor(Color.ORANGE);
            g.fillArc(67,110,45,45, 360, 360);
            g.setColor(Color.GREEN);
            g.fillArc(67,160,45,45, 360, 360);
            g.setColor(Color.black);
    }
}