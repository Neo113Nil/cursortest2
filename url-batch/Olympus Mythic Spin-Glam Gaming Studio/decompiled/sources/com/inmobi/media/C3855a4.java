package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.a4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3855a4 extends C3885b8 {
    public final int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3855a4(AdConfig.ViewabilityConfig viewabilityConfig, InterfaceC4466x9 interfaceC4466x9) {
        super(viewabilityConfig, (byte) 1, interfaceC4466x9);
        C4412v7 visibilityChecker = C4491y7.k;
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.n = 500;
    }

    @Override // com.inmobi.media.C3885b8, com.inmobi.media.AbstractC4349so
    public final int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.l;
        return viewabilityConfig != null ? viewabilityConfig.getCompanionVisibilityThrottleMillis() : this.n;
    }
}
