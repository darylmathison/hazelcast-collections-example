/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hazelcastcollections.iset;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.ISet;

/**
 *
 * @author Daryl
 */
public class HazelcastISet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
