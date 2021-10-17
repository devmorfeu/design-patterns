package com.morfeu;

public class Main {

    private static Transport transport;

    public static void main(String[] args) {

        configure(args[0]);
        if (transport != null) {
            runTransport();
        }

    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {

        switch (type) {
            case "uber" :
                transport = new CarTransport();
                break;
            case "log" :
                transport = new MotorcycleTransport();
                break;
            case "bike" :
                transport = new BicycleTransport();
                break;
            default :
                System.out.println("SELECIONE O TIPO DE ENTREGA");
        }
    }
}
