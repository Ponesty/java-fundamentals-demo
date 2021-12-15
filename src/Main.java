public class Main {
    public static void main(String[] args) {
        Droid R2 = new Droid("R2D2", ModelFactory.getModel(1), "Starship repair/support");
        Droid B1 = new Droid("B1", ModelFactory.getModel(3), "Combat");
        System.out.println(R2.getPurpose());
        System.out.println(R2.speak());
        System.out.println(R2.toString());
        System.out.println(R2.getType());

    }
}
