package com.vungle.ads.internal.model;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes15.dex */
public final class g0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Boolean.valueOf(((b) obj2).n()), Boolean.valueOf(((b) obj).n()));
    }
}
