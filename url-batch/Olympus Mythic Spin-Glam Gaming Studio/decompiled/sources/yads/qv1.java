package yads;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class qv1 {
    public static qv1 b;
    public static final Object c = new Object();
    public final ArrayDeque a = new ArrayDeque();

    public final void a(ru1 ru1Var, String str, String str2) {
        if (su1.a.a()) {
            pv1 pv1Var = new pv1(System.currentTimeMillis(), ru1Var.name(), str, str2);
            synchronized (c) {
                try {
                    if (this.a.size() > 5000) {
                        this.a.remove(0);
                    }
                    this.a.add(pv1Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final List b() {
        List list;
        synchronized (c) {
            list = CollectionsKt.toList(this.a);
        }
        return list;
    }

    public final void a() {
        synchronized (c) {
            this.a.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
