package com.ogury.ad.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ch {
    public final q0 a;

    public ch(q0 androidDevice) {
        Intrinsics.checkNotNullParameter(androidDevice, "androidDevice");
        this.a = androidDevice;
    }

    public static final void a(ch chVar, w6 w6Var) {
        View view = w6Var.a;
        int b = ib.b(view.getWidth());
        int b2 = ib.b(view.getHeight());
        ViewParent parent = view.getParent();
        View view2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int a = ib.a(view.getX());
        int a2 = ib.a(view.getY());
        Rect a3 = chVar.a.a(w6Var.a);
        b8.a(w6Var.a, x6.b(ib.b(a3.width()), ib.b(a3.height())));
        b8.a(w6Var.a, x6.b(b, b2, a, a2));
    }

    public final void a(w6 mraidCommandExecutor) {
        Intrinsics.checkNotNullParameter(mraidCommandExecutor, "mraidCommandExecutor");
        zi.a(mraidCommandExecutor.a, new bh(this, mraidCommandExecutor));
    }
}
