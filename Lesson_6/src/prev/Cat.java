package prev;

public class Cat  extends Animal{
    public double jumpDistance = 2;
    public int runDistance = 200;

    @Override
    public void jump(double distance) {
        boolean isSwim = distance <= jumpDistance;
        System.out.println("Cat result jump:" + isSwim);
    }

    @Override
    public void run(int distance) {
        boolean isRun = distance <= runDistance;
        System.out.println("Cat result run:" + isRun);
    }
}
