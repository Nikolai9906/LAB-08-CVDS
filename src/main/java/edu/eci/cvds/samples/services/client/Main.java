package edu.eci.cvds.samples.services.client;

import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquilerFactory;

public class Main {

    public static void main(String[] args) throws ExcepcionServiciosAlquiler{
        System.out.println(ServiciosAlquilerFactory.getInstance().getServiciosAlquiler().consultarCliente(0));
        System.out.println(ServiciosAlquilerFactory.getInstance().getServiciosAlquiler().consultarCostoAlquiler(999,2));
        System.exit(0);
    }

}