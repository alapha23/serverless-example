import org.apache.nemo.offloading.common.OffloadingDecoder;
import org.apache.nemo.offloading.common.OffloadingEncoder;
import org.apache.nemo.offloading.common.OffloadingSerializer;

import java.util.Map;

public class WordCountOffloadingSerializer implements OffloadingSerializer<String, String> {
    private final OffloadingDecoder inputDecoder;
    private final OffloadingEncoder outputEncoder;
    private final OffloadingDecoder outputDecoder;

    public WordCountOffloadingSerializer(final String inputStr) {
        this.inputDecoder = new WordCountOffloadingInputDecoder(inputStr);
        this.outputEncoder = new WordCountOffloadingOutputEncoder(inputStr);
        this.outputDecoder = new WordCountOffloadingOutputDecoder(inputStr);
    }

    @Override
    public OffloadingEncoder getInputEncoder() {
        return null;
    }

    @Override
    public OffloadingDecoder getInputDecoder() {
        return inputDecoder;
    }

    @Override
    public OffloadingEncoder getOutputEncoder() {
        return outputEncoder;
    }

    @Override
    public OffloadingDecoder getOutputDecoder() {
        return outputDecoder;
    }
}
