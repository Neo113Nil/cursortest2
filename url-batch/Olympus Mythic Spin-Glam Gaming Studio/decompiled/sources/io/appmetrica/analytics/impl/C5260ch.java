package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5260ch extends AbstractC5208ah {
    public final IReporter b;

    public C5260ch(@NonNull C5532n5 c5532n5, @NonNull IReporter iReporter) {
        super(c5532n5);
        this.b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NonNull C5326f6 c5326f6) {
        C5230bd c5230bd = (C5230bd) C5230bd.c.get(c5326f6.d);
        HashMap hashMap = new HashMap();
        hashMap.put("type", c5230bd.a);
        hashMap.put("delivery_method", c5230bd.b);
        this.b.reportEvent("crash_saved", hashMap);
        return false;
    }
}
