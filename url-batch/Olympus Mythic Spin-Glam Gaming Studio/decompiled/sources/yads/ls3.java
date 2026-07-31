package yads;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ls3 implements NativeAdAssets {
    public final w00 a;

    public ls3(w00 w00Var) {
        this.a = w00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ls3) && Intrinsics.areEqual(this.a, ((ls3) obj).a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getBody() {
        return this.a.g;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getCallToAction() {
        return this.a.h;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getDomain() {
        return this.a.i;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getIcon() {
        y00 y00Var = this.a.c;
        if (y00Var != null) {
            return new ps3(y00Var);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final Float getRating() {
        return this.a.k;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getTitle() {
        return this.a.n;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdAssetsAdapter(assets=" + this.a + ")";
    }
}
