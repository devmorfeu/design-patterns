package com.morfeu.transmission;

import com.morfeu.plataform.IPlataform;

public class AdvancedLive extends Live{

    public AdvancedLive(IPlataform plataform) {
        super(plataform);
    }

    public void subTitles() {
        System.out.println("LEGENDAS ATIVADAS NA TRANSMISSAO");
    }

    public void comments() {
        System.out.println("COMENTARIOS LIBERADOS NA LIVE");
    }
}
