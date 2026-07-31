package com.ogury.ad.internal;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class y9 {
    public final q0 a;
    public final boolean b;

    public y9(q0 androidDevice, boolean z) {
        Intrinsics.checkNotNullParameter(androidDevice, "androidDevice");
        this.a = androidDevice;
        this.b = z;
    }

    public final void a(w6 mraidCommandExecutor) {
        Intrinsics.checkNotNullParameter(mraidCommandExecutor, "mraidCommandExecutor");
        int b = ib.b(this.a.c.widthPixels);
        int b2 = ib.b(this.a.c.heightPixels);
        Rect a = this.a.a(mraidCommandExecutor.a);
        b8.a(mraidCommandExecutor.a, x6.c(b, b2));
        b8.a(mraidCommandExecutor.a, x6.b(ib.b(a.width()), ib.b(a.height())));
        String forceOrientation = this.a.a.getResources().getConfiguration().orientation == 2 ? "landscape" : "portrait";
        boolean z = this.b;
        Intrinsics.checkNotNullParameter(forceOrientation, "orientation");
        b8.a(mraidCommandExecutor.a, x6.a(forceOrientation, z));
        boolean z2 = this.b;
        if (!z2) {
            forceOrientation = "none";
        }
        Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
        b8.a(mraidCommandExecutor.a, x6.b(forceOrientation, !z2));
    }
}
