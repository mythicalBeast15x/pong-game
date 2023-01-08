package Practices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Window extends JFrame implements Runnable{
    Graphics2D g2;
    KListener keyListner = new KListener();
    public Window(){
        this.setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        this.setTitle(Constants.SCREEN_TITLE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        //opens in the center of the screen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(keyListner);
        g2 = (Graphics2D)this.getGraphics();
    }
    public void update(double dt){
//        System.out.println("" + dt + " seconds elapsed since last frame");
//        System.out.println("" + 1/dt + "frames per second");

        //sets background color
        this.getContentPane().setBackground(Constants.BACKGROUND_COLOR);
        //Draws Scoreboard Background
        g2.setColor(new Color(20,20,20, 130));
        g2.fillRect(Constants.SCREEN_WIDTH/2-Constants.SCOREBOARD_WIDTH/2, Constants.SCOREBOARD_HEIGHT-((Constants.SCOREBOARD_HEIGHT/10)*3), Constants.SCOREBOARD_WIDTH, Constants.SCOREBOARD_HEIGHT);
        //Draws Line
        g2.setColor(Color.WHITE);
        g2.drawLine(Constants.SCREEN_WIDTH/2, 0,Constants.SCREEN_WIDTH/2, Constants.SCREEN_HEIGHT);
        //g2.drawLine(0, Constants.SCREEN_HEIGHT/2,Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT/2);  //Horizontal Line (Center)

        //Pong Ball
        g2.fillOval(450-(Constants.PONG_SIZE/2),300-(Constants.PONG_SIZE/2), Constants.PONG_SIZE,Constants.PONG_SIZE);

        if(keyListner.isKeyPressed(KeyEvent.VK_UP)){

        }

    }
    public void run(){
        double lastFrameTime = 0.0;
        while(true){
            double time = Time.getTime();
            double deltaTime = time-lastFrameTime;
            lastFrameTime = time;

            update(deltaTime);

            // to cap FPS at 30
            try{
                Thread.sleep(30);
            }catch (Exception e){

            }

        }
    }
}
