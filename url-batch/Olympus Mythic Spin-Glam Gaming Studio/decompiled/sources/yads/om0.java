package yads;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* loaded from: classes13.dex */
public final class om0 {
    public static final Object h = new Object();
    public String a;
    public final List b = CollectionsKt.emptyList();
    public final Map c = MapsKt.emptyMap();
    public String d;
    public String e;
    public boolean f;
    public String g;

    public final Map a() {
        return this.c;
    }

    public final String b() {
        String str;
        synchronized (h) {
            str = this.g;
        }
        return str;
    }
}
