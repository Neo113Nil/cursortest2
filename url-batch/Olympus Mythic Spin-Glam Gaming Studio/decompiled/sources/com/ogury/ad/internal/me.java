package com.ogury.ad.internal;

import android.content.Context;
import com.ogury.core.internal.network.NetworkClient;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class me {
    public static ne b(Context context) {
        ke a = ke.d.a(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (z8.c == null) {
            int millis = (int) TimeUnit.SECONDS.toMillis(le.b.b.a);
            Context context2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getApplicationContext(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            Context applicationContext = context2.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            z8.c = new z8(new m3(applicationContext), new NetworkClient(millis, millis * 5));
        }
        z8 z8Var = z8.c;
        Intrinsics.checkNotNull(z8Var);
        le leVar = le.a;
        t3 t3Var = new t3();
        q0 q0Var = new q0(context);
        r2 r2Var = new r2();
        r5 r5Var = u5.e;
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        return new ne(context, a, z8Var, t3Var, q0Var, r2Var, r5Var.a(applicationContext2));
    }

    public final ne a(Context context) {
        ne neVar;
        Intrinsics.checkNotNullParameter(context, "context");
        ne neVar2 = ne.h;
        if (neVar2 != null) {
            return neVar2;
        }
        synchronized (this) {
            neVar = ne.h;
            if (neVar == null) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                neVar = b(applicationContext);
                ne.h = neVar;
            }
        }
        return neVar;
    }
}
