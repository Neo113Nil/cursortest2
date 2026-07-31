package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.ld, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4154ld extends W6 {
    public final C4456x f;
    public final InMobiJsonResponse g;
    public final AbstractC4353t1 h;
    public final Uc i;
    public final Nc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4154ld(C4456x adComponent, InMobiJsonResponse inMobiJsonResponse, AbstractC4353t1 adUnitTimeout, Uc nativeCallback, Nc stateMachine) {
        super(adComponent, adUnitTimeout, nativeCallback, stateMachine);
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "inMobiJsonResponse");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f = adComponent;
        this.g = inMobiJsonResponse;
        this.h = adUnitTimeout;
        this.i = nativeCallback;
        this.j = stateMachine;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-NativeFetchedState", "Initialize Called - ad fetched successfully");
        }
        InterfaceC4466x9 l2 = l();
        if (l2 != null) {
            ((C4493y9) l2).a("AUM-FetchedState", "Initialize Called");
        }
        this.c.getClass();
        C4456x c4456x = this.a;
        C4167m0 c4167m0 = c4456x.a.f;
        G adContext = c4456x.b;
        c4167m0.getClass();
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        BuildersKt__Builders_commonKt.launch$default(c4167m0.a, null, null, new C4063i0(adContext, c4167m0, null), 3, null);
        X4.a(k(), new V6(this, null));
    }
}
