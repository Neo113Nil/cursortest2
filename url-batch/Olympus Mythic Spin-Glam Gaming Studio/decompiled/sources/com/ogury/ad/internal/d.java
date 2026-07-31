package com.ogury.ad.internal;

import android.graphics.Rect;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {
    public Rect a;
    public List b;
    public float c;

    public d() {
        List list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(list, "emptyList(...)");
        this.b = list;
    }
}
