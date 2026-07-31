package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Unit;

/* loaded from: classes11.dex */
public final class ea2 {
    public final Object a = new Object();
    public final WeakHashMap b = new WeakHashMap();

    public final void a(wd3 wd3Var) {
        synchronized (this.a) {
            this.b.put(wd3Var, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void b(wd3 wd3Var) {
        synchronized (this.a) {
            this.b.remove(wd3Var);
        }
    }

    public final void b() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.b.keySet());
            this.b.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wd3 wd3Var = (wd3) it.next();
            if (wd3Var != null) {
                wd3Var.a();
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = !this.b.isEmpty();
        }
        return z;
    }
}
