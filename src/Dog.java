public class Dog
{
  private String name;
  private String breed;
  private String favToy;
  private int age;
  private int goodBoyScale;

  public Dog(String name, String breed, String favToy, int age,
      int goodBoyScale)
  {
    this.name = name;
    this.breed = breed;
    this.favToy = favToy;
    this.age = age;
    this.goodBoyScale = goodBoyScale;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getBreed()
  {
    return breed;
  }

  public void setBreed(String breed)
  {
    this.breed = breed;
  }

  public String getFavToy()
  {
    return favToy;
  }

  public void setFavToy(String favToy)
  {
    this.favToy = favToy;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public int getGoodBoyScale()
  {
    return goodBoyScale;
  }

  public void setGoodBoyScale(int goodBoyScale)
  {
    this.goodBoyScale = goodBoyScale;
  }
}
