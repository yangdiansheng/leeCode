package delayqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Content implements Delayed {

    long delaytime;
    int i;

    public Content(int i, long delayTime) {
        this.i = i;
        this.delaytime = delayTime + System.currentTimeMillis();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(delaytime - System.currentTimeMillis(),TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS)) {
            return 1;
        } else if (this.getDelay(TimeUnit.MILLISECONDS) < o.getDelay(TimeUnit.MILLISECONDS)) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Content{" +
                "delaytime=" + delaytime +
                ", i=" + i +
                '}';
    }
}
