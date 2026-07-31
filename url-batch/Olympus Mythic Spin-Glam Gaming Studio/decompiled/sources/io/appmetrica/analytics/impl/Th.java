package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes9.dex */
public final class Th implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C5701ti c;

    public Th(C5701ti c5701ti, String str, List list) {
        this.c = c5701ti;
        this.a = str;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.c;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).reportEvent(this.a, CollectionUtils.getMapFromList(this.b));
    }
}
