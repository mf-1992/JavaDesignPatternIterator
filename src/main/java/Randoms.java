import java.util.Random;
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min, max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(min, max + 1);
            }
        };
    }
}