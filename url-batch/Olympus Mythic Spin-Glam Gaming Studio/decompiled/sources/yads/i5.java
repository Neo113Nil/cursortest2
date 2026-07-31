package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class i5 {
    public final Object a = new Object();
    public final zc2 b = new zc2();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    public final void a(h5 h5Var, Object obj) {
        synchronized (this.a) {
            try {
                Map map = (Map) this.c.get(h5Var);
                if (map == null) {
                    map = new LinkedHashMap();
                }
                this.c.put(h5Var, map);
                map.put(obj, Long.valueOf(SystemClock.elapsedRealtime()));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(h5 h5Var) {
        a(h5Var, null);
    }

    public final void a(h5 h5Var) {
        a(h5Var, this.b, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0003, B:9:0x0029, B:10:0x003b, B:12:0x0045, B:13:0x004b, B:18:0x000e, B:20:0x0016), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0003, B:9:0x0029, B:10:0x003b, B:12:0x0045, B:13:0x004b, B:18:0x000e, B:20:0x0016), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(h5 h5Var, ad2 ad2Var, Object obj) {
        Long l;
        Long valueOf;
        Map map;
        synchronized (this.a) {
            try {
                Map map2 = (Map) this.c.get(h5Var);
                if (map2 != null && (l = (Long) map2.get(obj)) != null) {
                    valueOf = Long.valueOf(SystemClock.elapsedRealtime() - l.longValue());
                    if (valueOf != null) {
                        this.d.add(new g5(h5Var, ad2Var.a(valueOf.longValue())));
                    }
                    map = (Map) this.c.get(h5Var);
                    if (map != null) {
                    }
                    Unit unit = Unit.INSTANCE;
                }
                valueOf = null;
                if (valueOf != null) {
                }
                map = (Map) this.c.get(h5Var);
                if (map != null) {
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        synchronized (this.a) {
            this.c.clear();
            this.d.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
