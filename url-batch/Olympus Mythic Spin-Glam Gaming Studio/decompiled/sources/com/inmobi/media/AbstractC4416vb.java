package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.vb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4416vb extends AbstractC3954e0 implements Bj, InterfaceC4283qa, InterfaceC4009g {
    public final byte[] h;
    public final C4248p1 i;
    public final AbstractC4353t1 j;
    public final Uc k;
    public final Nc l;
    public final X m;
    public final CoroutineScope n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4416vb(byte[] bArr, C4248p1 adManagerComponent, AbstractC4353t1 adUnitTimeout, Uc publisherCallbacks, Nc stateMachine) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.h = bArr;
        this.i = adManagerComponent;
        this.j = adUnitTimeout;
        this.k = publisherCallbacks;
        this.l = stateMachine;
        this.m = new X(this.f, this.g);
        this.n = X4.a(this.b);
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        C4493y9 c4493y9 = this.e;
        if (c4493y9 != null) {
            c4493y9.a("AUM-LoadResponseState", "Initialize Called");
        }
        byte[] bArr = this.h;
        if (bArr != null && bArr.length != 0) {
            C3850a c3850a = new C3850a(bArr, this.d.a, this.e);
            this.j.d();
            BuildersKt__Builders_commonKt.launch$default(this.n, null, null, new C4389ub(c3850a, this, null), 3, null);
        } else {
            C4493y9 c4493y92 = this.e;
            if (c4493y92 != null) {
                c4493y92.b("AUM-LoadResponseState", "Empty response on Load");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    public abstract void a(AdResponse adResponse);

    @Override // com.inmobi.media.Bj
    public final void c() {
        N3.a(this.n);
    }

    @Override // com.inmobi.media.InterfaceC4283qa
    public final void e() {
        a(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2138)), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
    }

    @Override // com.inmobi.media.InterfaceC4009g
    public final void j() {
        C4493y9 c4493y9 = this.e;
        if (c4493y9 != null) {
            c4493y9.b("AUM-LoadResponseState", "onDestroy");
        }
        this.l.a(new C4515z5(null, this.j, this.i), this);
    }

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C4493y9 c4493y9 = this.e;
        if (c4493y9 != null) {
            c4493y9.b("AUM-LoadResponseState", "transitionToLoadDroppedState " + map);
        }
        this.l.a(new U6(map, inMobiAdRequestStatus, this.j, this.i, this.k, this.l), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C4493y9 c4493y9 = this.e;
        if (c4493y9 != null) {
            c4493y9.b("AUM-LoadResponseState", "transitionToLoadDroppedState 2143");
        }
        this.l.a(new C4284qb((short) 2143, inMobiAdRequestStatus, this.i, this.k, this.l), this);
    }
}
