package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes4.dex */
public final class f0 {
    public final boolean a;
    public final List b;
    public final long c;

    public f0(boolean z, List list, long j) {
        this.a = z;
        this.b = list;
        this.c = j;
    }

    public final long a() {
        return this.c;
    }

    public final boolean b() {
        return this.a;
    }

    public final List c() {
        return this.b;
    }

    public final String toString() {
        return "ServiceSideContentObserverCaptorConfig(enabled=" + this.a + ", mediaStoreColumnNames=" + this.b + ", detectWindowSeconds=" + this.c + ')';
    }

    public f0(C5879p c5879p) {
        this(c5879p.b(), c5879p.c(), c5879p.a());
    }
}
