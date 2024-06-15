/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hazelcastcollections;


import com.hazelcast.collection.ItemEvent;
import com.hazelcast.collection.ItemListener;

/**
 *
 * @author Daryl
 */
public class CollectionItemListener implements ItemListener<String> {

    @Override
    public void itemAdded(ItemEvent<String> ie) {
        System.out.println("ItemListener - itemAdded: " + ie.getItem());
    }

    @Override
    public void itemRemoved(ItemEvent<String> ie) {
        System.out.println("ItemListener - itemRemoved: " + ie.getItem());
    }
    
}
