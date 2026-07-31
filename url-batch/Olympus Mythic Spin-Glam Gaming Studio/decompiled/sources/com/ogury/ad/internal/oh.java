package com.ogury.ad.internal;

import android.os.Build;
import android.os.Looper;
import com.ogury.core.internal.DebugUtils;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class oh {
    public static final void a(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (DebugUtils.INSTANCE.isDebug()) {
            throw th;
        }
        Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, th);
    }

    public static final void a(String methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        if (!Intrinsics.areEqual("robolectric", Build.FINGERPRINT) && Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            a(new IllegalStateException(methodName + " cannot be called from the main thread"));
        }
    }
}
