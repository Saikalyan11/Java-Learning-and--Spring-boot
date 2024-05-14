package Static_Keyword.staticBlockandmethods;

public class block {
    static String ElectronicBrand;
    int Electronicprice;
    String Electronicname;
    static String quality;

    static {
        ElectronicBrand = "Apple";
        quality = "Quality is the mine thing we focuse";
    }

    public void showoutput() {
        System.out.println(ElectronicBrand + " : " +
                Electronicprice + " : " +
                Electronicname + " : " + quality);
    }

    public static void staticshowoutput(block obj) {
        System.out.println(ElectronicBrand + " : " +
                obj.Electronicprice + " : " +
                obj.Electronicname + " : " + quality);
    }
}
