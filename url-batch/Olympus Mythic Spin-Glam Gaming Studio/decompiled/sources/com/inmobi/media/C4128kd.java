package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.kd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4128kd implements Bj, InterfaceC3982f {
    public final short a;
    public final InMobiAdRequestStatus b;
    public final Rc c;
    public final Wc d;

    public C4128kd(short s, InMobiAdRequestStatus status, Rc nativeAdUnitComponent, Wc stateMachine) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.a = s;
        this.b = status;
        this.c = nativeAdUnitComponent;
        this.d = stateMachine;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        C4493y9 c4493y9 = this.c.a.a.c;
        if (c4493y9 != null) {
            c4493y9.a("NativeFailedState", "Initialize Called");
        }
        this.c.c.a(this.b, this.a);
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3982f
    public final Object a(Continuation continuation) {
        C4493y9 c4493y9 = this.c.a.a.c;
        if (c4493y9 != null) {
            c4493y9.a("NativeFailedState", "onDestroy");
        }
        Object a = this.d.a(new C4076id(), this, (ContinuationImpl) continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }
}
