import java.awt.*;
public class AWT extends Frame {
    AWT() {
        Button b = new Button();
        b.setLabel("Click1");
        b.setBounds(10, 10, 50, 30);
        add(b, BorderLayout.NORTH);

        Button c = new Button("Click2");
        c.setBounds(40, 30, 50, 30);
        add(c, BorderLayout.SOUTH);

        setSize(200, 200);
        setVisible(true);

            }
        };
    }

    public static void main(String[] args) {
        new AWT();
    }
}
