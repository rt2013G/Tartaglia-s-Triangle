/**
 * Created by rt2013 on 20/02/2017.
 */

import java.awt.*;

public class TartagliaTriangle {
    private Scanner s;

    public TartagliaTriangle() throws Exception{
        s = new Scanner(System.in);
        
        TriangleGenerator.calculate(s.nextInt()); // Calculate the triangle with a specific number of lines
    }

    public static void main(String... args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    new TartagliaTriangle();
                }catch(Exception e){
                    if(e instanceof InputMismatchException) System.err.println("Please insert an integer");
                    else e.printStackTrace();
                }
            }
        });
    }
}
