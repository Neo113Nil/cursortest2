package yads;

import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class h2 {
    public static final g2 b = new g2();
    public static volatile h2 c;
    public final LinkedHashMap a = new LinkedHashMap();

    public h2() {
        a("window_type_browser", new s1());
        a("window_type_activity_result", new k2());
    }

    public final synchronized void a(String str, f2 f2Var) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, f2Var);
        }
    }
}
