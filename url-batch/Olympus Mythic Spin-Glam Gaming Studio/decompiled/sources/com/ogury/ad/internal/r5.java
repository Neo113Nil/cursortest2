package com.ogury.ad.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class r5 {
    public final u5 a(Context context) {
        u5 u5Var;
        Intrinsics.checkNotNullParameter(context, "context");
        u5 u5Var2 = u5.f;
        if (u5Var2 != null) {
            return u5Var2;
        }
        synchronized (this) {
            u5Var = u5.f;
            if (u5Var == null) {
                le leVar = le.a;
                u5Var = new u5(new g6(context), new w5(context), new q5(), new k8(context));
                u5.f = u5Var;
            }
        }
        return u5Var;
    }
}
