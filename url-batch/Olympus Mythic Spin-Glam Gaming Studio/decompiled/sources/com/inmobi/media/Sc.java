package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Sc implements Qo, InterfaceC3982f {
    public final Rc a;
    public final Wc b;

    public Sc(Rc nativeAdUnitComponent) {
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.a = nativeAdUnitComponent;
        this.b = new Wc(nativeAdUnitComponent);
    }

    public final void a() {
        Bj bj = this.b.c;
        He he = bj instanceof He ? (He) bj : null;
        if (he != null) {
            InterfaceC4466x9 l = he.l();
            if (l != null) {
                ((C4493y9) l).a("NativeRenderedState", "takeAction");
            }
            ((C4444wd) he.b.p.getValue()).b();
        }
    }

    @Override // com.inmobi.media.Qo
    public final String a(double d) {
        return Po.a(this.a.a, d);
    }

    @Override // com.inmobi.media.Qo
    public final String a(int i, double d) {
        return Po.a(this.a.a, i, d);
    }

    @Override // com.inmobi.media.InterfaceC3982f
    public final Object a(Continuation continuation) {
        Object a = this.b.a(continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }
}
