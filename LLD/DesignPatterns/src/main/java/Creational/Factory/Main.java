package Creational.Factory;

public class Main {

    public static void main(String[] args) {
        String modeOfTransport = "Road";
        // Here based on mode of transport from multiple If else you can directly select class here,
        // but that should not be the task of this, here just mode will be specified and a factory helper class
        // provides you class

        Logistics logistics = LogisticsFactory.getLogistics(modeOfTransport);

        logistics.transport(); // transports via mode we have selected
    }
}
