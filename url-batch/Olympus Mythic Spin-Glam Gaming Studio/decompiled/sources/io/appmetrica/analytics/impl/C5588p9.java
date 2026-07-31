package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.p9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5588p9 extends AbstractC5615q9 {
    public final List a;

    public C5588p9(List<Object> list) {
        this.a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.a;
    }
}
