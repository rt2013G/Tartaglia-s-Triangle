/**
 * Created by rt2013 on 20/02/2017.
 */

import java.awt.*;

public class TartagliaTriangle {

    public TartagliaTriangle() throws ArrayIndexOutOfBoundsException{
        TriangleGenerator.calculate(30); // Calculate the triangle with a specific number of lines
    }

    public static void main(String... args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    new TartagliaTriangle();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
