package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.wb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4442wb extends AbstractC4483y implements Bj, InterfaceC4283qa, InterfaceC4009g {
    public final C4456x b;
    public final AbstractC4353t1 c;
    public final Uc d;
    public final Nc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4442wb(C4456x adComponent, AbstractC4353t1 adUnitTimeout, Uc publisherCallbacks, Nc stateMachine) {
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
    public final void a() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-LoadingState", "Initialize Called");
        }
        this.c.getClass();
        Bj bj = ((Pd) this).j.b.c;
        C4050hd c4050hd = bj instanceof C4050hd ? (C4050hd) bj : null;
        if (c4050hd != null) {
            C4493y9 c4493y9 = c4050hd.a.a.a.c;
            if (c4493y9 != null) {
                c4493y9.a("NativeCreatedState", "Inflate Called");
            }
            c4050hd.b.a(new Qd(c4050hd.a, c4050hd.b), c4050hd);
        }
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC4283qa
    public final void e() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-LoadingState", "onInternalLoadTimeout");
        }
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), AbstractC3998ff.a() == null ? (short) 2139 : (short) 2203);
    }

    @Override // com.inmobi.media.InterfaceC4009g
    public final void j() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-LoadingState", "onDestroy");
        }
        this.e.a(new C4515z5(((Pd) this).j, this.c, this.b), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-LoadingState", "transitionToLoadFailedState " + ((int) s));
        }
        this.e.a(new C4336sb(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s))), inMobiAdRequestStatus, this.c, this.b, this.d, this.e), this);
    }
}
