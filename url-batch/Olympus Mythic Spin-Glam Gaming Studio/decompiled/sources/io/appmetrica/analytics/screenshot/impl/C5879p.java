package io.appmetrica.analytics.screenshot.impl;

import java.util.List;
import kotlin.collections.ArraysKt;

/* renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5879p {
    public final boolean a;
    public final List b;
    public final long c;

    public C5879p(boolean z, List list, long j) {
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
        return "ContentObserverCaptorConfig(enabled=" + this.a + ", mediaStoreColumnNames='" + this.b + "', detectWindowSeconds=" + this.c + ')';
    }

    public C5879p() {
        this(new L().a, ArraysKt.toList(new L().c), new L().b);
    }
}
