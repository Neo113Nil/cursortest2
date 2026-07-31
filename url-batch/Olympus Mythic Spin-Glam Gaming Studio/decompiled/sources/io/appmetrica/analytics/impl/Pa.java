package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Pa {
    public final HashMap a;
    public final boolean b;

    public Pa() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.a.toString();
    }

    public Pa(boolean z) {
        this.a = new HashMap();
        this.b = z;
    }
}
