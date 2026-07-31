package com.ogury.ad.internal;

import android.content.Context;
import com.ogury.core.internal.network.NetworkClient;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class w5 {
    public final z8 a;
    public final h6 b;

    public w5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
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
        h6 h6Var = new h6(context);
        this.a = z8Var;
        this.b = h6Var;
    }
}
