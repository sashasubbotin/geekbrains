package prev;

public class Dog extends Animal {
    public double jumpDistance = 0.5;
    public int runDistance = 500;
    public int swimDistance = 10;


    public void run(int distance) {
        boolean isSwim = distance <= runDistance;
        System.out.println("Dog result jump:" + isSwim);
    }

    @Override
    public void jump(double distance) {
        boolean isSwim = distance <= jumpDistance;
        System.out.println("Dog result jump:" + isSwim);
    }

    @Override
    public void swim(int distance) {
        boolean isSwim = distance <= swimDistance;
        System.out.println("Dog result jump:" + isSwim);;
    }
}
