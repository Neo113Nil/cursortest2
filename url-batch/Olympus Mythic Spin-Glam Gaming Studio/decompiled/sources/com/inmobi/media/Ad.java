package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Ad extends AbstractC4416vb {
    public final C4248p1 o;
    public final AbstractC4353t1 p;
    public final Uc q;
    public final Nc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ad(byte[] bArr, C4248p1 adManagerComponent, AbstractC4353t1 adUnitTimeout, Uc nativeCallback, Nc stateMachine) {
        super(bArr, adManagerComponent, adUnitTimeout, nativeCallback, stateMachine);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.o = adManagerComponent;
        this.p = adUnitTimeout;
        this.q = nativeCallback;
        this.r = stateMachine;
    }

    @Override // com.inmobi.media.AbstractC4416vb
    public final void a(AdResponse obj) {
        Intrinsics.checkNotNullParameter(obj, "adResponse");
        C4493y9 c4493y9 = this.e;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            c4493y9.a("AUM-NativeLoadResponseState", "onAdResponseParseSuccess - ad response received: " + AbstractC4494ya.a(obj, AdResponse.class));
        }
        T0.a(this.o, obj, new C4497yd(this), new C4523zd(this));
    }
}
