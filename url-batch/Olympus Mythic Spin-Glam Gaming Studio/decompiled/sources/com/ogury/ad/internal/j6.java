package com.ogury.ad.internal;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class j6 {
    public final Application a;
    public final g b;
    public final z c;
    public final boolean d;
    public final le e;
    public final vh f;
    public final b2 g;
    public final s7 h;
    public final sg i;
    public a3 j;
    public final q0 k;
    public final u5 l;
    public final f m;

    public j6(Application application, g adLayout, z expandCommand, boolean z) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(expandCommand, "expandCommand");
        this.a = application;
        this.b = adLayout;
        this.c = expandCommand;
        this.d = z;
        this.e = le.a;
        this.f = new vh(new x9());
        this.g = b2.a;
        this.h = s7.a;
        Intrinsics.checkNotNullParameter(application, "application");
        this.i = new sg();
        this.j = new f4(adLayout);
        this.k = new q0(application);
        r5 r5Var = u5.e;
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        u5 a = r5Var.a(applicationContext);
        this.l = a;
        this.m = new f(application, new l(a));
    }
}
