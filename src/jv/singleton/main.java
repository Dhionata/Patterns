package jv.singleton;

public class main {
    public static void main(String[] args) {
        Db db = Db.getInstance();
        System.out.println(db.toString());
    }
}
