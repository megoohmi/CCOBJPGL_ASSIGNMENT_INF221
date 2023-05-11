public class App {
    public static void main(String[] args) throws Exception {

        Chorkie myDog = new Chorkie();

        myDog.woof();
        System.out.println("He has a " + myDog.coatType + " coat.");
        System.out.println("His name is " + myDog.name + ".");
        System.out.println("He is a " + myDog.age + " fur baby.");
    }
}