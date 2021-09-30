package com.morfeu.srp;

/**
 *      SINGLE RESPONSIBILITY PRINCIPLE
 *
 *  Esse principio prega que a classe deve ter uma unica razao para ser alterada/mudada
 */
public class Client {


    public void getClient(){};

    public void createClient(){};

    public void updateClient(){};

    public void deleteClient(){};

    //esse metodo acaba escapando do assunto principal da classe Client entao devemos separar criando uma classe nova chamada Notidy
    //public void notifyClient(){};
}
