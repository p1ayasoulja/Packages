package d4ta;

public class taxi {
    boolean vod;

    taxi(boolean v) {
        vod = v;
    }

    void check() {
        if (vod == true) {
            System.out.println("Welcome 2 taxi!");

        } else System.out.println("No taxi sry");
    }
}
