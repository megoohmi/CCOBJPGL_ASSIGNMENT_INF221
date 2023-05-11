public class App {
    public static void main(String[] args) throws Exception {

        Pet myPet = new Pet();

        myPet.meow();
        System.out.println("Her name is " + myPet.name + ".");
        System.out.println("This little missy has a " + myPet.coatColor + "coat.");
        System.out.println("She has " + myPet.eyeColor + "eyes!");
    }
}