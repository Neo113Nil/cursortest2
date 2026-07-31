package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Pd extends AbstractC4442wb {
    public final C4456x f;
    public final AbstractC4353t1 g;
    public final Uc h;
    public final Nc i;
    public final Sc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pd(C4456x adComponent, InMobiJsonResponse inMobiJsonResponse, AbstractC4353t1 adUnitTimeout, Uc nativeCallback, Nc stateMachine) {
        super(adComponent, adUnitTimeout, nativeCallback, stateMachine);
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "inMobiJsonResponse");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f = adComponent;
        this.g = adUnitTimeout;
        this.h = nativeCallback;
        this.i = stateMachine;
        this.j = new Sc(new Rc(adComponent, inMobiJsonResponse, stateMachine));
    }

    public final void a(C4261pe pubData) {
        Intrinsics.checkNotNullParameter(pubData, "pubData");
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-NativeLoadingState", "onLoadSuccess - ad loaded successfully " + pubData);
        }
        this.i.a(new Cd(pubData, this.f, this.j, this.g, this.h, this.i), this);
    }
}
