package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class i6 extends r7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(String adId) {
        super(adId, "ad clicked");
        Intrinsics.checkNotNullParameter(adId, "adId");
    }
}
