import delayqueue.Content;
import delayqueue.TimeUtils;

import java.util.concurrent.DelayQueue;

public class Main {
    public static void main(String[] args) {
        DelayQueue<Content> delayQueue = new DelayQueue<>();
        for (int i = 0; i < 30; i++) {
            delayQueue.add(new Content(i, i * 3000));
        }
        System.out.println("delayQueue=" + delayQueue);
        while (delayQueue.size() != 0){
            Content content = null;
            try {
                content = delayQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (content != null) {
                TimeUtils.currentTime();
                System.out.println("content=" + content.toString());
            }
        }
    }
}
