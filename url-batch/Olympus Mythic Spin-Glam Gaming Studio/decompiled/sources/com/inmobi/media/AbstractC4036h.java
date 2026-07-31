package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC4036h extends Ej implements InterfaceC4195n1, InterfaceC4283qa, InterfaceC4009g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4036h(CoroutineScope coroutineScope) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }

    public final void a(byte[] bArr) {
        (bArr != null ? Integer.valueOf(bArr.length) : POBCommonConstants.NULL_VALUE).toString();
        Bj bj = ((Nc) this).c;
        AbstractC4016g5 abstractC4016g5 = bj instanceof AbstractC4016g5 ? (AbstractC4016g5) bj : null;
        if (abstractC4016g5 != null) {
            abstractC4016g5.a(bArr);
        }
    }

    @Override // com.inmobi.media.InterfaceC4283qa
    public final void e() {
        Bj bj = ((Nc) this).c;
        InterfaceC4283qa interfaceC4283qa = bj instanceof InterfaceC4283qa ? (InterfaceC4283qa) bj : null;
        if (interfaceC4283qa != null) {
            interfaceC4283qa.e();
        }
    }

    @Override // com.inmobi.media.InterfaceC4009g
    public final void j() {
        Bj bj = ((Nc) this).c;
        InterfaceC4009g interfaceC4009g = bj instanceof InterfaceC4009g ? (InterfaceC4009g) bj : null;
        if (interfaceC4009g != null) {
            interfaceC4009g.j();
        }
    }

    public final void c() {
        Bj bj = ((Nc) this).c;
        AbstractC4016g5 abstractC4016g5 = bj instanceof AbstractC4016g5 ? (AbstractC4016g5) bj : null;
        if (abstractC4016g5 == null) {
            Xb.a((byte) 1, "InMobi", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            return;
        }
        C4493y9 c4493y9 = abstractC4016g5.e;
        if (c4493y9 != null) {
            c4493y9.a("AUM-CreatedState", "fetch called");
        }
        C3903c0 c3903c0 = abstractC4016g5.f;
        c3903c0.getClass();
        c3903c0.a = SystemClock.elapsedRealtime();
        C4167m0 c4167m0 = abstractC4016g5.g;
        BuildersKt__Builders_commonKt.launch$default(c4167m0.a, null, null, new C3983f0(c4167m0, null), 3, null);
        if (abstractC4016g5.b()) {
            C4493y9 c4493y92 = abstractC4016g5.e;
            if (c4493y92 != null) {
                c4493y92.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C4248p1 adManagerComponent = abstractC4016g5.h;
        Nc stateMachine = abstractC4016g5.j;
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        C4232ob adUnitTimeout = new C4232ob(adManagerComponent, stateMachine);
        C4024gd c4024gd = (C4024gd) abstractC4016g5;
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        C4493y9 c4493y93 = c4024gd.e;
        if (c4493y93 != null) {
            c4493y93.a("AUM-NativeCreatedState", "transitionToFetchingState");
        }
        c4024gd.m.a(new C4234od(c4024gd.k, adUnitTimeout, c4024gd.m, c4024gd.l), c4024gd);
    }

    public final void g() {
        Bj bj = ((Nc) this).c;
        Mi mi = bj instanceof Mi ? (Mi) bj : null;
        if (mi != null) {
            InterfaceC4466x9 l = mi.l();
            if (l != null) {
                ((C4493y9) l).a("AUM-RenderedState", "onAdImpression");
            }
            X4.a(mi.k(), new Ki(mi, null));
        }
    }

    public final void a(InMobiAdRequestStatus status, short s) {
        Intrinsics.checkNotNullParameter(status, "status");
        Objects.toString(status);
        Bj bj = ((Nc) this).c;
        AbstractC4442wb abstractC4442wb = bj instanceof AbstractC4442wb ? (AbstractC4442wb) bj : null;
        if (abstractC4442wb != null) {
            Intrinsics.checkNotNullParameter(status, "status");
            InterfaceC4466x9 l = abstractC4442wb.l();
            if (l != null) {
                ((C4493y9) l).b("AUM-LoadingState", "onLoadFailure");
            }
            abstractC4442wb.a(status, s);
        }
    }

    public final void a(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Objects.toString(params);
        Bj bj = ((Nc) this).c;
        Mi mi = bj instanceof Mi ? (Mi) bj : null;
        if (mi != null) {
            Intrinsics.checkNotNullParameter(params, "params");
            InterfaceC4466x9 l = mi.l();
            if (l != null) {
                ((C4493y9) l).a("AUM-RenderedState", com.ironsource.Zf.f);
            }
            X4.a(mi.k(), new Ji(mi, params, null));
        }
    }
}
