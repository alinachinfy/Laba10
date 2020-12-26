public class Cat extends Animals {

    public void run(int a) {
        if (a<200)
            { System.out.println("Cat run: true"); }
        else
            { System.out.println("Cat run: false"); } }

    public void swim(int a) {
        if (a<=0)
            { System.out.println("Cat swim: true"); }
        else
            { System.out.println("Cat swim: false"); } }

    public void jump(double a) {
        if (a<2)
            { System.out.println("Cat jump: true"); }
        else
            { System.out.println("Cat jump: false"); } }

}
