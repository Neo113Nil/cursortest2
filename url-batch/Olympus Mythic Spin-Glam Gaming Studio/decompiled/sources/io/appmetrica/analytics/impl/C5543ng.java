package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ng, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5543ng implements Ko {
    @Override // io.appmetrica.analytics.impl.Ko
    public final Io a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new Io(this, true, "");
        }
        return new Io(this, false, "Invalid quantity value " + num);
    }
}
