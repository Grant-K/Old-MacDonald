public abstract class Animal{
  private String farmer;
  public Animal(){
    farmer = "Old MacDonald";
  }
  
  public Animal(String farmer)
  {
      this.farmer = farmer;
  }

  public abstract String getSound();

  public abstract String getType();
  
  public String getFarmer()
  {
      return farmer;
  }
  
  public void setFarmer(String newFarmer)
  {
      farmer = newFarmer;
  }
  
  public String toString()
  {
      return "Farmer: " + farmer + "\n";
  }
}