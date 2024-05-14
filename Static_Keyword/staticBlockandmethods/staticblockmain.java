package Static_Keyword.staticBlockandmethods;

public class staticblockmain {
    public static void main(String[] args) {
        block b = new block();
        b.Electronicname = "Macbook Air M1 chip";
        b.Electronicprice = 150000;
        b.showoutput();
        b.staticshowoutput(b);

    }
}
