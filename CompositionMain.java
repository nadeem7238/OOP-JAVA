

class CompositionMain
{
    public static void main(String[] args)
    {
        Vehicle car = new Vehicle();
        System.out.println("Vehicle Name "+car.getVehicleName());
        System.out.println("Vehicle Model "+car.getVehcileModel());
        System.out.println("Vehicle Egine CC "+car.engine.getCC());
        System.out.println("Vehicle Engine HP "+car.engine.getHP());
        car.engine.setCC(1300);
        System.out.println("Vehicle Engine HP "+car.engine.getCC());
        System.out.println("Current Gear "+car.transmission.getCurrentGear());
        car.transmission.nextGear();
        car.transmission.nextGear();
        System.out.println("Current Gear "+car.transmission.getCurrentGear());
        car.transmission.nextGear();
        car.transmission.nextGear();
        car.transmission.nextGear();
        Tyres tyr = car.getTyreObject();
        System.out.println("Total Tyrs are "+tyr.getTotalTyres());
        tyr.setTotalTyres(10);
        System.out.println("Total Tyrs are "+car.tyre.getTotalTyres());
        /*  Tyres tr = car.getTyreObject();
        System.out.println("Total Tyres "+tr.getTotalTyres());
        tr.setTotalTyres(10);
        car.printTyres();*/
        
       

    }
}
