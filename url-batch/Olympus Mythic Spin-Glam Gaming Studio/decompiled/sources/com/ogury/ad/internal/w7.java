package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class w7 extends r7 {
    public final tg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(String adId, tg rewardItem) {
        super(adId, rewardItem.a);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(rewardItem, "rewardItem");
        this.c = rewardItem;
    }
}
