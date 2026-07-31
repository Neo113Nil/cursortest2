package io.appmetrica.analytics.impl;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5800xd implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(((C5748vd) obj).a, ((C5748vd) obj2).a);
    }
}
