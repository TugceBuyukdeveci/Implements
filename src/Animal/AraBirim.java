package Animal;

interface Animal{
    public void animalSound();
    public void sleep();

}
class Dog implements Animal{
 public void animalSound()
 {
     System.out.println("köpek diyor: hav hav");
 }
 public void sleep()
    {
        System.out.println("köpek uyuyor: zzzz");
    }
}
class AraYuz{
    public static void main(String[]args)
    {
        Dog k= new Dog();
        k.animalSound();
        k.sleep();
    }
}