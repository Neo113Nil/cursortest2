package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 {
    public final Context a;
    public final DisplayMetrics b;

    public n0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.b = displayMetrics;
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.areEqual(this.a, ((n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("DeviceScreenInfo(context=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }
}
