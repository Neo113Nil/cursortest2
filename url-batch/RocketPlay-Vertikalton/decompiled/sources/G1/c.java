package G1;

import W0.t;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import x1.p;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f523a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f524b;

    static {
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = p.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(p.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(E1.g.class.getName(), "okhttp.Http2");
        linkedHashMap.put(A1.f.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size == 0) {
            map = t.f1285a;
        } else if (size != 1) {
            map = new LinkedHashMap(linkedHashMap);
        } else {
            i1.f.e(linkedHashMap, "<this>");
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            map = Collections.singletonMap(entry.getKey(), entry.getValue());
            i1.f.d(map, "with(...)");
        }
        f524b = map;
    }
}
