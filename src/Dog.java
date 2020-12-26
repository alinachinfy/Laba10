public class Dog extends Animals {

    public void run(int a) {
        if (a<500)
            { System.out.println("Dog tun: true"); }
        else
            { System.out.println("Dog run: false"); } }

    public void swim(int a) {
        if (a<10)
            { System.out.println("Dog swim: true"); }
        else
            { System.out.println("Dog swim: false"); } }

    public void jump(double a) {
        if (a<0.5)
            { System.out.println("Dog jump: true"); }
        else
            { System.out.println("Dog jump: false"); } }

}
