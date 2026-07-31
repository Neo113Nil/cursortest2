package com.my.target;

import android.content.Context;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class yd {
    private final fe a;
    private final Context b;
    private boolean c = true;

    private yd(fe feVar, Context context) {
        this.a = feVar;
        this.b = context;
    }

    public static yd a(fe feVar, Context context) {
        return new yd(feVar, context);
    }

    public void a(boolean z) {
        this.c = z;
    }

    public oe a(eb ebVar) {
        return oe.a(ebVar, this.a, null, this.b);
    }

    public c0 a() {
        return ib.a(this.c, this.b);
    }
}
