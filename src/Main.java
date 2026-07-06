public class Main {
    public static void main(String[] args) {
        Hero thor = new Hero("Thor", 20);
        Hero thanos = new Hero("thanos", 30);
        thor.introduce();
        thanos.introduce();
        thor.attack(thanos);
        System.out.println("thanos HP remaining" + thanos.getHP());
    }
}