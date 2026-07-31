package yads;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class xu1 {
    public static xu1 b;
    public static final Object c = new Object();
    public final ArrayDeque a = new ArrayDeque();

    public final void a() {
        synchronized (c) {
            this.a.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final List b() {
        List list;
        synchronized (c) {
            list = CollectionsKt.toList(this.a);
        }
        return list;
    }
}
