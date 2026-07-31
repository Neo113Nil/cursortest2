package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.nk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4214nk {
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.nk$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return AbstractC4214nk.a();
        }
    });

    public static final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((Handler) a.getValue()).post(runnable);
    }

    public static final Handler a() {
        return new Handler(Looper.getMainLooper());
    }
}
