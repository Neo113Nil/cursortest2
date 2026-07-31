package com.ogury.ad.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m1 {
    public g a;
    public final q0 b;

    public m1(g adLayout, Context context) {
        q0 androidDevice = new q0(context);
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(androidDevice, "androidDevice");
        this.a = adLayout;
        this.b = androidDevice;
    }

    public final void a(hh adSize, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        int i = adSize.a;
        if (z) {
            i = this.b.a.getResources().getConfiguration().orientation == 1 ? -1 : this.b.c.heightPixels;
        }
        rg rgVar = new rg(false, i, adSize.b, 0, 0);
        rgVar.f = 17;
        if (!z2) {
            this.a.setInitialSizeWithoutResizing(rgVar);
            return;
        }
        this.a.setLeft(0);
        this.a.setTop(0);
        this.a.setInitialSize(rgVar);
    }
}
