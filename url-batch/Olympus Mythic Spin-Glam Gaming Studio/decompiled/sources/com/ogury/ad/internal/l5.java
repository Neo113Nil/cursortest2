package com.ogury.ad.internal;

import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class l5 extends Lambda implements Function1 {
    public static final l5 a = new l5();

    public l5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        Logger.INSTANCE.e(LogTag.MONITORING, SourceTag.ADS, error);
        return Unit.INSTANCE;
    }
}
