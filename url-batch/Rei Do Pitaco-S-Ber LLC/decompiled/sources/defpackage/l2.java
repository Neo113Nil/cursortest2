package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class l2 {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = fv.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(fv.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(cn.class.getName(), "okhttp.Http2");
        linkedHashMap.put(m40.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size == 0) {
            map = vh.f;
        } else if (size != 1) {
            map = new LinkedHashMap(linkedHashMap);
        } else {
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            map = Collections.singletonMap(entry.getKey(), entry.getValue());
            map.getClass();
        }
        b = map;
    }
}
