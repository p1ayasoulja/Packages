package d4ta;

public class carsh {
    String name;
    int old;
    int stazh;

    carsh(String x, int y, int u) {
        name = x;
        old = y;
        stazh = u;
    }

    carsh() {
        System.out.println("Enter info");
    }

}

class Yadrive extends carsh {
    Yadrive(String x, int y, int u) {
        name = x;
        old = y;
        stazh = u;
    }

    void check() {
        if ((old > 19) && stazh > 2) {
            System.out.println(name + ", lets drive");
        } else System.out.println("U cant rent a car");


    }
}
class deli extends carsh{
int sv;
    deli(String x, int y, int u) {
        name = x;
        old = y;
        stazh = u;
    }

    void check() {
        if ((old > 17) && stazh > 0) {
            System.out.println(name + ", lets drive");
        } else System.out.println("U cant rent a car");


    }
    void style(){
        if(stazh>3){sv=45;
        }
        if(stazh>2){sv=35;
        }
        if(stazh>0){sv=20;
        }
        if(stazh>4){sv=100;
        }
    }
    void styleshow(){
        System.out.println("Ur style is "+sv);
    }
}
