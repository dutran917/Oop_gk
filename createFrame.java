/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import javax.swing.*;

/**
 *
 * @author MyPC
 */
public class createFrame extends JFrame {
    drawdemo g2 = new drawdemo();
    public createFrame()
    {
        this.setSize(1000, 1000);
        this.setTitle("Camera");
        this.setLocationRelativeTo(null);
        this.add(g2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
