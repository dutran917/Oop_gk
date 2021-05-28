/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author MyPC
 */
public class vat {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color cl;
    private Area area;
    public vat(int x, int y, int w, int h,Color color)
    {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.cl = color;
        this.area = new Area(new Rectangle2D.Double(x,y,w,h));
    }
//    public Area ve(Graphics2D g2d)
//    {
////        Graphics2D g2d = (Graphics2D) g;
//        g2d.setColor(this.cl);
//        Area draw = new Area(new Rectangle2D.Double(this.x,this.y,this.width,this.height));
//        return draw;
//    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getCl() {
        return cl;
    }

    public void setCl(Color cl) {
        this.cl = cl;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
}
