package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes12.dex */
public final class io2 {
    public final Map a;
    public c b;

    public io2(Map map, c cVar) {
        map = TypeIntrinsics.isMutableMap(map) ? map : null;
        this.a = map == null ? new LinkedHashMap() : map;
        this.b = cVar;
    }

    public final void a(Object obj, String str) {
        if (obj != null) {
            this.a.put(str, obj);
        }
    }

    public final void b(Object obj, String str) {
        if (obj == null) {
            this.a.put(str, "undefined");
        } else {
            this.a.put(str, obj);
        }
    }

    public /* synthetic */ io2(Map map, int i) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map, (c) null);
    }
}
