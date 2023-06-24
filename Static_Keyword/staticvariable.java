package Static_Keyword;

public class staticvariable {
    public static void main(String[] args) {

        demovariable staticvar = new demovariable();
        staticvar.Brand = "Apple";
        staticvar.price = 100000;
        // staticvar.name = "iphone 14pro"; //Can use this also but not recommended
        /////////// or
        demovariable.name = "iphone 14 pro"; // Recommended to use this while using static vari

        System.out.println(staticvar.Brand + " : " + demovariable.name + " : " + staticvar.price);
    }
}