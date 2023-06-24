package Encapsulation;

public class main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setId(20);
        human.setName("Kalyan");
        human.setDesc("this is called as encapsulation");

        System.out.println(human.getId() + " " + human.getName() + " " + human.getDesc());
    }
}
