package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* loaded from: classes8.dex */
public final class l1 implements Comparable {
    public final k1 a;
    public final Uri b;
    public final List c;

    public l1(k1 k1Var, Uri uri, List list) {
        this.a = k1Var;
        this.b = uri;
        this.c = list;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.mPriority.compareTo(((l1) obj).a.mPriority);
    }
}
