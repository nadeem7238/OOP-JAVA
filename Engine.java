class Engine
{
    private int hp;
    private int cc;
    Engine()
    {
        System.out.println("Engine Attached to vehicle");
        this.cc = 796;
        this.hp = 60;
    }
    
    
    public void setHP(int h)
    {
        this.hp = h;
    }
   public  void setCC(int cc)
    {
        this.cc = cc;
    }
   public int getCC()
    {
        return this.cc;
    }
    int getHP()
    {
        return this.hp;
    }
    void changeHPCC(int hp, int cc)
    {
        this.hp = hp;
        this.cc = cc;
    }
}
