package stickmanEx;

import java.awt.*;

public class Steps extends Surface {
    public Graphics stepOne(Graphics g2d) {
        //STEP 1

        // the head
        g2d.drawOval(180, 120, 40, 40);
        // the body
        g2d.drawLine(200, 160, 200, 235);

        // right the hands
        g2d.drawLine(200, 160, 230, 180);
        g2d.drawLine(230, 180, 245, 149);
        // left the hands
        g2d.drawLine(200, 160, 170, 188);
        g2d.drawLine(170, 188, 190, 210);

        // right the legs
        g2d.drawLine(200, 235, 233, 220);
        g2d.drawLine(233, 220, 245, 245);
        g2d.drawLine(245, 245, 255, 240);

        //left the legs
        g2d.drawLine(200, 235, 178, 265);
        g2d.drawLine(178, 265, 150, 242);
        g2d.drawLine(150, 242, 143, 251);

        timeDelay(200); //100ms

        g2d.clearRect(0, 0, 500,500);


        return g2d;
    }


    public Graphics stepTwo(Graphics g2d) {
        //STEP 2

        // the head
        g2d.drawOval(180, 120, 40, 40);
        // the body
        g2d.drawLine(200, 160, 200, 235);

        //        // right the hands
        g2d.drawLine(200, 160, 220, 180);
        g2d.drawLine(220, 180, 240, 160);

        // left the hands
        g2d.drawLine(200, 160, 185, 185);
        g2d.drawLine(185, 185, 215, 198);

        // right the legs
        g2d.drawLine(200, 235, 238, 240);
        g2d.drawLine(238, 240, 260, 258);
        g2d.drawLine(260, 258, 267, 251);

        // left the legs
        g2d.drawLine(200, 235, 170, 258);
        g2d.drawLine(170, 258, 150, 230);
        g2d.drawLine(150, 230, 140, 235);

        timeDelay(200);
        g2d.clearRect(0, 0, 500, 500);


        return g2d;
    }

    public Graphics stepThree(Graphics g2d) {
        //STEP 3

        // the head
        g2d.drawOval(180, 120, 40, 40);
        // the body
        g2d.drawLine(200, 160, 200, 235);

        // hands
        g2d.drawLine(200, 160, 208, 188);
        g2d.drawLine(208, 188, 235, 180);

        // right the legs
        g2d.drawLine(200, 235, 210, 270);
        g2d.drawLine(210, 270, 200, 305);
        g2d.drawLine(200, 305, 210, 305);

        // left the legs
        g2d.drawLine(200, 235, 225, 270);
        g2d.drawLine(225, 270, 180, 278);
        g2d.drawLine(180, 278, 173, 285);

        timeDelay(200);
        g2d.clearRect(0, 0, 500, 500);


        return g2d;
    }

    public Graphics stepFour(Graphics g2d) {
        //STEP 4

        // the head
        g2d.drawOval(180, 120, 40, 40);
        // the body
        g2d.drawLine(200, 160, 200, 235);

        // right the hands
        g2d.drawLine(200, 160, 210, 188);
        g2d.drawLine(210, 188, 235, 160);

        // left the hands
        g2d.drawLine(200, 160, 180, 184);
        g2d.drawLine(180, 184, 200, 200);

        // right the legs
        g2d.drawLine(200, 235, 236, 240);
        g2d.drawLine(236, 240, 215, 280);
        g2d.drawLine(215, 280, 223, 287);

        // left the legs
        g2d.drawLine(200, 235, 190, 270);
        g2d.drawLine(190, 270, 158, 290);
        g2d.drawLine(158, 290, 165, 297);

        timeDelay(200);
        g2d.clearRect(0, 0, 500, 500);


        return g2d;
    }

    public void timeDelay(long t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
        }
    }

}
