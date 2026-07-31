package com.ogury.ad.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class p0 {
    public final Context a;
    public final c b;
    public final x c;

    public p0(Context context, c adConfig, x adType) {
        wh uuidUtils = new wh();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.a = context;
        this.b = adConfig;
        this.c = adType;
    }
}
