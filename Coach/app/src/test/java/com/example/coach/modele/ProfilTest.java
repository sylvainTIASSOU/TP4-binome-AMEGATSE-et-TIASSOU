package com.example.coach.modele;

import junit.framework.TestCase;

public class ProfilTest extends TestCase {

    //creation profil
    private Profil profil = new Profil(67, 165, 35, 0);
    //resulat IMG
    private float img = (float) 32.2;
    //message
    private String message = "trop élevé";


    public void testGetImg() {
        assertEquals(img, profil.getImg(), (float)0.1);
    }

    public void testGetMessage() {
        assertEquals(message, profil.getMessage());
    }
}