package yads;

import java.util.Map;
import kotlin.collections.MapsKt;

/* loaded from: classes10.dex */
public final class rl2 {
    public final Map a;

    public rl2(Map map) {
        this.a = MapsKt.toMutableMap(map);
    }

    public final void a(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        this.a.put(str, str2);
    }
}
