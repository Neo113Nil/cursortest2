package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes14.dex */
public abstract class Z6 extends AbstractC3954e0 implements Bj, InterfaceC4283qa, InterfaceC4009g {
    public final C4248p1 h;
    public final Nc i;
    public final AbstractC4353t1 j;
    public final Uc k;
    public final CoroutineScope l;
    public final Ac m;
    public final Z n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z6(C4248p1 adManagerComponent, AbstractC4353t1 adUnitTimeout, Nc stateMachine, Uc publisherCallbacks) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        this.h = adManagerComponent;
        this.i = stateMachine;
        this.j = adUnitTimeout;
        this.k = publisherCallbacks;
        this.l = X4.a(this.b);
        TimeoutConfigurations.MediationConfig a0 = this.c.getTimeouts().a0();
        String str = this.d.h;
        this.a.getClass();
        Ac a = AbstractC4522zc.a(a0, str, "native", AbstractC4030gj.b);
        this.m = a;
        this.n = new Z(adManagerComponent, a);
    }

    public final void a(Y y) {
        V v = y.b;
        InMobiAdRequestStatus inMobiAdRequestStatus = y.a;
        Objects.toString(v);
        Objects.toString(inMobiAdRequestStatus);
        V v2 = y.b;
        if (v2 instanceof C4160lj) {
            C4167m0 c4167m0 = this.g;
            BuildersKt__Builders_commonKt.launch$default(c4167m0.a, null, null, new C4141l0(c4167m0, null), 3, null);
            a(y.a, ((C4160lj) y.b).a);
            return;
        }
        if (v2 instanceof R6) {
            a(y.a, ((R6) v2).a);
        } else if (v2 instanceof S6) {
            a(y.a, (short) ((S6) v2).a);
        } else {
            if (!(v2 instanceof C4108jj)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((C4108jj) v2).a, y.a);
        }
    }

    public abstract void a(AdResponse adResponse);

    @Override // com.inmobi.media.Bj
    public final void c() {
        N3.a(this.l);
    }

    @Override // com.inmobi.media.InterfaceC4283qa
    public final void e() {
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2138);
    }

    @Override // com.inmobi.media.InterfaceC4009g
    public final void j() {
        this.i.a(new C4515z5(this.h), this);
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        C4493y9 c4493y9 = this.e;
        if (c4493y9 != null) {
            c4493y9.a("AUM-FetchingState", "Initialize Called");
        }
        Yk.b();
        this.j.b();
        BuildersKt__Builders_commonKt.launch$default(this.l, null, null, new Y6(this, null), 3, null);
    }

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C4493y9 c4493y9 = this.e;
        if (c4493y9 != null) {
            c4493y9.b("AUM-FetchingState", "transitionToFetchFailedState " + map);
        }
        this.i.a(new U6(map, inMobiAdRequestStatus, this.j, this.h, this.k, this.i), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        a(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s))), inMobiAdRequestStatus);
    }
}
