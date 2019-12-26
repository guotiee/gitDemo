package com.glodon.gips.gitdemo.sync.impl;

import com.glodon.gips.gitdemo.sync.OrgSyncService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * The Request Context holds request, response,  state information and data for ZuulFilters to access and share.
 * The RequestContext lives for the duration of the request and is ThreadLocal.
 * extensions of RequestContext can be substituted by setting the contextClass.
 * Most methods here are convenience wrapper methods; the RequestContext is an extension of a ConcurrentHashMap
 *
 * @author Mikey Cohen
 * Date: 10/13/11
 * Time: 10:21 AM
 */
@Service
public class OrgSyncServiceImpl implements OrgSyncService {
    @Override
    public List<String> getDiffer(List<String> list1, List<String> list2) {
        long start = System.currentTimeMillis();
        List<String> result = new ArrayList<>();
        /*

        Map<String, Integer> map = new HashMap<String, Integer>(list1.size() + list2.size());
        List<String> maxList = list1;
        List<String> minList = list2;
        if (list2.size() > list1.size()) {
            maxList = list2;
            minList = list1;
        }
        for (String string : maxList) {
            map.put(string, 1);
        }
        for (String string : minList) {
            Integer count = map.get(string);
            if (count != null) {
                map.put(string, ++count);
                continue;
            }
            map.put(string, 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        */
        if ((null == list1) || (0 == list1.size()) || (null == list2) || (0 == list2.size())) {
            return result;
        }
        HashSet<String> hashset = new HashSet<String>(list1);
        for (String item : list2) {
            if (hashset.contains(item)) {
                hashset.remove(item);
            } else {
                result.add(item);
            }
        }
        result.addAll(hashset);
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + " 毫秒");
        return result;

    }
}
