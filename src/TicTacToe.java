import java.awt.Graphics;

import javax.swing.JApplet;


public class TicTacToe extends JApplet{
    public void paint(Graphics canvas){

        //from side, from top, length, thickness
        //from side, from top, thickness, length

        canvas.drawLine(100, 200, 400, 200);//Top horizontal line
        canvas.drawLine(100, 300, 400, 300);//Bottom horizontal line
        canvas.drawLine(200, 100, 200, 400);//First vertical line
        canvas.drawLine(300, 100, 300, 400);//Second vertical line

        canvas.drawLine(200, 200, 100, 100);
        canvas.drawLine(100, 200, 200, 100);

        canvas.drawLine(300, 200, 200, 100);
        canvas.drawLine(200, 200, 300, 100);

        canvas.drawLine(400, 200, 300, 100);
        canvas.drawLine(300, 200, 400, 100);

        canvas.drawLine(200, 300, 100, 200);
        canvas.drawLine(100, 300, 200, 200);

        canvas.drawLine(400, 400, 300, 300);
        canvas.drawLine(300, 400, 400, 300);

        canvas.drawOval(200, 200, 100, 100);
        canvas.drawOval(300, 200, 100, 100);
        canvas.drawOval(100, 300, 100, 100);
        canvas.drawOval(200, 300, 100, 100);

        canvas.drawLine(400, 150, 100, 150);


    }
}
