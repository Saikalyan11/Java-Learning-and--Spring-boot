package Arrays;

public class Arrayofobject {
    public static void main(String[] args) {
        ObjectArray obj1 = new ObjectArray(1, "Sai", 95.5);
        ObjectArray obj2 = new ObjectArray(1, "Kalyan", 98.2);
        ObjectArray obj3 = new ObjectArray(1, "chittibabu", 88.5);

        ObjectArray obj[] = new ObjectArray[3];
        obj[0] = obj1;
        obj[1] = obj2;
        obj[2] = obj3;

        // enhanced for loop
        for (ObjectArray n : obj)
            System.out.println(n.name + " : " + n.marks);
    }
}
