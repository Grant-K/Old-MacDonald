public class Bearded_Dragon extends Animal
{
    private String animalType = "Bearded Dragon";
    private String animalSound = "N/A";
    private String myPetName;
    private Animal myDragon;
    public Bearded_Dragon(String petName)
    {
        myPetName = petName;
    }
    
    public String getType()
    {
        return animalType;
    }
    
    public String getSound()
    {
        return animalSound;
    }
    
    public String toString()
    {
        return "Pet's Name: " + myPetName + "\nAnimal's Type: " + animalType + "\nAnimal's Sound: " + animalSound;
    }
}
