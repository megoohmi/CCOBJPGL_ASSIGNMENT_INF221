public class App {
    public static void main(String[] args) {

        Cat myCat = new Ragamuffin();

        myCat.meow();
        System.out.println("Her name is " + myCat.name + "!");
        System.out.println("She has " + myCat.eyeColor + " eyes!");
    }
}