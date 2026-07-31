package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes13.dex */
public final class U6 extends AbstractC4249p2 {
    public final Map d;
    public final InMobiAdRequestStatus e;
    public final Uc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(Map payload, InMobiAdRequestStatus inMobiAdRequestStatus, AbstractC4353t1 adUnitTimeout, C4248p1 adManagerComponent, Uc publisherCallbacks, Nc stateMachine) {
        super(adUnitTimeout, adManagerComponent, stateMachine);
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, "inMobiAdRequestStatus");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.d = payload;
        this.e = inMobiAdRequestStatus;
        this.f = publisherCallbacks;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC4466x9 c = this.b.c();
        if (c != null) {
            ((C4493y9) c).b("AUM-FetchFailedState", "Initialized Called : " + this.d + " " + this.e.getStatusCode() + " " + this.e.getMessage());
        }
        X4.a(this.b.a(), new T6(this, null));
        C4167m0 b = this.b.b();
        Map payload = this.d;
        b.getClass();
        Intrinsics.checkNotNullParameter(payload, "payload");
        BuildersKt__Builders_commonKt.launch$default(b.a, null, null, new C4089j0(b, payload, null), 3, null);
        AbstractC4353t1 abstractC4353t1 = this.a;
        if (abstractC4353t1 != null) {
            abstractC4353t1.a();
        }
        j();
    }
}
