package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes15.dex */
public final class X {
    public final On a;
    public final List b;
    public final String c;

    public X(On on, ArrayList arrayList, String str) {
        this.a = on;
        this.b = arrayList == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(arrayList);
        this.c = str;
    }
}
