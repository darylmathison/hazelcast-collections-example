package hazelcastcollections;

import com.hazelcast.collection.IList;
import com.hazelcast.collection.IQueue;
import com.hazelcast.collection.ISet;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.junit.jupiter.api.Test;

public class HazelcastCollectionsTest {

   @Test
   void testList() {
        HazelcastInstance instance = Hazelcast.newHazelcastInstance();
        HazelcastInstance instance2 = Hazelcast.newHazelcastInstance();
        IList<String> list = instance.getList("list");
        //list.addItemListener(new CollectionItemListener(), true);
        list.add("Once");
        list.add("upon");
        list.add("a");
        list.add("time");

        IList<String> list2 = instance2.getList("list");
        for(String s: list2) {
            System.out.println(s);
        }
        System.exit(0);
    }

    @Test
    public void testQueue() {
        HazelcastInstance instance = Hazelcast.newHazelcastInstance();
        HazelcastInstance instance2 = Hazelcast.newHazelcastInstance();
        IQueue<String> queue = instance.getQueue("queue");
        queue.add("Once");
        queue.add("upon");
        queue.add("a");
        queue.add("time");

        IQueue<String> queue2 = instance2.getQueue("queue");
        for(String s: queue2) {
            System.out.println(s);
        }

    }

    @Test
    void testSet() {
        HazelcastInstance instance = Hazelcast.newHazelcastInstance();
        HazelcastInstance instance2 = Hazelcast.newHazelcastInstance();
        ISet<String> set = instance.getSet("set");
        set.add("Once");
        set.add("upon");
        set.add("a");
        set.add("time");

        ISet<String> set2 = instance2.getSet("set");
        for(String s: set2) {
            System.out.println(s);
        }

        System.exit(0);
    }
}
