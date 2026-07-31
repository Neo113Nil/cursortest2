package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC5632r1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C5736v1 c;

    public RunnableC5632r1(C5736v1 c5736v1, String str, List list) {
        this.c = c5736v1;
        this.a = str;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.c).reportEvent(this.a, CollectionUtils.getMapFromList(this.b));
    }
}
