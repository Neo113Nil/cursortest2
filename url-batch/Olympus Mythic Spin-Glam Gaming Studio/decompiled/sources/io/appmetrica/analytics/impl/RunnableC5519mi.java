package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.mi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC5519mi implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ C5701ti b;

    public RunnableC5519mi(C5701ti c5701ti, List list) {
        this.b = c5701ti;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.b;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).reportAnr(CollectionUtils.getMapFromList(this.a));
    }
}
