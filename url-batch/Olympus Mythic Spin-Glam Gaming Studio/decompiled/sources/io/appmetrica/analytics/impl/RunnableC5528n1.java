package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC5528n1 implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ C5736v1 b;

    public RunnableC5528n1(C5736v1 c5736v1, List list) {
        this.b = c5736v1;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.b).reportAnr(CollectionUtils.getMapFromList(this.a));
    }
}
