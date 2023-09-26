class Transmission {
    private String transType;
    private int totalGears;
    private int currentGear;

    Transmission() {
        this.transType = "Manual";
        this.totalGears = 4;
        currentGear = 0;
        System.out.println("Transmission attached to vehicle");
    }

    public void setTransType(String ttype) {
        this.transType = ttype;
    }

    public void setTotalGears(int gears) {
        this.totalGears = gears;
    }

    public void setCurrentGear(int gear) {
        this.currentGear = gear;
    }

    //// Getter
    public String getTransmissionType() {
        return this.transType;
    }

    public int getTotalGears() {
        return this.totalGears;
    }

    public int getCurrentGear() {
        return this.currentGear;
    }

    ////////////// Methods///////////////
    public void nextGear() {
        if (this.currentGear < this.totalGears) {
            this.currentGear = this.currentGear + 1;
        } else {
            System.out.println("You are alrady in the highest gear");
        }
    }

    public void previousGear() {
        if (this.currentGear > 0) {
            this.currentGear = this.currentGear - 1;
        } else {
            System.out.println("Your vehicle is in Nuetral Gear");
        }
    }

}
