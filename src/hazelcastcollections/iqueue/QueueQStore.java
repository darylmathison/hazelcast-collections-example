/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hazelcastcollections.iqueue;

import com.hazelcast.core.QueueStore;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
/**
 *
 * @author Daryl
 */
public class QueueQStore implements QueueStore<String> {
    
    @Override
    public void store(Long l, String t) {
        System.out.println("storing " + t + " with " + l);
    }

    @Override
    public void storeAll(Map<Long, String> map) {
        System.out.println("store all");
    }

    @Override
    public void delete(Long l) {
        System.out.println("removing " + l);
    }

    @Override
    public void deleteAll(Collection<Long> clctn) {
        System.out.println("deleteAll");
    }

    @Override
    public String load(Long l) {
        System.out.println("loading " + l);
        return "";
    }

    @Override
    public Map<Long, String> loadAll(Collection<Long> clctn) {
        System.out.println("loadAll");
        Map<Long, String> retMap = new TreeMap<>();
        return retMap;
    }

    @Override
    public Set<Long> loadAllKeys() {
        System.out.println("loadAllKeys");
        return new TreeSet<>();
    }
    
}
