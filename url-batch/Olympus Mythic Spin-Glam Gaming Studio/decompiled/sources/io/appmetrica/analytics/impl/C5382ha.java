package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.ha, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5382ha {
    public final Context a;
    public final C5524mn b;
    public final C5426j3 c;
    public final SafePackageManager d;

    public C5382ha(Context context, C5524mn c5524mn, C5426j3 c5426j3, SafePackageManager safePackageManager) {
        this.a = context;
        this.b = c5524mn;
        this.c = c5426j3;
        this.d = safePackageManager;
    }

    public C5382ha(Context context) {
        this(context, new C5524mn(context, "io.appmetrica.analytics.build_id"), new C5426j3(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
