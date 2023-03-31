package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        
        Voiture voiture = new Voiture();

        voiture.setMarque("Mercedes");
        voiture.setPrix(35000);

        Assert.notNull(voiture,"La voiture ne peut pas être NULL");
        Assert.notNull(voiture.getMarque(),"La marque ne doit pas être NULL");
        Assert.isTrue(voiture.getPrix()>0,"Le prix doit être supérieur à 0");
        
    }

}
