package com.pubmatic.sdk.video.player;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes14.dex */
public class POBProgressiveEventHandler {
    private SortedMap a = new TreeMap();
    private POBProgressiveEventListener b;

    public POBProgressiveEventHandler(@NonNull POBProgressiveEventListener pOBProgressiveEventListener) {
        this.b = pOBProgressiveEventListener;
    }

    public void addProgressUrls(@NonNull Integer num, POBVastCreative.POBEventTypes pOBEventTypes, @NonNull List<String> list) {
        Map map = (Map) this.a.get(num);
        if (map == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(pOBEventTypes, list);
            this.a.put(num, hashMap);
        } else {
            List list2 = (List) map.get(pOBEventTypes);
            if (list2 == null) {
                map.put(pOBEventTypes, list);
            } else {
                list2.addAll(list);
            }
        }
    }

    public void onProgress(int i) {
        Map<POBVastCreative.POBEventTypes, List<String>> map;
        if (this.a.isEmpty()) {
            return;
        }
        Integer num = (Integer) this.a.firstKey();
        if (i < num.intValue() || (map = (Map) this.a.get(num)) == null) {
            return;
        }
        this.b.onProgressReached(map);
        this.a.remove(num);
    }
}
