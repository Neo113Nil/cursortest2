package yads;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class y43 {
    public static volatile y43 b;
    public static final Object c = new Object();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(cd1 cd1Var, Object obj) {
        synchronized (c) {
            Set set = (Set) this.a.get(cd1Var);
            if (set != null) {
                set.remove(obj);
            }
        }
    }

    public final void b(cd1 cd1Var, Object obj) {
        synchronized (c) {
            try {
                Set set = (Set) this.a.get(cd1Var);
                if (set == null) {
                    set = new LinkedHashSet();
                    this.a.put(cd1Var, set);
                }
                set.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
