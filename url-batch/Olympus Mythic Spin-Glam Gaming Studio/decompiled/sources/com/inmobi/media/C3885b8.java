package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.b8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C3885b8 extends Og {
    public final int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3885b8(AdConfig.ViewabilityConfig viewabilityConfig, byte b, InterfaceC4466x9 interfaceC4466x9) {
        super(viewabilityConfig, b, interfaceC4466x9);
        C4412v7 visibilityChecker = C4491y7.k;
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.m = 1000;
    }

    @Override // com.inmobi.media.AbstractC4349so
    public int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.l;
        return viewabilityConfig != null ? viewabilityConfig.getWebVisibilityThrottleMillis() : this.m;
    }
}
