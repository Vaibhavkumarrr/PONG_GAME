import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Ball extends Rectangle {
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed=2;
    Ball( int x, int y, int width, int height){
        // we are using super constructor as we are using rectangle
        super(x, y, width, height);
        random= new Random();//    here we are taking 2 as ball moves either left or right direction
        int randomXDirection = random.nextInt(2);// either 0 or 1
        if(randomXDirection== 0){// it means it's going in left direction
            randomXDirection--;//          it is because its starting from zero so it goes to negative
            setXDirection(randomXDirection* initialSpeed);
        }
        int randomYDirection = random.nextInt(2);// either 0 or 1
        if(randomYDirection== 0){// it means it's going in left direction
            randomYDirection--;//          it is because its starting from zero so it goes to negative
            setYDirection(randomYDirection* initialSpeed);
        }
    }
    public void setXDirection(int randomXDirection){
        xVelocity = randomXDirection;
    }
    public void setYDirection(int randomYDirection){
        yVelocity = randomYDirection;
    }
    public void move(){
        x+=xVelocity;
        y+=yVelocity;

    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x,y,width, height);

    }
}
