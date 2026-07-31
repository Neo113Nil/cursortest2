package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.al, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3872al extends E6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3872al(Rc nativeAdUnitComponent, AbstractC3984f1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
    }

    @Override // com.inmobi.media.E6
    public final Object a(Continuation continuation) {
        return new J6();
    }
}
