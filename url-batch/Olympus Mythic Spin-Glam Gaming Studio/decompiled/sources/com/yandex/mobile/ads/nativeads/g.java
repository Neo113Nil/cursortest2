package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdBindingResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yads.ls3;
import yads.m12;
import yads.os3;
import yads.vz;
import yads.ws3;
import yads.wz;
import yads.xz;

/* loaded from: classes3.dex */
public class g implements NativeAd {
    public final m12 a;
    public final ws3 b;

    public g(m12 m12Var) {
        ws3 ws3Var = new ws3();
        this.a = m12Var;
        this.b = ws3Var;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final AdBindingResult bindNativeAd(NativeAdViewBinder nativeAdViewBinder) {
        xz a = this.a.a(i.a(nativeAdViewBinder));
        if (a instanceof wz) {
            return AdBindingResult.Success.INSTANCE;
        }
        if (!(a instanceof vz)) {
            throw new NoWhenBranchMatchedException();
        }
        vz vzVar = (vz) a;
        return new AdBindingResult.Failure(vzVar.a, vzVar.b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && Intrinsics.areEqual(((g) obj).a, this.a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdAssets getAdAssets() {
        return new ls3(this.a.getAdAssets());
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener) {
        this.a.a(nativeAdEventListener != null ? new os3(nativeAdEventListener) : null);
    }
}
