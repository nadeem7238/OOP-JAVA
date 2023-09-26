class Vehicle {
    private String name;
    private int model;
    public Tyres tyre;
    public Transmission transmission;
    public Engine engine;

    Vehicle() {
        this.name = "Mehran";
        this.model = 2011;
        tyre = new Tyres();
        transmission = new Transmission();
        engine = new Engine();
        System.out.println("Vechile Created");
    }

    //////// setter
    public void setVehicleName(String name) {
        this.name = name;
    }

    public void setVehicleModel(int model) {
        this.model = model;
    }

    ////// getter
    public String getVehicleName() {
        return this.name;
    }

    public int  getVehcileModel()
    {
        return this.model;
    }

    public Tyres getTyreObject()
    {
        return this.tyre;
    }

    public void printTyres()
    {
        System.out.println("Total tyres to this vehicle "+tyre.getTotalTyres());
    }

}
