import java.beans.EventHandler;
import org.apache.nemo.conf.EvalConf;
import org.apache.nemo.offloading.common.ServerlessExecutorProvider;
import org.apache.nemo.offloading.common.ServerlessExecutorService;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class main {
    private ServerlessExecutorService serverlessExecutorService;
    private final ConcurrentLinkedQueue<Object> offloadingEventQueue;
    private final Collection<Pair<OperatorMetricCollector, OutputCollector>> burstyOperators;

    private final ExecutorService shutdownExecutor = Executors.newSingleThreadExecutor();
    private final ServerlessExecutorProvider serverlessExecutorProvider;
    private final SerializerManager serializerManager;

    private Map<String, List<String>> sourceAndSinkMap;

//    private List<Pair<OperatorMetricCollector, OutputCollector>> offloadingHead;

    private boolean isStarted = false;
    private boolean finished = false;

    private final ScheduledExecutorService flusher = Executors.newSingleThreadScheduledExecutor();
    private final EvalConf evalConf;


    public static void main(String [] args){

        String str = "Hello World";
        System.out.println(str);
//        OffloadingTransform offloadingTransform;
//        OffloadingSerializer offloadingSerializer;
//        EventHandler eventHandler;
//        OffloadingSerializer<I, O> offloadingSerializer,
    }
}
