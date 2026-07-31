package com.ogury.ad.internal;

import com.ogury.ad.OguryShowErrorCode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class q7 extends r7 {
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(String adId) {
        super(adId, "error");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.c = OguryShowErrorCode.NO_AD_LOADED;
    }
}
