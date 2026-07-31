package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.od, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4234od extends Z6 {
    public final C4248p1 o;
    public final AbstractC4353t1 p;
    public final Uc q;
    public final Nc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4234od(C4248p1 adManagerComponent, AbstractC4353t1 adUnitTimeout, Nc stateMachine, Uc nativeCallback) {
        super(adManagerComponent, adUnitTimeout, stateMachine, nativeCallback);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.o = adManagerComponent;
        this.p = adUnitTimeout;
        this.q = nativeCallback;
        this.r = stateMachine;
    }

    @Override // com.inmobi.media.Z6
    public final void a(AdResponse obj) {
        Intrinsics.checkNotNullParameter(obj, "adResponse");
        C4493y9 c4493y9 = this.e;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            c4493y9.a("AUM-NativeFetchingState", "onAdResponseParseSuccess " + AbstractC4494ya.a(obj, AdResponse.class));
        }
        T0.a(this.o, obj, new C4180md(this), new C4207nd(this));
    }
}
