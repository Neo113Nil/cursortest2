package com.inmobi.media;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes13.dex */
public final class P implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        N6 n6 = (N6) obj2;
        N6 n62 = (N6) obj;
        return ComparisonsKt.compareValues(Integer.valueOf(n6.c * n6.d), Integer.valueOf(n62.c * n62.d));
    }
}
