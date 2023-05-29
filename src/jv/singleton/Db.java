package jv.singleton;

public class Db {
    private static Db instancia;

    Db() {
    }

    public static Db getInstance() {
        if (instancia == null) {
            instancia = new Db();
        }
        return instancia;
    }
}