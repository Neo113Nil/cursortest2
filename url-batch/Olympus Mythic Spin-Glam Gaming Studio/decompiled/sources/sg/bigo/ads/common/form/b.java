package sg.bigo.ads.common.form;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.an.j;

/* loaded from: classes9.dex */
public final class b {
    private static final b c = new b();
    private static final Map<Integer, Map<String, Object>> d = new ConcurrentHashMap();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public j b;

    public interface a {
        void a(int i);

        void a(Map<String, Object> map);
    }

    private b() {
    }

    @Nullable
    public static Map<String, Object> a(int i) {
        Map<Integer, Map<String, Object>> map = d;
        if (map.containsKey(Integer.valueOf(i))) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    public static b a() {
        return c;
    }

    public static void a(int i, @NonNull Map<String, Object> map) {
        d.put(Integer.valueOf(i), map);
    }

    public static void b(int i) {
        d.remove(Integer.valueOf(i));
    }

    public final void a(final Map<String, Object> map, final a aVar, final int i) {
        if (this.b == null || map == null) {
            return;
        }
        sg.bigo.ads.da.b.b(1, i, "");
        this.b.a(map, new j.a() { // from class: sg.bigo.ads.common.form.b.1
            @Override // sg.bigo.ads.an.j.a
            public final void a() {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(i);
                }
                sg.bigo.ads.da.b.b(2, i, "");
            }

            @Override // sg.bigo.ads.an.j.a
            public final void a(int i2, int i3, String str) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(map);
                }
                sg.bigo.ads.da.b.b(3, i, String.format(Locale.ENGLISH, "code: %d, subcode: %d, error msg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str));
            }
        });
    }
}
