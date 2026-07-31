package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4456x implements E8 {
    public final /* synthetic */ C4248p1 a;
    public final G b;

    public C4456x(C4248p1 adManagerComponent, G adContext) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.a = adManagerComponent;
        this.b = adContext;
    }

    @Override // com.inmobi.media.E8
    public final CoroutineScope a() {
        return this.a.e;
    }

    @Override // com.inmobi.media.E8
    public final C4167m0 b() {
        return this.a.f;
    }

    @Override // com.inmobi.media.E8
    public final InterfaceC4466x9 c() {
        return this.a.c;
    }
}
