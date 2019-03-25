import org.apache.nemo.offloading.common.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentLinkedQueue;

public class WordCountServerlessOffloadingEventHandler implements EventHandler<String> {
    private static final Logger LOG = LoggerFactory.getLogger(WordCountServerlessOffloadingEventHandler.class.getName());

    private final ConcurrentLinkedQueue<Object> offloadingQueue;

    public WordCountServerlessOffloadingEventHandler(final ConcurrentLinkedQueue<Object> offloadingQueue) {
        this.offloadingQueue = offloadingQueue;
    }

    @Override
    public void onNext(String msg) {
        LOG.info("Result received: cnt {}", msg);
        offloadingQueue.add(msg);
    }
}
