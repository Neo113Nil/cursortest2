package com.ogury.ad.internal;

import com.ogury.core.internal.DebugUtils;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class r9 {
    public static final boolean a = DebugUtils.INSTANCE.isDebug();

    public static void a(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (a) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, "[OMID] caught_error", error);
        }
    }
}
