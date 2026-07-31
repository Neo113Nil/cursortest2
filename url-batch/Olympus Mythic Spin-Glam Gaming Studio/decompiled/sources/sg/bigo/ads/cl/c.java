package sg.bigo.ads.cl;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class c {
    private static final c c = new c();

    @Nullable
    Map<String, Long> a;
    public final AtomicInteger b = new AtomicInteger(0);

    private c() {
    }

    public static c a() {
        return c;
    }

    static boolean a(Map<String, Long> map, String str) {
        Long l;
        return map == null || str == null || (l = map.get(str)) == null || SystemClock.elapsedRealtime() - l.longValue() > 600000;
    }

    public final boolean a(@Nullable String str) {
        return a(this.a, str);
    }

    public final void b() {
        Map<String, Long> map = this.a;
        if (map != null) {
            map.clear();
        }
        this.b.set(1);
    }
}
