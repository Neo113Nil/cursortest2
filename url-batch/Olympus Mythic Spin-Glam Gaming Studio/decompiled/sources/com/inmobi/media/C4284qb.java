package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.qb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4284qb extends AbstractC4249p2 {
    public final short d;
    public final InMobiAdRequestStatus e;
    public final Uc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4284qb(short s, InMobiAdRequestStatus status, C4248p1 adManagerComponent, Uc publisherCallbacks, Nc stateMachine) {
        super(null, adManagerComponent, stateMachine);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.d = s;
        this.e = status;
        this.f = publisherCallbacks;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC4466x9 c = this.b.c();
        if (c != null) {
            short s = this.d;
            ((C4493y9) c).b("AUM-LoadDroppedState", "Initialize Called " + ((int) s) + " " + this.e.getStatusCode() + " " + this.e.getMessage());
        }
        X4.a(this.b.a(), new C4258pb(this, null));
        C4167m0 b = this.b.b();
        BuildersKt__Builders_commonKt.launch$default(b.a, null, null, new C4010g0(b, this.d, null), 3, null);
        AbstractC4353t1 abstractC4353t1 = this.a;
        if (abstractC4353t1 != null) {
            abstractC4353t1.a();
        }
        j();
    }
}
