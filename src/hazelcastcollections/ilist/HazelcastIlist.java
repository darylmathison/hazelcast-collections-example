/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hazelcastcollections.ilist;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IList;

/**
 *
 * @author Daryl
 */
public class HazelcastIlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
}
