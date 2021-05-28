/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author MyPC
 */
public class drawdemo extends JPanel{
    private ArrayList<vat> listvat = new ArrayList<vat>();
    private ArrayList<camera> listcam = new ArrayList<camera>();
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.black);
        Graphics2D g2d = (Graphics2D) g;
        vat a1 = new vat(35,45,100,200,Color.CYAN);
        vat a2 = new vat(40,55,120,150,Color.GRAY);
        vat a3 = new vat(120,200,100,100,Color.YELLOW);
        vat a4 = new vat(200,350,200,200,Color.GREEN);
        camera cam1 = new camera(100,100,400,400,Color.white);
        camera cam2 = new camera(200,200,400,400,Color.WHITE);
        listvat.add(a1);
        listvat.add(a2);
        listvat.add(a3);
        listvat.add(a4);
//        Area c1 = new Area(new Rectangle2D.Double(cam1.getX(),cam1.getY(),cam1.getWidth(),cam1.getHeight()));
//        Area c2 = new Area(new Rectangle2D.Double(cam2.getX(),cam2.getY(),cam2.getWidth(),cam2.getHeight()));
        cam1.getArea().add(cam2.getArea());
        Area cam_clone = (Area) cam1.getArea().clone();
        for(vat t: listvat)
        {
            cam1.getArea().subtract(t.getArea());
        }
        g2d.setColor(Color.white);
        g2d.fill(cam1.getArea());
        for(vat t: listvat)
        {
            Area tmp = (Area) t.getArea().clone();
            g2d.setColor(t.getCl());
            tmp.subtract(cam_clone);
            t.getArea().subtract(tmp);
            g2d.fill(t.getArea());
        }

    }
}
