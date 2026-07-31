package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class T2 implements Ko {
    @Override // io.appmetrica.analytics.impl.Ko
    public final Io a(Object obj) {
        C5811xo[] c5811xoArr = ((Ao) obj).a;
        return (c5811xoArr == null || c5811xoArr.length == 0) ? new Io(this, false, "attributes list is empty") : new Io(this, true, "");
    }
}
