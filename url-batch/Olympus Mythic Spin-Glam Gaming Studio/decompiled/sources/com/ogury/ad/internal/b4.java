package com.ogury.ad.internal;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class b4 {
    public final Application a;
    public a4 b;

    public b4(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.a = application;
    }

    public final void a(g adLayout) {
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        a4 a4Var = new a4(adLayout, this);
        this.b = a4Var;
        this.a.registerActivityLifecycleCallbacks(a4Var);
    }

    public final void a() {
        this.a.unregisterActivityLifecycleCallbacks(this.b);
    }
}
