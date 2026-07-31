package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class W6 extends AbstractC4483y implements Bj, InterfaceC4283qa, InterfaceC4009g {
    public final C4456x b;
    public final AbstractC4353t1 c;
    public final Uc d;
    public final Nc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W6(C4456x adComponent, AbstractC4353t1 adUnitTimeout, Uc publisherCallbacks, Nc stateMachine) {
        super(adComponent);
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adComponent;
        this.c = adUnitTimeout;
        this.d = publisherCallbacks;
        this.e = stateMachine;
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC4283qa
    public final void e() {
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-FetchedState", "transitionToLoadFailedState Called");
        }
        this.e.a(new C4336sb(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2138)), inMobiAdRequestStatus, this.c, this.b, this.d, this.e), this);
    }

    @Override // com.inmobi.media.InterfaceC4009g
    public final void j() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-FetchedState", "onDestroy Called");
        }
        this.e.a(new C4515z5(null, this.c, this.b), this);
    }
}
