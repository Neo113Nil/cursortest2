package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public abstract class y {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static boolean a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }

    public static final void b(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.mo4828invoke();
    }

    public static void a(final Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (a()) {
            block.mo4828invoke();
        } else {
            a.post(new Runnable() { // from class: com.vungle.ads.internal.util.y$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    y.b(Function0.this);
                }
            });
        }
    }
}
