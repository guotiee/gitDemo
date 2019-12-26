package com.glodon.gips.gitdemo;

import com.glodon.gips.gitdemo.sync.OrgSyncService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class gitDemoApplicationTests {

    @Autowired
    OrgSyncService orgSyncService;

    @Test
    void textGetDiff() {
        List<String> list1 = new ArrayList<String>() {{
            add("1");
            add("2");
            add("3");
        }};
        List<String> list2 = new ArrayList<String>() {{
            add("2");
            add("3");
            add("4");
        }};
        List<String> result = orgSyncService.getDiffer(list1, list2);
        assert ((result.size() == 2) && result.contains("1") && result.contains("4") && !result.contains("2")
                && !result.contains("3"));

    }

    @Test
    void textBigArrayGetDiff() {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        for (int i = 1; i <= 10000; i++) {
            list1.add(Integer.toString(i));
        }
        for (int i = 5001; i <= 15000; i++) {
            list2.add(Integer.toString(i));
        }
        List<String> result = orgSyncService.getDiffer(list1, list2);
        assert ((result.size() == 10000) && result.contains("1") && result.contains("5000")
                && !result.contains("5001") && !result.contains("10000") && result.contains("10001"));

    }
}
