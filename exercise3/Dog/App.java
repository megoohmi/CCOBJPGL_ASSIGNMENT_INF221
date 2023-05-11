public class App {
    public static void main(String[] args) throws Exception {

        Chorkie myPet = new Chorkie();

        myPet.woof();
        System.out.println("He has a " + myPet.coatType + " coat.");
        System.out.println("His name is " + myPet.name + ".");
        System.out.println("He is a " + myPet.age + " fur baby.");
    }
}
