import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(10);
        int height = rand.nextInt(10);

        actions[0] = new Human("Vasya", distance, height);

        distance = rand.nextInt(10);
        height = rand.nextInt(10);

        actions[1] = new Robot("Din", distance, height);

        distance = rand.nextInt(10);
        height = rand.nextInt(10);

        actions[2] = new Cat("Sam", distance, height);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        {
            int i = 0;
            while (i < barriers.length) {
                distance = rand.nextInt(10);
                isRoad = rand.nextBoolean();
    //

                if (isRoad) {
                    barriers[i] = new Treadmill("Road " + i, distance);
                } else {
                    barriers[i] = new Wall("Wall " + i, distance);
                }
                i++;
            }
        }

        for (Actions action : actions) {
            boolean result = true;
            for (Barrier barrier : barriers) {

                result = barrier.moving(action);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Success!!");
            } else {
                System.out.println("unsuccessfully!!");
            }
        }

   }
}