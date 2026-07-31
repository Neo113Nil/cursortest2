package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.sb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4336sb extends AbstractC4249p2 {
    public final Map d;
    public final InMobiAdRequestStatus e;
    public final Uc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4336sb(Map telemetryPayload, InMobiAdRequestStatus status, AbstractC4353t1 abstractC4353t1, E8 adManagerComponent, Uc publisherCallbacks, Nc stateMachine) {
        super(abstractC4353t1, adManagerComponent, stateMachine);
        Intrinsics.checkNotNullParameter(telemetryPayload, "telemetryPayload");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.d = telemetryPayload;
        this.e = status;
        this.f = publisherCallbacks;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC4466x9 c = this.b.c();
        if (c != null) {
            ((C4493y9) c).b("AUM-LoadFailedState", "Initialize Called " + this.d + " " + this.e.getStatusCode() + " " + this.e.getMessage());
        }
        X4.a(this.b.a(), new C4310rb(this, null));
        C4167m0 b = this.b.b();
        Map payload = this.d;
        b.getClass();
        Intrinsics.checkNotNullParameter(payload, "payload");
        BuildersKt__Builders_commonKt.launch$default(b.a, null, null, new C4037h0(b, payload, null), 3, null);
        AbstractC4353t1 abstractC4353t1 = this.a;
        if (abstractC4353t1 != null) {
            abstractC4353t1.a();
        }
        j();
    }
}
