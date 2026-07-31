package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.vo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5759vo {
    public static final int[] c = {0, 1, 2, 3};
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public C5759vo(int[] iArr) {
        for (int i : iArr) {
            this.a.put(i, new HashMap());
        }
    }
}
