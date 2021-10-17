package com.morfeu;

import com.morfeu.app.Application;
import com.morfeu.factory.BoatTransport;
import com.morfeu.factory.ITransportFactory;

public class Main {

    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;

        factory = new BoatTransport();

        return new Application(factory);
    }

    public static void main(String[] args) {

        var app = configureApplication();
        app.startRoute();
    }
}