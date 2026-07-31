package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Wc extends Ej implements Ih, InterfaceC3898bl, InterfaceC3982f {
    public volatile Bj c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Wc(Rc nativeAdUnitComponent) {
        super(adComponent.a.e);
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        C4456x adComponent = nativeAdUnitComponent.a;
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.c = new C4050hd(nativeAdUnitComponent, this);
    }

    @Override // com.inmobi.media.Ej
    public final Bj a() {
        return this.c;
    }

    @Override // com.inmobi.media.InterfaceC3898bl
    public final void d() {
        Bj bj = this.c;
        InterfaceC3898bl interfaceC3898bl = bj instanceof InterfaceC3898bl ? (InterfaceC3898bl) bj : null;
        if (interfaceC3898bl != null) {
            interfaceC3898bl.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC3982f
    public final Object a(Continuation continuation) {
        Bj bj = this.c;
        InterfaceC3982f interfaceC3982f = bj instanceof InterfaceC3982f ? (InterfaceC3982f) bj : null;
        if (interfaceC3982f == null) {
            return Unit.INSTANCE;
        }
        Object a = interfaceC3982f.a(continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    @Override // com.inmobi.media.Ih
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        Bj bj = this.c;
        Ih ih = bj instanceof Ih ? (Ih) bj : null;
        if (ih != null) {
            ih.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.Ej
    public final void a(Bj bj) {
        Intrinsics.checkNotNullParameter(bj, "<set-?>");
        this.c = bj;
    }
}
