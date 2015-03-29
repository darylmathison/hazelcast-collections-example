/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hazelcastcollections.iqueue;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IQueue;

/**
 *
 * @author Daryl
 */
public class HazelcastIQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        
        System.exit(0);
    }
    
}
