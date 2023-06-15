package classes;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
    //Atributos

    private Color Color;
    private int posX;
    private int posY;
    private int speedX;
    private int speedY;

    //Construtor
    public Shape(Color color, int posX, int posY){
       // this.g=g;
        this.Color =color;
        this.posX=posX;
        this.posY=posY;
        this.speedX=2;
        this.speedY=2;
    }


    //Metodos específicos

    public void move(){
        this.posX+=this.speedX;
        this.posY+=this.speedY;

    }
    // Métodos Abstratos
    public abstract void draw(Graphics g);
    public abstract void changeDir(int limXmin, int limXmax,int limYmin, int limYmax);

    public void move (int speed){
        this.setSpeedX(speed);
        this.setSpeedY(speed);
        this.move();
    }

    public Color colorGenerate(){
        int r,g,b;
        Random rand = new Random();

        r = rand.nextInt(255);
        g = rand.nextInt(255);
        b = rand.nextInt(255);

        return new Color(r,g,b);

    }


    //Metodos de acesso


    public Color getColor() {
        return Color;
    }

    public void setColor(Color color) {
        this.Color = color;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }
}
