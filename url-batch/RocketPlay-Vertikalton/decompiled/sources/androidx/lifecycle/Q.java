package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1883a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f1883a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((O) it.next()).a();
        }
        linkedHashMap.clear();
    }
}
