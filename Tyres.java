 class Tyres {
    private int totalTyres;
    private int tyreSize;

    Tyres() {
        System.out.println("Tyres Attached to vehicle");
        totalTyres = 4;
        tyreSize = 13;
    }

    //////// setter
    public void setTotalTyres(int tyres) {
        this.totalTyres = tyres;
    }

    public void setTyreSize(int size) {
        this.tyreSize = size;
    }
    /////////getter
    public int getTotalTyres()
    {
        return totalTyres;
    }
    public int getTyreSize()
    {
        return this.tyreSize;
    }

}
