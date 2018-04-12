public class main
{
    private Bearded_Dragon myBeardedDragon;
    public static void main()
    {
        new main().driver();
    }
    
    public void driver()
    {
        myBeardedDragon = new Bearded_Dragon("Jar Jar");
        System.out.println(myBeardedDragon.getFarmer());
        System.out.println(myBeardedDragon);
    }
}
