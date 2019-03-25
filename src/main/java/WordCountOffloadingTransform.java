import org.apache.nemo.offloading.common.OffloadingOutputCollector;
import org.apache.nemo.offloading.common.OffloadingSerializer;
import org.apache.nemo.offloading.common.OffloadingTransform;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class WordCountOffloadingTransform implements OffloadingTransform<String, String> {
    private final String str;
    private static final Logger LOG = LoggerFactory.getLogger(WordCountOffloadingTransform.class.getName());

    public WordCountOffloadingTransform(String s) {
        this.str = s;
    }

    /**
     * Prepare the transform.
     * @param context of the transform.
     * @param outputCollector that collects outputs.
     */
    @Override
    public void prepare(final OffloadingContext context, OffloadingOutputCollector<String> outputCollector) {
        LOG.info("Transform prepare");

    }


    /**
     * On data received.
     * @param element data received.
     */
    @Override
    public void onData(String element) {
        LOG.info("Transform onData");
    }

    /**
     * Close the transform.
     */
    @Override
    public void close() {
        LOG.info("Transform closed\n");
    }
}
