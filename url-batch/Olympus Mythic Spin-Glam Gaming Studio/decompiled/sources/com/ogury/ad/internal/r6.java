package com.ogury.ad.internal;

import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class r6 extends Lambda implements Function1 {
    public final /* synthetic */ t6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(t6 t6Var) {
        super(1);
        this.a = t6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g adLayout = (g) obj;
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        w6 w6Var = this.a.p;
        w6 w6Var2 = null;
        if (w6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mraidCommandExecutor");
            w6Var = null;
        }
        b8.a(w6Var.a, x6.a(ib.b(adLayout.getWidth()), ib.b(adLayout.getHeight()), ib.a(adLayout.getX()), ib.a(adLayout.getY())));
        this.a.j.a();
        t6 t6Var = this.a;
        q0 q0Var = t6Var.k;
        y7 y7Var = t6Var.o;
        if (y7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            y7Var = null;
        }
        Rect a = q0Var.a(y7Var);
        w6 w6Var3 = t6Var.p;
        if (w6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mraidCommandExecutor");
        } else {
            w6Var2 = w6Var3;
        }
        b8.a(w6Var2.a, x6.b(ib.b(a.width()), ib.b(a.height())));
        return Unit.INSTANCE;
    }
}
