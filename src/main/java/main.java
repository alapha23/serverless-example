import org.apache.nemo.offloading.common.ServerlessExecutorProvider;
import org.apache.nemo.offloading.common.ServerlessExecutorService;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class main {
    private static ServerlessExecutorService serverlessExecutorService;
    //

    private static ServerlessExecutorProvider serverlessExecutorProvider;

    private static ConcurrentLinkedQueue<Object> offloadingEventQueue;


    public static void main(String [] args){

        String str = "Hello World";
        System.out.println(str);

        // make a serializerMap
        // crete a cachedpoolserverlessExecutorService obj
        // use newCachedPool to create the obj
        serverlessExecutorService = serverlessExecutorProvider.
                newCachedPool(new WordCountOffloadingTransform(str),
                  new WordCountOffloadingSerializer(str),
                  // output event handler
                  new WordCountServerlessOffloadingEventHandler(offloadingEventQueue));
        // we need event handler


        // obj->execute creates a serverless worker
    }
}
