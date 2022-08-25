package pocket;
class Deli{
    int old;
    String name;
    Deli(String o,int a){
        name =o;
        old=a;
    }
    void show(){
        if(old<18){
            System.out.println(name +", u r too young!");
        }
        else System.out.println(name+ ", ur car is ready");
    }
}
